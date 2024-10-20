package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CheliangyunyingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CheliangyunyingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CheliangyunyingView;


/**
 * 车辆运营
 *
 * @author 
 * @email 
 * @date 2023-04-19 20:11:05
 */
public interface CheliangyunyingService extends IService<CheliangyunyingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CheliangyunyingVO> selectListVO(Wrapper<CheliangyunyingEntity> wrapper);
   	
   	CheliangyunyingVO selectVO(@Param("ew") Wrapper<CheliangyunyingEntity> wrapper);
   	
   	List<CheliangyunyingView> selectListView(Wrapper<CheliangyunyingEntity> wrapper);
   	
   	CheliangyunyingView selectView(@Param("ew") Wrapper<CheliangyunyingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CheliangyunyingEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<CheliangyunyingEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<CheliangyunyingEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<CheliangyunyingEntity> wrapper);



}

