<template>
<view class="content">
	<view class="box" :style='{"padding":"48rpx","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"20rpx auto","borderColor":"#ccc","backgroundColor":"rgba(243, 243, 243, 0.73)","borderRadius":"20rpx","borderWidth":"0","width":"90%","borderStyle":"solid","height":"auto"}'>
		<view class="logo" :style='{"padding":"0","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0 0 24rpx","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="true">
			<image :style='{"padding":"0","boxShadow":"0 0 0px #59f43e","margin":"0 auto","borderColor":"#ccc","borderRadius":"50%","borderWidth":"0","width":"160rpx","borderStyle":"solid","url":"http://codegen.caihongy.cn/20220301/71ec7e24ae4c450783b0deb587f2cb6c.jpg","isShow":true,"height":"160rpx"}' src='http://codegen.caihongy.cn/20220301/71ec7e24ae4c450783b0deb587f2cb6c.jpg' mode="aspectFill"></image>
		</view>
		<view :style='{"padding":"0","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0 0 24rpx","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
			<input :style='{"padding":"0 24rpx","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0, 0, 0, 1)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0 0 4rpx","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}'  v-model="ruleForm.yonghuzhanghao"  type="text"  class="uni-input" name="" placeholder="用户账号" />
		</view>
		<view :style='{"padding":"0","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0 0 24rpx","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
			<input :style='{"padding":"0 24rpx","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0, 0, 0, 1)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0 0 4rpx","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}'  v-model="ruleForm.mima" type="password"  class="uni-input" name="" placeholder="密码" />
		</view>
        <view :style='{"padding":"0","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0 0 24rpx","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
            <input :style='{"padding":"0 24rpx","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0, 0, 0, 1)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0 0 4rpx","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.mima2" type="password" class="uni-input" name="" placeholder="确认密码" />
        </view>
		<view :style='{"padding":"0","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0 0 24rpx","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
			<input :style='{"padding":"0 24rpx","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0, 0, 0, 1)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0 0 4rpx","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}'  v-model="ruleForm.yonghuxingming"  type="text"  class="uni-input" name="" placeholder="用户姓名" />
		</view>
		<view :style='{"padding":"0","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0 0 24rpx","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
			<picker  @change="yonghuxingbieChange" :value="yonghuxingbieIndex" :range="yonghuxingbieOptions">
				<view :style='{"padding":"0 24rpx","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0, 0, 0, 1)","backgroundColor":"rgba(0,0,0,0)","color":"#333","textAlign":"left","borderRadius":"0","borderWidth":"0 0 4rpx","width":"100%","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}'  class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
			</picker>
		</view>
		<view :style='{"padding":"0","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0 0 24rpx","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
			<input :style='{"padding":"0 24rpx","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0, 0, 0, 1)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0 0 4rpx","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}'  v-model="ruleForm.nianling"  type="text"  class="uni-input" name="" placeholder="年龄" />
		</view>
		<view :style='{"padding":"0","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0 0 24rpx","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
			<input :style='{"padding":"0 24rpx","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0, 0, 0, 1)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0 0 4rpx","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}'  v-model="ruleForm.lianxidianhua"  type="text"  class="uni-input" name="" placeholder="联系电话" />
		</view>
		<view :style='{"padding":"0","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0 0 24rpx","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='yisheng'" class="uni-form-item uni-column">
			<input :style='{"padding":"0 24rpx","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0, 0, 0, 1)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0 0 4rpx","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}'  v-model="ruleForm.yishenggonghao"  type="text"  class="uni-input" name="" placeholder="医生工号" />
		</view>
		<view :style='{"padding":"0","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0 0 24rpx","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='yisheng'" class="uni-form-item uni-column">
			<input :style='{"padding":"0 24rpx","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0, 0, 0, 1)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0 0 4rpx","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}'  v-model="ruleForm.mima" type="password"  class="uni-input" name="" placeholder="密码" />
		</view>
        <view :style='{"padding":"0","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0 0 24rpx","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='yisheng'" class="uni-form-item uni-column">
            <input :style='{"padding":"0 24rpx","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0, 0, 0, 1)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0 0 4rpx","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.mima2" type="password" class="uni-input" name="" placeholder="确认密码" />
        </view>
		<view :style='{"padding":"0","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0 0 24rpx","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='yisheng'" class="uni-form-item uni-column">
			<input :style='{"padding":"0 24rpx","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0, 0, 0, 1)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0 0 4rpx","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}'  v-model="ruleForm.yishengxingming"  type="text"  class="uni-input" name="" placeholder="医生姓名" />
		</view>
		<view :style='{"padding":"0","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0 0 24rpx","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='yisheng'" class="uni-form-item uni-column">
			<picker  @change="yishengxingbieChange" :value="yishengxingbieIndex" :range="yishengxingbieOptions">
				<view :style='{"padding":"0 24rpx","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0, 0, 0, 1)","backgroundColor":"rgba(0,0,0,0)","color":"#333","textAlign":"left","borderRadius":"0","borderWidth":"0 0 4rpx","width":"100%","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}'  class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
			</picker>
		</view>
		<view :style='{"padding":"0","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0 0 24rpx","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='yisheng'" class="uni-form-item uni-column">
			<input :style='{"padding":"0 24rpx","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0, 0, 0, 1)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0 0 4rpx","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}'  v-model="ruleForm.nianling"  type="text"  class="uni-input" name="" placeholder="年龄" />
		</view>
		<view :style='{"padding":"0","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0 0 24rpx","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='yisheng'" class="uni-form-item uni-column">
			<input :style='{"padding":"0 24rpx","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0, 0, 0, 1)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0 0 4rpx","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}'  v-model="ruleForm.shouji"  type="text"  class="uni-input" name="" placeholder="手机" />
		</view>
		<view :style='{"padding":"0","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0 0 24rpx","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='yisheng'" class="uni-form-item uni-column">
			<input :style='{"padding":"0 24rpx","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0, 0, 0, 1)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0 0 4rpx","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}'  v-model="ruleForm.xueli"  type="text"  class="uni-input" name="" placeholder="学历" />
		</view>
		<view :style='{"padding":"0","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0 0 24rpx","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='yisheng'" class="uni-form-item uni-column">
			<input :style='{"padding":"0 24rpx","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0, 0, 0, 1)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0 0 4rpx","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}'  v-model="ruleForm.yiling"  type="text"  class="uni-input" name="" placeholder="医龄" />
		</view>
		<view :style='{"padding":"0","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0 0 24rpx","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='yisheng'" class="uni-form-item uni-column">
			<input :style='{"padding":"0 24rpx","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0, 0, 0, 1)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0 0 4rpx","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}'  v-model="ruleForm.jiaoyubeijing"  type="text"  class="uni-input" name="" placeholder="教育背景" />
		</view>
		<view :style='{"padding":"0","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0 0 24rpx","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='yisheng'" class="uni-form-item uni-column">
			<input :style='{"padding":"0 24rpx","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0, 0, 0, 1)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0 0 4rpx","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}'  v-model="ruleForm.biyexuexiao"  type="text"  class="uni-input" name="" placeholder="毕业学校" />
		</view>
		<button class="btn-submit" @tap="register" type="primary" :style='{"padding":"0","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0 auto","borderColor":"rgba(31, 165, 216, 1)","backgroundColor":"rgba(120, 218, 255, 1)","borderRadius":"40rpx","color":"rgba(255, 255, 255, 1)","borderWidth":"10rpx 0","width":"30%","fontSize":"32rpx","borderStyle":"solid","height":"88rpx"}'>注册</button>
	</view>
</view>
</template>

<style>
	.btn-submit {
		height: auto !important;
		line-height: 88rpx;
	}
</style>
<script>
	export default {
		data() {
			return {
                                yonghuxingbieOptions: [],
                                yonghuxingbieIndex: 0,
                                yishengxingbieOptions: [],
                                yishengxingbieIndex: 0,
				ruleForm: {
				},
				emailcode: "",
				tableName:""
			}
		},
		async onLoad() {
			let res = [];
			let table = uni.getStorageSync("loginTable");
	    		this.tableName = table;

                        // 自定义下拉框值
			if(this.tableName=='yonghu'){
                this.yonghuxingbieOptions = "男,女".split(',');
				this.ruleForm.xingbie=this.yonghuxingbieOptions[0]
			}
                        // 自定义下拉框值
			if(this.tableName=='yisheng'){
                this.yishengxingbieOptions = "男,女".split(',');
				this.ruleForm.xingbie=this.yishengxingbieOptions[0]
			}
			
			this.styleChange()
		},
		methods: {

                        // 下拉变化
                        yonghuxingbieChange(e) {
                                this.yonghuxingbieIndex = e.target.value
                                this.ruleForm.xingbie = this.yonghuxingbieOptions[this.yonghuxingbieIndex]
                        },
                        // 下拉变化
                        yishengxingbieChange(e) {
                                this.yishengxingbieIndex = e.target.value
                                this.ruleForm.xingbie = this.yishengxingbieOptions[this.yishengxingbieIndex]
                        },

			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.uni-input .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.registerFrom.content.input.backgroundColor
					// })
				})
			},
			// 获取uuid
			getUUID () {
				return new Date().getTime();
			},
			// 注册
			async register() {
				if((!this.ruleForm.yonghuzhanghao) && `yonghu` == this.tableName){
					this.$utils.msg(`用户账号不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `yonghu` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
                if(`yonghu` == this.tableName && (this.ruleForm.mima!=this.ruleForm.mima2)){
                    this.$utils.msg(`两次密码输入不一致`);
                    return
                }
				if((!this.ruleForm.yonghuxingming) && `yonghu` == this.tableName){
					this.$utils.msg(`用户姓名不能为空`);
					return
				}
				if(`yonghu` == this.tableName && this.ruleForm.nianling&&(!this.$validate.isIntNumer(this.ruleForm.nianling))){
					this.$utils.msg(`年龄应输入整数`);
					return
				}
				if(`yonghu` == this.tableName && this.ruleForm.lianxidianhua&&(!this.$validate.isMobile(this.ruleForm.lianxidianhua))){
					this.$utils.msg(`联系电话应输入手机格式`);
					return
				}
                if(`yisheng` == this.tableName && (this.ruleForm.mima!=this.ruleForm.mima2)){
                    this.$utils.msg(`两次密码输入不一致`);
                    return
                }
				if(`yisheng` == this.tableName && this.ruleForm.yiling&&(!this.$validate.isIntNumer(this.ruleForm.yiling))){
					this.$utils.msg(`医龄应输入整数`);
					return
				}
				if(`yisheng` == this.tableName && this.ruleForm.thumbsupnum&&(!this.$validate.isIntNumer(this.ruleForm.thumbsupnum))){
					this.$utils.msg(`赞应输入整数`);
					return
				}
				if(`yisheng` == this.tableName && this.ruleForm.crazilynum&&(!this.$validate.isIntNumer(this.ruleForm.crazilynum))){
					this.$utils.msg(`踩应输入整数`);
					return
				}
				if(`yisheng` == this.tableName && this.ruleForm.clicknum&&(!this.$validate.isIntNumer(this.ruleForm.clicknum))){
					this.$utils.msg(`点击次数应输入整数`);
					return
				}
				await this.$api.register(`${this.tableName}`, this.ruleForm, this.emailcode);
				this.$utils.msgBack('注册成功');;
			}
		}
	}
</script>

<style lang="scss" scoped>
	$color-primary: #b49950;
	.content {
		height: calc(100vh - 44px);
		overflow: auto;
	}
	
	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
				background-image: url(http://codegen.caihongy.cn/20220301/505ec80801ae48f4ac4c85fdcbace8e6.png);
				background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	.logo {
		text-align: center;

		image {
			height: 200upx;
			width: 200upx;
			margin: 0 0 60upx;
		}
	}

	.uni-form-item {
		margin-bottom: 40upx;
		padding: 0;

		.uni-input {
			font-size: 30upx;
			padding: 7px 0;
		}
	}

	button[type="primary"] {
		background-color: $color-primary;
		border-radius: 0;
		font-size: 34upx;
		margin-top: 60upx;
	}

	.links {
		text-align: center;
		margin-top: 40upx;
		font-size: 26upx;
		color: #999;

		view {
			display: inline-block;
			vertical-align: top;
			margin: 0 10upx;
		}

		.link-highlight {
			color: $color-primary
		}
	}
.picker-select-input {
	line-height: 88rpx;
}

</style>
