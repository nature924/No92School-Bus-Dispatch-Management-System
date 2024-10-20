package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BaoxiaoshenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BaoxiaoshenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BaoxiaoshenqingView;


/**
 * 报销申请
 *
 * @author 
 * @email 
 * @date 2023-04-19 20:11:06
 */
public interface BaoxiaoshenqingService extends IService<BaoxiaoshenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BaoxiaoshenqingVO> selectListVO(Wrapper<BaoxiaoshenqingEntity> wrapper);
   	
   	BaoxiaoshenqingVO selectVO(@Param("ew") Wrapper<BaoxiaoshenqingEntity> wrapper);
   	
   	List<BaoxiaoshenqingView> selectListView(Wrapper<BaoxiaoshenqingEntity> wrapper);
   	
   	BaoxiaoshenqingView selectView(@Param("ew") Wrapper<BaoxiaoshenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BaoxiaoshenqingEntity> wrapper);
   	

}

