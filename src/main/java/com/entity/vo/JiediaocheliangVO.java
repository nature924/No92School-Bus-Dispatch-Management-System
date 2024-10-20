package com.entity.vo;

import com.entity.JiediaocheliangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 借调车辆
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-04-19 20:11:05
 */
public class JiediaocheliangVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 借调车辆
	 */
	
	private String jiediaocheliang;
		
	/**
	 * 借调时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jiediaoshijian;
		
	/**
	 * 驾驶员工号
	 */
	
	private String jiashiyuangonghao;
		
	/**
	 * 驾驶员姓名
	 */
	
	private String jiashiyuanxingming;
		
	/**
	 * 借调往来地点
	 */
	
	private String jiediaowanglaididian;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：借调车辆
	 */
	 
	public void setJiediaocheliang(String jiediaocheliang) {
		this.jiediaocheliang = jiediaocheliang;
	}
	
	/**
	 * 获取：借调车辆
	 */
	public String getJiediaocheliang() {
		return jiediaocheliang;
	}
				
	
	/**
	 * 设置：借调时间
	 */
	 
	public void setJiediaoshijian(Date jiediaoshijian) {
		this.jiediaoshijian = jiediaoshijian;
	}
	
	/**
	 * 获取：借调时间
	 */
	public Date getJiediaoshijian() {
		return jiediaoshijian;
	}
				
	
	/**
	 * 设置：驾驶员工号
	 */
	 
	public void setJiashiyuangonghao(String jiashiyuangonghao) {
		this.jiashiyuangonghao = jiashiyuangonghao;
	}
	
	/**
	 * 获取：驾驶员工号
	 */
	public String getJiashiyuangonghao() {
		return jiashiyuangonghao;
	}
				
	
	/**
	 * 设置：驾驶员姓名
	 */
	 
	public void setJiashiyuanxingming(String jiashiyuanxingming) {
		this.jiashiyuanxingming = jiashiyuanxingming;
	}
	
	/**
	 * 获取：驾驶员姓名
	 */
	public String getJiashiyuanxingming() {
		return jiashiyuanxingming;
	}
				
	
	/**
	 * 设置：借调往来地点
	 */
	 
	public void setJiediaowanglaididian(String jiediaowanglaididian) {
		this.jiediaowanglaididian = jiediaowanglaididian;
	}
	
	/**
	 * 获取：借调往来地点
	 */
	public String getJiediaowanglaididian() {
		return jiediaowanglaididian;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
			
}
