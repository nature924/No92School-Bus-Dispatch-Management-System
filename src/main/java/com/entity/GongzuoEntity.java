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
 * 工作
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-04-19 20:11:05
 */
@TableName("gongzuo")
public class GongzuoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GongzuoEntity() {
		
	}
	
	public GongzuoEntity(T t) {
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
	 * 派车编号
	 */
					
	private String paichebianhao;
	
	/**
	 * 出发时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date chufashijian;
	
	/**
	 * 到达时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date daodashijian;
	
	/**
	 * 出发地点
	 */
					
	private String chufadidian;
	
	/**
	 * 目的地点
	 */
					
	private String mudedidian;
	
	/**
	 * 回程时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date huichengshijian;
	
	/**
	 * 乘车人数
	 */
					
	private String chengcherenshu;
	
	/**
	 * 班级
	 */
					
	private String banji;
	
	/**
	 * 带班老师
	 */
					
	private String daibanlaoshi;
	
	/**
	 * 教师联系电话
	 */
					
	private String jiaoshilianxidianhua;
	
	/**
	 * 是否需要临时换班
	 */
					
	private String shifouxuyaolinshihuanban;
	
	/**
	 * 驾驶员工号
	 */
					
	private String jiashiyuangonghao;
	
	/**
	 * 驾驶员姓名
	 */
					
	private String jiashiyuanxingming;
	
	/**
	 * 司机联系方式
	 */
					
	private String lianxifangshi;
	
	/**
	 * 车辆申请理由
	 */
					
	private String cheliangshenqingliyou;
	
	/**
	 * 状态
	 */
					
	private String zhuangtai;
	
	
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
	 * 设置：派车编号
	 */
	public void setPaichebianhao(String paichebianhao) {
		this.paichebianhao = paichebianhao;
	}
	/**
	 * 获取：派车编号
	 */
	public String getPaichebianhao() {
		return paichebianhao;
	}
	/**
	 * 设置：出发时间
	 */
	public void setChufashijian(Date chufashijian) {
		this.chufashijian = chufashijian;
	}
	/**
	 * 获取：出发时间
	 */
	public Date getChufashijian() {
		return chufashijian;
	}
	/**
	 * 设置：到达时间
	 */
	public void setDaodashijian(Date daodashijian) {
		this.daodashijian = daodashijian;
	}
	/**
	 * 获取：到达时间
	 */
	public Date getDaodashijian() {
		return daodashijian;
	}
	/**
	 * 设置：出发地点
	 */
	public void setChufadidian(String chufadidian) {
		this.chufadidian = chufadidian;
	}
	/**
	 * 获取：出发地点
	 */
	public String getChufadidian() {
		return chufadidian;
	}
	/**
	 * 设置：目的地点
	 */
	public void setMudedidian(String mudedidian) {
		this.mudedidian = mudedidian;
	}
	/**
	 * 获取：目的地点
	 */
	public String getMudedidian() {
		return mudedidian;
	}
	/**
	 * 设置：回程时间
	 */
	public void setHuichengshijian(Date huichengshijian) {
		this.huichengshijian = huichengshijian;
	}
	/**
	 * 获取：回程时间
	 */
	public Date getHuichengshijian() {
		return huichengshijian;
	}
	/**
	 * 设置：乘车人数
	 */
	public void setChengcherenshu(String chengcherenshu) {
		this.chengcherenshu = chengcherenshu;
	}
	/**
	 * 获取：乘车人数
	 */
	public String getChengcherenshu() {
		return chengcherenshu;
	}
	/**
	 * 设置：班级
	 */
	public void setBanji(String banji) {
		this.banji = banji;
	}
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}
	/**
	 * 设置：带班老师
	 */
	public void setDaibanlaoshi(String daibanlaoshi) {
		this.daibanlaoshi = daibanlaoshi;
	}
	/**
	 * 获取：带班老师
	 */
	public String getDaibanlaoshi() {
		return daibanlaoshi;
	}
	/**
	 * 设置：教师联系电话
	 */
	public void setJiaoshilianxidianhua(String jiaoshilianxidianhua) {
		this.jiaoshilianxidianhua = jiaoshilianxidianhua;
	}
	/**
	 * 获取：教师联系电话
	 */
	public String getJiaoshilianxidianhua() {
		return jiaoshilianxidianhua;
	}
	/**
	 * 设置：是否需要临时换班
	 */
	public void setShifouxuyaolinshihuanban(String shifouxuyaolinshihuanban) {
		this.shifouxuyaolinshihuanban = shifouxuyaolinshihuanban;
	}
	/**
	 * 获取：是否需要临时换班
	 */
	public String getShifouxuyaolinshihuanban() {
		return shifouxuyaolinshihuanban;
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
	 * 设置：司机联系方式
	 */
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	/**
	 * 获取：司机联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
	/**
	 * 设置：车辆申请理由
	 */
	public void setCheliangshenqingliyou(String cheliangshenqingliyou) {
		this.cheliangshenqingliyou = cheliangshenqingliyou;
	}
	/**
	 * 获取：车辆申请理由
	 */
	public String getCheliangshenqingliyou() {
		return cheliangshenqingliyou;
	}
	/**
	 * 设置：状态
	 */
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}
	/**
	 * 获取：状态
	 */
	public String getZhuangtai() {
		return zhuangtai;
	}

}
