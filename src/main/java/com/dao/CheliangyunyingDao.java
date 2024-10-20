package com.dao;

import com.entity.CheliangyunyingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CheliangyunyingVO;
import com.entity.view.CheliangyunyingView;


/**
 * 车辆运营
 * 
 * @author 
 * @email 
 * @date 2023-04-19 20:11:05
 */
public interface CheliangyunyingDao extends BaseMapper<CheliangyunyingEntity> {
	
	List<CheliangyunyingVO> selectListVO(@Param("ew") Wrapper<CheliangyunyingEntity> wrapper);
	
	CheliangyunyingVO selectVO(@Param("ew") Wrapper<CheliangyunyingEntity> wrapper);
	
	List<CheliangyunyingView> selectListView(@Param("ew") Wrapper<CheliangyunyingEntity> wrapper);

	List<CheliangyunyingView> selectListView(Pagination page,@Param("ew") Wrapper<CheliangyunyingEntity> wrapper);
	
	CheliangyunyingView selectView(@Param("ew") Wrapper<CheliangyunyingEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<CheliangyunyingEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<CheliangyunyingEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<CheliangyunyingEntity> wrapper);



}
