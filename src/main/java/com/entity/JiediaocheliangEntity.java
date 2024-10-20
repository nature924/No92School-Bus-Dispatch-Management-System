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
 * 借调车辆
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-04-19 20:11:05
 */
@TableName("jiediaocheliang")
public class JiediaocheliangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiediaocheliangEntity() {
		
	}
	
	public JiediaocheliangEntity(T t) {
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
	 * 借调公司
	 */
					
	private String jiediaogongsi;
	
	/**
	 * 借调车辆
	 */
					
	private String jiediaocheliang;
	
	/**
	 * 借调时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	 * 设置：借调公司
	 */
	public void setJiediaogongsi(String jiediaogongsi) {
		this.jiediaogongsi = jiediaogongsi;
	}
	/**
	 * 获取：借调公司
	 */
	public String getJiediaogongsi() {
		return jiediaogongsi;
	}
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
