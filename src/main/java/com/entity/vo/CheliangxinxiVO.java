package com.entity.vo;

import com.entity.CheliangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 车辆信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-04-19 20:11:05
 */
public class CheliangxinxiVO  implements Serializable {
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
	 * 检修状态
	 */
	
	private String jianxiuzhuangtai;
		
	/**
	 * 使用年限
	 */
	
	private String shiyongnianxian;
		
	/**
	 * 载客量
	 */
	
	private String zaikeliang;
		
	/**
	 * 使用状态
	 */
	
	private String shiyongzhuangtai;
		
	/**
	 * 事故历史
	 */
	
	private String shigulishi;
				
	
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
	 * 设置：检修状态
	 */
	 
	public void setJianxiuzhuangtai(String jianxiuzhuangtai) {
		this.jianxiuzhuangtai = jianxiuzhuangtai;
	}
	
	/**
	 * 获取：检修状态
	 */
	public String getJianxiuzhuangtai() {
		return jianxiuzhuangtai;
	}
				
	
	/**
	 * 设置：使用年限
	 */
	 
	public void setShiyongnianxian(String shiyongnianxian) {
		this.shiyongnianxian = shiyongnianxian;
	}
	
	/**
	 * 获取：使用年限
	 */
	public String getShiyongnianxian() {
		return shiyongnianxian;
	}
				
	
	/**
	 * 设置：载客量
	 */
	 
	public void setZaikeliang(String zaikeliang) {
		this.zaikeliang = zaikeliang;
	}
	
	/**
	 * 获取：载客量
	 */
	public String getZaikeliang() {
		return zaikeliang;
	}
				
	
	/**
	 * 设置：使用状态
	 */
	 
	public void setShiyongzhuangtai(String shiyongzhuangtai) {
		this.shiyongzhuangtai = shiyongzhuangtai;
	}
	
	/**
	 * 获取：使用状态
	 */
	public String getShiyongzhuangtai() {
		return shiyongzhuangtai;
	}
				
	
	/**
	 * 设置：事故历史
	 */
	 
	public void setShigulishi(String shigulishi) {
		this.shigulishi = shigulishi;
	}
	
	/**
	 * 获取：事故历史
	 */
	public String getShigulishi() {
		return shigulishi;
	}
			
}
