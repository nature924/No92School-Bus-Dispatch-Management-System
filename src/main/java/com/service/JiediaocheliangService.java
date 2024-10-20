package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiediaocheliangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiediaocheliangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiediaocheliangView;


/**
 * 借调车辆
 *
 * @author 
 * @email 
 * @date 2023-04-19 20:11:05
 */
public interface JiediaocheliangService extends IService<JiediaocheliangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiediaocheliangVO> selectListVO(Wrapper<JiediaocheliangEntity> wrapper);
   	
   	JiediaocheliangVO selectVO(@Param("ew") Wrapper<JiediaocheliangEntity> wrapper);
   	
   	List<JiediaocheliangView> selectListView(Wrapper<JiediaocheliangEntity> wrapper);
   	
   	JiediaocheliangView selectView(@Param("ew") Wrapper<JiediaocheliangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiediaocheliangEntity> wrapper);
   	

}

