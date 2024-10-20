package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JiediaocheliangDao;
import com.entity.JiediaocheliangEntity;
import com.service.JiediaocheliangService;
import com.entity.vo.JiediaocheliangVO;
import com.entity.view.JiediaocheliangView;

@Service("jiediaocheliangService")
public class JiediaocheliangServiceImpl extends ServiceImpl<JiediaocheliangDao, JiediaocheliangEntity> implements JiediaocheliangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiediaocheliangEntity> page = this.selectPage(
                new Query<JiediaocheliangEntity>(params).getPage(),
                new EntityWrapper<JiediaocheliangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiediaocheliangEntity> wrapper) {
		  Page<JiediaocheliangView> page =new Query<JiediaocheliangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiediaocheliangVO> selectListVO(Wrapper<JiediaocheliangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiediaocheliangVO selectVO(Wrapper<JiediaocheliangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiediaocheliangView> selectListView(Wrapper<JiediaocheliangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiediaocheliangView selectView(Wrapper<JiediaocheliangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
