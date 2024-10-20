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
 * 驾驶员
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-04-19 20:11:05
 */
@TableName("jiashiyuan")
public class JiashiyuanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiashiyuanEntity() {
		
	}
	
	public JiashiyuanEntity(T t) {
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
	 * 驾驶员工号
	 */
					
	private String jiashiyuangonghao;
	
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
