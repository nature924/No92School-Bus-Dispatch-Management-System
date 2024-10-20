package com.entity.model;

import com.entity.CheliangyunyingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 车辆运营
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-04-19 20:11:05
 */
public class CheliangyunyingModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 车牌号码
	 */
	
	private String chepaihaoma;
		
	/**
	 * 车辆颜色
	 */
	
	private String cheliangyanse;
		
	/**
	 * 驾驶员工号
	 */
	
	private String jiashiyuangonghao;
		
	/**
	 * 驾驶员姓名
	 */
	
	private String jiashiyuanxingming;
		
	/**
	 * 油费
	 */
	
	private Float youfei;
		
	/**
	 * 维修费
	 */
	
	private Float weixiufei;
		
	/**
	 * 驾驶员工资
	 */
	
	private Float jiashiyuangongzi;
		
	/**
	 * 过路费
	 */
	
	private Float guolufei;
		
	/**
	 * 补贴
	 */
	
	private Float butie;
		
	/**
	 * 总金额
	 */
	
	private Float zongjine;
		
	/**
	 * 登记时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjishijian;
				
	
	/**
	 * 设置：车牌号码
	 */
	 
	public void setChepaihaoma(String chepaihaoma) {
		this.chepaihaoma = chepaihaoma;
	}
	
	/**
	 * 获取：车牌号码
	 */
	public String getChepaihaoma() {
		return chepaihaoma;
	}
				
	
	/**
	 * 设置：车辆颜色
	 */
	 
	public void setCheliangyanse(String cheliangyanse) {
		this.cheliangyanse = cheliangyanse;
	}
	
	/**
	 * 获取：车辆颜色
	 */
	public String getCheliangyanse() {
		return cheliangyanse;
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
	 * 设置：油费
	 */
	 
	public void setYoufei(Float youfei) {
		this.youfei = youfei;
	}
	
	/**
	 * 获取：油费
	 */
	public Float getYoufei() {
		return youfei;
	}
				
	
	/**
	 * 设置：维修费
	 */
	 
	public void setWeixiufei(Float weixiufei) {
		this.weixiufei = weixiufei;
	}
	
	/**
	 * 获取：维修费
	 */
	public Float getWeixiufei() {
		return weixiufei;
	}
				
	
	/**
	 * 设置：驾驶员工资
	 */
	 
	public void setJiashiyuangongzi(Float jiashiyuangongzi) {
		this.jiashiyuangongzi = jiashiyuangongzi;
	}
	
	/**
	 * 获取：驾驶员工资
	 */
	public Float getJiashiyuangongzi() {
		return jiashiyuangongzi;
	}
				
	
	/**
	 * 设置：过路费
	 */
	 
	public void setGuolufei(Float guolufei) {
		this.guolufei = guolufei;
	}
	
	/**
	 * 获取：过路费
	 */
	public Float getGuolufei() {
		return guolufei;
	}
				
	
	/**
	 * 设置：补贴
	 */
	 
	public void setButie(Float butie) {
		this.butie = butie;
	}
	
	/**
	 * 获取：补贴
	 */
	public Float getButie() {
		return butie;
	}
				
	
	/**
	 * 设置：总金额
	 */
	 
	public void setZongjine(Float zongjine) {
		this.zongjine = zongjine;
	}
	
	/**
	 * 获取：总金额
	 */
	public Float getZongjine() {
		return zongjine;
	}
				
	
	/**
	 * 设置：登记时间
	 */
	 
	public void setDengjishijian(Date dengjishijian) {
		this.dengjishijian = dengjishijian;
	}
	
	/**
	 * 获取：登记时间
	 */
	public Date getDengjishijian() {
		return dengjishijian;
	}
			
}
