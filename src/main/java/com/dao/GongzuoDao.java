package com.dao;

import com.entity.GongzuoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongzuoVO;
import com.entity.view.GongzuoView;


/**
 * 工作
 * 
 * @author 
 * @email 
 * @date 2023-04-19 20:11:05
 */
public interface GongzuoDao extends BaseMapper<GongzuoEntity> {
	
	List<GongzuoVO> selectListVO(@Param("ew") Wrapper<GongzuoEntity> wrapper);
	
	GongzuoVO selectVO(@Param("ew") Wrapper<GongzuoEntity> wrapper);
	
	List<GongzuoView> selectListView(@Param("ew") Wrapper<GongzuoEntity> wrapper);

	List<GongzuoView> selectListView(Pagination page,@Param("ew") Wrapper<GongzuoEntity> wrapper);
	
	GongzuoView selectView(@Param("ew") Wrapper<GongzuoEntity> wrapper);
	

}
