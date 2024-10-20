package com.dao;

import com.entity.JiediaocheliangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiediaocheliangVO;
import com.entity.view.JiediaocheliangView;


/**
 * 借调车辆
 * 
 * @author 
 * @email 
 * @date 2023-04-19 20:11:05
 */
public interface JiediaocheliangDao extends BaseMapper<JiediaocheliangEntity> {
	
	List<JiediaocheliangVO> selectListVO(@Param("ew") Wrapper<JiediaocheliangEntity> wrapper);
	
	JiediaocheliangVO selectVO(@Param("ew") Wrapper<JiediaocheliangEntity> wrapper);
	
	List<JiediaocheliangView> selectListView(@Param("ew") Wrapper<JiediaocheliangEntity> wrapper);

	List<JiediaocheliangView> selectListView(Pagination page,@Param("ew") Wrapper<JiediaocheliangEntity> wrapper);
	
	JiediaocheliangView selectView(@Param("ew") Wrapper<JiediaocheliangEntity> wrapper);
	

}
