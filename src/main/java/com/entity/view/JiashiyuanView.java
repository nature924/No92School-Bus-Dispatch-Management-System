package com.entity.view;

import com.entity.JiashiyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 驾驶员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-04-19 20:11:05
 */
@TableName("jiashiyuan")
public class JiashiyuanView  extends JiashiyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiashiyuanView(){
	}
 
 	public JiashiyuanView(JiashiyuanEntity jiashiyuanEntity){
 	try {
			BeanUtils.copyProperties(this, jiashiyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
