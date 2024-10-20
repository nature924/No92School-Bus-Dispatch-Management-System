package com.entity.model;

import com.entity.BaoxiaoshenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 报销申请
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-04-19 20:11:06
 */
public class BaoxiaoshenqingModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 驾驶员工号
	 */
	
	private String jiashiyuangonghao;
		
	/**
	 * 驾驶员姓名
	 */
	
	private String jiashiyuanxingming;
		
	/**
	 * 报销项目
	 */
	
	private String baoxiaoxiangmu;
		
	/**
	 * 报销金额
	 */
	
	private String baoxiaojine;
		
	/**
	 * 凭证
	 */
	
	private String pingzheng;
		
	/**
	 * 申请时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shenqingshijian;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
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
	 * 设置：报销项目
	 */
	 
	public void setBaoxiaoxiangmu(String baoxiaoxiangmu) {
		this.baoxiaoxiangmu = baoxiaoxiangmu;
	}
	
	/**
	 * 获取：报销项目
	 */
	public String getBaoxiaoxiangmu() {
		return baoxiaoxiangmu;
	}
				
	
	/**
	 * 设置：报销金额
	 */
	 
	public void setBaoxiaojine(String baoxiaojine) {
		this.baoxiaojine = baoxiaojine;
	}
	
	/**
	 * 获取：报销金额
	 */
	public String getBaoxiaojine() {
		return baoxiaojine;
	}
				
	
	/**
	 * 设置：凭证
	 */
	 
	public void setPingzheng(String pingzheng) {
		this.pingzheng = pingzheng;
	}
	
	/**
	 * 获取：凭证
	 */
	public String getPingzheng() {
		return pingzheng;
	}
				
	
	/**
	 * 设置：申请时间
	 */
	 
	public void setShenqingshijian(Date shenqingshijian) {
		this.shenqingshijian = shenqingshijian;
	}
	
	/**
	 * 获取：申请时间
	 */
	public Date getShenqingshijian() {
		return shenqingshijian;
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
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
