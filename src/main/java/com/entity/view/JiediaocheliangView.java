package com.entity.view;

import com.entity.JiediaocheliangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 借调车辆
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-04-19 20:11:05
 */
@TableName("jiediaocheliang")
public class JiediaocheliangView  extends JiediaocheliangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiediaocheliangView(){
	}
 
 	public JiediaocheliangView(JiediaocheliangEntity jiediaocheliangEntity){
 	try {
			BeanUtils.copyProperties(this, jiediaocheliangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
