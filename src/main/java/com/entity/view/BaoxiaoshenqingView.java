package com.entity.view;

import com.entity.BaoxiaoshenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 报销申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-04-19 20:11:06
 */
@TableName("baoxiaoshenqing")
public class BaoxiaoshenqingView  extends BaoxiaoshenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BaoxiaoshenqingView(){
	}
 
 	public BaoxiaoshenqingView(BaoxiaoshenqingEntity baoxiaoshenqingEntity){
 	try {
			BeanUtils.copyProperties(this, baoxiaoshenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
