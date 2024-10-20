package com.dao;

import com.entity.JiashiyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiashiyuanVO;
import com.entity.view.JiashiyuanView;


/**
 * 驾驶员
 * 
 * @author 
 * @email 
 * @date 2023-04-19 20:11:05
 */
public interface JiashiyuanDao extends BaseMapper<JiashiyuanEntity> {
	
	List<JiashiyuanVO> selectListVO(@Param("ew") Wrapper<JiashiyuanEntity> wrapper);
	
	JiashiyuanVO selectVO(@Param("ew") Wrapper<JiashiyuanEntity> wrapper);
	
	List<JiashiyuanView> selectListView(@Param("ew") Wrapper<JiashiyuanEntity> wrapper);

	List<JiashiyuanView> selectListView(Pagination page,@Param("ew") Wrapper<JiashiyuanEntity> wrapper);
	
	JiashiyuanView selectView(@Param("ew") Wrapper<JiashiyuanEntity> wrapper);
	

}
