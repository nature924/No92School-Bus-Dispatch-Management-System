package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 车辆信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-04-19 20:11:05
 */
@TableName("cheliangxinxi")
public class CheliangxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public CheliangxinxiEntity() {
		
	}
	
	public CheliangxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 车辆车型
	 */
					
	private String cheliangchexing;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：车辆车型
	 */
	public void setCheliangchexing(String cheliangchexing) {
		this.cheliangchexing = cheliangchexing;
	}
	/**
	 * 获取：车辆车型
	 */
	public String getCheliangchexing() {
		return cheliangchexing;
	}
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
