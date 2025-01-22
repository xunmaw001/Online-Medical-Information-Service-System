<template>
	<view class="content">
		<form class="app-update-pv">
			 
			<view :style='{"padding":"0 16rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 20rpx 0","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(161, 161, 161, 1)","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">医生工号</view>
				<input :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","borderColor":"rgba(31, 165, 216, 1)","backgroundColor":"rgba(120, 218, 255, 1)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"20rpx 0","borderWidth":"0 10rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"60rpx"}' :disabled="ro.yishenggonghao" v-model="ruleForm.yishenggonghao" placeholder="医生工号"></input>
			</view>
			<view :style='{"padding":"0 16rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 20rpx 0","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(161, 161, 161, 1)","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">密码</view>
				<input :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","borderColor":"rgba(31, 165, 216, 1)","backgroundColor":"rgba(120, 218, 255, 1)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"20rpx 0","borderWidth":"0 10rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"60rpx"}' :disabled="ro.mima" v-model="ruleForm.mima" placeholder="密码"></input>
			</view>
			<view :style='{"padding":"0 16rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 20rpx 0","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(161, 161, 161, 1)","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">医生姓名</view>
				<input :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","borderColor":"rgba(31, 165, 216, 1)","backgroundColor":"rgba(120, 218, 255, 1)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"20rpx 0","borderWidth":"0 10rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"60rpx"}' :disabled="ro.yishengxingming" v-model="ruleForm.yishengxingming" placeholder="医生姓名"></input>
			</view>
			<view :style='{"padding":"0 16rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#ccc","margin":"0 0 20rpx 0","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group" @tap="zhaopianTap">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(161, 161, 161, 1)","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">照片</view>
				<view class="right-input" style="padding:0">
					<image :style='{"padding":"0","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","borderRadius":"100%","borderWidth":"0","width":"88rpx","borderStyle":"solid","height":"88rpx"}' class="avator" v-if="ruleForm.zhaopian" :src="baseUrl+ruleForm.zhaopian" mode="aspectFill"></image>
					<image :style='{"padding":"0","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","borderRadius":"100%","borderWidth":"0","width":"88rpx","borderStyle":"solid","height":"88rpx"}' class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
				</view>
			</view>
			<view :style='{"padding":"0 16rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#ccc","margin":"0 0 20rpx 0","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group select">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(161, 161, 161, 1)","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">性别</view>
				<picker @change="xingbieChange" :value="xingbieIndex"  :range="xingbieOptions">
					<view :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","backgroundColor":"rgba(120, 218, 255, 1)","borderColor":"rgba(31, 165, 216, 1)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"20rpx 0","borderWidth":"0 10rpx","width":"calc(100% - 160rpx)","lineHeight":"60rpx","fontSize":"28rpx","borderStyle":"solid"}' class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
				</picker>
			</view>
			<view :style='{"padding":"0 16rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 20rpx 0","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(161, 161, 161, 1)","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">年龄</view>
				<input :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","borderColor":"rgba(31, 165, 216, 1)","backgroundColor":"rgba(120, 218, 255, 1)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"20rpx 0","borderWidth":"0 10rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"60rpx"}' :disabled="ro.nianling" v-model="ruleForm.nianling" placeholder="年龄"></input>
			</view>
			<view :style='{"padding":"0 16rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 20rpx 0","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(161, 161, 161, 1)","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">手机</view>
				<input :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","borderColor":"rgba(31, 165, 216, 1)","backgroundColor":"rgba(120, 218, 255, 1)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"20rpx 0","borderWidth":"0 10rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"60rpx"}' :disabled="ro.shouji" v-model="ruleForm.shouji" placeholder="手机"></input>
			</view>
			<view :style='{"padding":"0 16rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 20rpx 0","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(161, 161, 161, 1)","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">学历</view>
				<input :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","borderColor":"rgba(31, 165, 216, 1)","backgroundColor":"rgba(120, 218, 255, 1)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"20rpx 0","borderWidth":"0 10rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"60rpx"}' :disabled="ro.xueli" v-model="ruleForm.xueli" placeholder="学历"></input>
			</view>
			<view :style='{"padding":"0 16rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 20rpx 0","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(161, 161, 161, 1)","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">医龄</view>
				<input :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","borderColor":"rgba(31, 165, 216, 1)","backgroundColor":"rgba(120, 218, 255, 1)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"20rpx 0","borderWidth":"0 10rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"60rpx"}' :disabled="ro.yiling" v-model="ruleForm.yiling" placeholder="医龄"></input>
			</view>
			<view :style='{"padding":"0 16rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 20rpx 0","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(161, 161, 161, 1)","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">教育背景</view>
				<input :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","borderColor":"rgba(31, 165, 216, 1)","backgroundColor":"rgba(120, 218, 255, 1)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"20rpx 0","borderWidth":"0 10rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"60rpx"}' :disabled="ro.jiaoyubeijing" v-model="ruleForm.jiaoyubeijing" placeholder="教育背景"></input>
			</view>
			<view :style='{"padding":"0 16rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 20rpx 0","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(161, 161, 161, 1)","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">毕业学校</view>
				<input :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","borderColor":"rgba(31, 165, 216, 1)","backgroundColor":"rgba(120, 218, 255, 1)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"20rpx 0","borderWidth":"0 10rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"60rpx"}' :disabled="ro.biyexuexiao" v-model="ruleForm.biyexuexiao" placeholder="毕业学校"></input>
			</view>
			
			<!-- 否 -->
 

			<view :style='{"padding":"12rpx 16rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#ccc","margin":"0 0 20rpx 0","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(161, 161, 161, 1)","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">工作经历</view>
				<textarea :style='{"padding":"20rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","backgroundColor":"rgba(120, 218, 255, 1)","borderColor":"rgba(31, 165, 216, 1)","borderRadius":"20rpx 0","color":"rgba(0, 0, 0, 1)","borderWidth":"0 10rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"240rpx"}' v-model="ruleForm.gongzuojingli" placeholder="工作经历"></textarea>
			</view>
			
			<view :style='{"padding":"12rpx 16rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#ccc","margin":"0 0 20rpx 0","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(161, 161, 161, 1)","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">详细信息</view>
				<textarea :style='{"padding":"20rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","backgroundColor":"rgba(120, 218, 255, 1)","borderColor":"rgba(31, 165, 216, 1)","borderRadius":"20rpx 0","color":"rgba(0, 0, 0, 1)","borderWidth":"0 10rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"240rpx"}' v-model="ruleForm.xiangxixinxi" placeholder="详细信息"></textarea>
			</view>
			
			<view class="btn" >
				<button :style='{"padding":"0","boxShadow":"0px 6rpx 12rpx rgba(0, 0, 0, 0.16)","margin":"20rpx auto","backgroundColor":"rgba(120, 218, 255, 1)","borderColor":"#409EFF","borderRadius":"20rpx 0","color":"#fff","borderWidth":"0","width":"60%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' @tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

		<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="clicktimeConfirm" ref="clicktime" themeColor="#333333"></w-picker>
			
	</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";

	export default {
		data() {
			return {
				cross:'',
				ruleForm: {
				yishenggonghao: '',
				mima: '',
				yishengxingming: '',
				zhaopian: '',
				xingbie: '',
				nianling: '',
				shouji: '',
				xueli: '',
				yiling: '',
				jiaoyubeijing: '',
				gongzuojingli: '',
				biyexuexiao: '',
				xiangxixinxi: '',
				},
				xingbieOptions: [],
				xingbieIndex: 0,
				// 登陆用户信息
				user: {},
                                ro:{
                                   yishenggonghao : false,
                                   mima : false,
                                   yishengxingming : false,
                                   zhaopian : false,
                                   xingbie : false,
                                   nianling : false,
                                   shouji : false,
                                   xueli : false,
                                   yiling : false,
                                   jiaoyubeijing : false,
                                   gongzuojingli : false,
                                   biyexuexiao : false,
                                   xiangxixinxi : false,
                                   thumbsupnum : false,
                                   crazilynum : false,
                                   clicktime : false,
                                   clicknum : false,
                                },
			}
		},
		components: {
			wPicker
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			},



		},
		async onLoad(options) {
			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			
			// ss读取


			// 自定义下拉框值
			this.xingbieOptions = "男,女".split(',')

			// 如果有登陆，获取登陆后保存的userid
			this.ruleForm.userid = uni.getStorageSync("userid")
			if (options.refid) {
				// 如果上一级页面传递了refid，获取改refid数据信息
				this.ruleForm.refid = options.refid;
				this.ruleForm.nickname = uni.getStorageSync("nickname");
			}
			// 如果是更新操作
			if (options.id) {
				this.ruleForm.id = options.id;
				// 获取信息
				res = await this.$api.info(`yisheng`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			// 跨表
			this.cross = options.cross;
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
					if(o=='yishenggonghao'){
					this.ruleForm.yishenggonghao = obj[o];
					this.ro.yishenggonghao = true;
					continue;
					}
					if(o=='mima'){
					this.ruleForm.mima = obj[o];
					this.ro.mima = true;
					continue;
					}
					if(o=='yishengxingming'){
					this.ruleForm.yishengxingming = obj[o];
					this.ro.yishengxingming = true;
					continue;
					}
					if(o=='zhaopian'){
					this.ruleForm.zhaopian = obj[o];
					this.ro.zhaopian = true;
					continue;
					}
					if(o=='xingbie'){
					this.ruleForm.xingbie = obj[o];
					this.ro.xingbie = true;
					continue;
					}
					if(o=='nianling'){
					this.ruleForm.nianling = obj[o];
					this.ro.nianling = true;
					continue;
					}
					if(o=='shouji'){
					this.ruleForm.shouji = obj[o];
					this.ro.shouji = true;
					continue;
					}
					if(o=='xueli'){
					this.ruleForm.xueli = obj[o];
					this.ro.xueli = true;
					continue;
					}
					if(o=='yiling'){
					this.ruleForm.yiling = obj[o];
					this.ro.yiling = true;
					continue;
					}
					if(o=='jiaoyubeijing'){
					this.ruleForm.jiaoyubeijing = obj[o];
					this.ro.jiaoyubeijing = true;
					continue;
					}
					if(o=='gongzuojingli'){
					this.ruleForm.gongzuojingli = obj[o];
					this.ro.gongzuojingli = true;
					continue;
					}
					if(o=='biyexuexiao'){
					this.ruleForm.biyexuexiao = obj[o];
					this.ro.biyexuexiao = true;
					continue;
					}
					if(o=='xiangxixinxi'){
					this.ruleForm.xiangxixinxi = obj[o];
					this.ro.xiangxixinxi = true;
					continue;
					}
					if(o=='thumbsupnum'){
					this.ruleForm.thumbsupnum = obj[o];
					this.ro.thumbsupnum = true;
					continue;
					}
					if(o=='crazilynum'){
					this.ruleForm.crazilynum = obj[o];
					this.ro.crazilynum = true;
					continue;
					}
					if(o=='clicktime'){
					this.ruleForm.clicktime = obj[o];
					this.ro.clicktime = true;
					continue;
					}
					if(o=='clicknum'){
					this.ruleForm.clicknum = obj[o];
					this.ro.clicknum = true;
					continue;
					}
				}
			}
			this.styleChange()
		},
		methods: {
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.app-update-pv .cu-form-group .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.addUpdateForm.input.content.backgroundColor
					// })
				})
			},

			// 多级联动参数


			// 日长控件选择日期时间
			clicktimeConfirm(val) {
				console.log(val)
				this.ruleForm.clicktime = val.result;
				this.$forceUpdate();
			},

			// 下拉变化
			xingbieChange(e) {
				this.xingbieIndex = e.target.value
				this.ruleForm.xingbie = this.xingbieOptions[this.xingbieIndex]
			},

			zhaopianTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.zhaopian = 'upload/' + res.file;
					_this.$forceUpdate();
					_this.$nextTick(()=>{
						_this.styleChange()
					})
				});
			},

			getUUID () {
				return new Date().getTime();
			},
			async onSubmitTap() {



































//跨表计算判断
				if(this.ruleForm.yiling&&(!this.$validate.isIntNumer(this.ruleForm.yiling))){
					this.$utils.msg(`医龄应输入整数`);
					return
				}
				if(this.ruleForm.thumbsupnum&&(!this.$validate.isIntNumer(this.ruleForm.thumbsupnum))){
					this.$utils.msg(`赞应输入整数`);
					return
				}
				if(this.ruleForm.crazilynum&&(!this.$validate.isIntNumer(this.ruleForm.crazilynum))){
					this.$utils.msg(`踩应输入整数`);
					return
				}
				if(this.ruleForm.clicknum&&(!this.$validate.isIntNumer(this.ruleForm.clicknum))){
					this.$utils.msg(`点击次数应输入整数`);
					return
				}
				//更新跨表属性
			       var crossuserid;
			       var crossrefid;
			       var crossoptnum;
				if(this.cross){
					var statusColumnName = uni.getStorageSync('statusColumnName');
					var statusColumnValue = uni.getStorageSync('statusColumnValue');
					if(statusColumnName!='') {
						var obj = uni.getStorageSync('crossObj');
						if(!statusColumnName.startsWith("[")) {
							for (var o in obj){
								if(o==statusColumnName){
									obj[o] = statusColumnValue;
								}

							}
							var table = uni.getStorageSync('crossTable');
							await this.$api.update(`${table}`, obj);
						} else {
						       crossuserid=Number(uni.getStorageSync('userid'));
						       crossrefid=obj['id'];
						       crossoptnum=uni.getStorageSync('statusColumnName');
						       crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
						}
					}
				}
				if(crossrefid && crossuserid) {
					this.ruleForm.crossuserid=crossuserid;
					this.ruleForm.crossrefid=crossrefid;
					let params = {
						page: 1,
						limit:10,
						crossuserid:crossuserid,
						crossrefid:crossrefid,
					}
					let res = await this.$api.list(`yisheng`, params);
					if (res.data.total >= crossoptnum) {
						this.$utils.msg(uni.getStorageSync('tips'));
						return false;
					} else {
                //跨表计算
						if(this.ruleForm.id){
							await this.$api.update(`yisheng`, this.ruleForm);
						}else{
							await this.$api.add(`yisheng`, this.ruleForm);
						}
						this.$utils.msgBack('提交成功');
					}
				} else {
                //跨表计算
					if(this.ruleForm.id){
						await this.$api.update(`yisheng`, this.ruleForm);
					}else{
						await this.$api.add(`yisheng`, this.ruleForm);
					}
					this.$utils.msgBack('提交成功');
				}
			},
			optionsChange(e) {
				this.index = e.target.value
			},
			bindDateChange(e) {
				this.date = e.target.value
			},
			getDate(type) {
				const date = new Date();
				let year = date.getFullYear();
				let month = date.getMonth() + 1;
				let day = date.getDate();
				if (type === 'start') {
					year = year - 60;
				} else if (type === 'end') {
					year = year + 2;
				}
				month = month > 9 ? month : '0' + month;;
				day = day > 9 ? day : '0' + day;
				return `${year}-${month}-${day}`;
			},
			toggleTab(str) {
				this.$refs[str].show();
			}
		}
	}
</script>

<style lang="scss" scoped>
	.container {
		padding: 20upx;
	}
	
	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
		background-image: url(http://codegen.caihongy.cn/20220301/d67240b0559f478e8e8f98b806fde837.png);
		background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	textarea {
		border: 1upx solid #EEEEEE;
		border-radius: 20upx;
		padding: 20upx;
	}

	.title {
		width: 180upx;
	}

	.avator {
		width: 150upx;
		height: 60upx;
	}

	.right-input {
		flex: 1;
		text-align: left;
		padding: 0 24upx;
	}
	
	.cu-form-group.active {
		justify-content: space-between;
	}
	
	.btn {
	  display: flex;
	  align-items: center;
	  justify-content: center;
	  flex-wrap: wrap;
	  padding: 20upx 0;
	}
	
	.cu-form-group {
		padding: 0 24upx;
		background-color: transparent;
		min-height: inherit;
	}
	
	.cu-form-group+.cu-form-group {
		border: 0;
	}
	
	.cu-form-group uni-input {
		padding: 0 30upx;
	}
	
	.uni-input {
		padding: 0 30upx;
	}
	
	.cu-form-group uni-textarea {
		padding: 30upx;
		margin: 0;
	}
	
	.cu-form-group uni-picker::after {
		line-height: 60rpx;
	}
	
	.select .uni-input {
		line-height: 60rpx;
	}
	
	.input .right-input {
		line-height: 60rpx;
	}
</style>
