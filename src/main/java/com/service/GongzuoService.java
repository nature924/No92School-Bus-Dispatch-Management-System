package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongzuoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongzuoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongzuoView;


/**
 * 工作
 *
 * @author 
 * @email 
 * @date 2023-04-19 20:11:05
 */
public interface GongzuoService extends IService<GongzuoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongzuoVO> selectListVO(Wrapper<GongzuoEntity> wrapper);
   	
   	GongzuoVO selectVO(@Param("ew") Wrapper<GongzuoEntity> wrapper);
   	
   	List<GongzuoView> selectListView(Wrapper<GongzuoEntity> wrapper);
   	
   	GongzuoView selectView(@Param("ew") Wrapper<GongzuoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongzuoEntity> wrapper);
   	

}

