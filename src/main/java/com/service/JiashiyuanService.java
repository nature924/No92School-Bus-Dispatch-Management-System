package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiashiyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiashiyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiashiyuanView;


/**
 * 驾驶员
 *
 * @author 
 * @email 
 * @date 2023-04-19 20:11:05
 */
public interface JiashiyuanService extends IService<JiashiyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiashiyuanVO> selectListVO(Wrapper<JiashiyuanEntity> wrapper);
   	
   	JiashiyuanVO selectVO(@Param("ew") Wrapper<JiashiyuanEntity> wrapper);
   	
   	List<JiashiyuanView> selectListView(Wrapper<JiashiyuanEntity> wrapper);
   	
   	JiashiyuanView selectView(@Param("ew") Wrapper<JiashiyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiashiyuanEntity> wrapper);
   	

}

