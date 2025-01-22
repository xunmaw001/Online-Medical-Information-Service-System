package com.entity.vo;

import com.entity.JiuzhenjieguoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 就诊结果
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-02 16:37:02
 */
public class JiuzhenjieguoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 医生工号
	 */
	
	private String yishenggonghao;
		
	/**
	 * 医生姓名
	 */
	
	private String yishengxingming;
		
	/**
	 * 当班诊室
	 */
	
	private String dangbanzhenshi;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 诊断报告
	 */
	
	private String zhenduanbaogao;
		
	/**
	 * 复查日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fuchariqi;
		
	/**
	 * 医生嘱咐
	 */
	
	private String yishengzhufu;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：医生工号
	 */
	 
	public void setYishenggonghao(String yishenggonghao) {
		this.yishenggonghao = yishenggonghao;
	}
	
	/**
	 * 获取：医生工号
	 */
	public String getYishenggonghao() {
		return yishenggonghao;
	}
				
	
	/**
	 * 设置：医生姓名
	 */
	 
	public void setYishengxingming(String yishengxingming) {
		this.yishengxingming = yishengxingming;
	}
	
	/**
	 * 获取：医生姓名
	 */
	public String getYishengxingming() {
		return yishengxingming;
	}
				
	
	/**
	 * 设置：当班诊室
	 */
	 
	public void setDangbanzhenshi(String dangbanzhenshi) {
		this.dangbanzhenshi = dangbanzhenshi;
	}
	
	/**
	 * 获取：当班诊室
	 */
	public String getDangbanzhenshi() {
		return dangbanzhenshi;
	}
				
	
	/**
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：诊断报告
	 */
	 
	public void setZhenduanbaogao(String zhenduanbaogao) {
		this.zhenduanbaogao = zhenduanbaogao;
	}
	
	/**
	 * 获取：诊断报告
	 */
	public String getZhenduanbaogao() {
		return zhenduanbaogao;
	}
				
	
	/**
	 * 设置：复查日期
	 */
	 
	public void setFuchariqi(Date fuchariqi) {
		this.fuchariqi = fuchariqi;
	}
	
	/**
	 * 获取：复查日期
	 */
	public Date getFuchariqi() {
		return fuchariqi;
	}
				
	
	/**
	 * 设置：医生嘱咐
	 */
	 
	public void setYishengzhufu(String yishengzhufu) {
		this.yishengzhufu = yishengzhufu;
	}
	
	/**
	 * 获取：医生嘱咐
	 */
	public String getYishengzhufu() {
		return yishengzhufu;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
