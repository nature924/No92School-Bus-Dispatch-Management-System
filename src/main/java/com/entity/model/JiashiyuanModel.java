package com.entity.model;

import com.entity.JiashiyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 驾驶员
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-04-19 20:11:05
 */
public class JiashiyuanModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 密码
	 */
	
	private String mima;
		
	/**
	 * 驾驶员姓名
	 */
	
	private String jiashiyuanxingming;
		
	/**
	 * 驾驶证号
	 */
	
	private String jiashizhenghao;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 驾龄
	 */
	
	private Integer jialing;
		
	/**
	 * 联系方式
	 */
	
	private String lianxifangshi;
		
	/**
	 * 驾驶车型
	 */
	
	private String jiashichexing;
		
	/**
	 * 职称
	 */
	
	private String zhicheng;
				
	
	/**
	 * 设置：密码
	 */
	 
	public void setMima(String mima) {
		this.mima = mima;
	}
	
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
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
	 * 设置：驾驶证号
	 */
	 
	public void setJiashizhenghao(String jiashizhenghao) {
		this.jiashizhenghao = jiashizhenghao;
	}
	
	/**
	 * 获取：驾驶证号
	 */
	public String getJiashizhenghao() {
		return jiashizhenghao;
	}
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：驾龄
	 */
	 
	public void setJialing(Integer jialing) {
		this.jialing = jialing;
	}
	
	/**
	 * 获取：驾龄
	 */
	public Integer getJialing() {
		return jialing;
	}
				
	
	/**
	 * 设置：联系方式
	 */
	 
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
				
	
	/**
	 * 设置：驾驶车型
	 */
	 
	public void setJiashichexing(String jiashichexing) {
		this.jiashichexing = jiashichexing;
	}
	
	/**
	 * 获取：驾驶车型
	 */
	public String getJiashichexing() {
		return jiashichexing;
	}
				
	
	/**
	 * 设置：职称
	 */
	 
	public void setZhicheng(String zhicheng) {
		this.zhicheng = zhicheng;
	}
	
	/**
	 * 获取：职称
	 */
	public String getZhicheng() {
		return zhicheng;
	}
			
}
