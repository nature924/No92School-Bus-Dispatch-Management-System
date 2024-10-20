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


import com.dao.GongzuoDao;
import com.entity.GongzuoEntity;
import com.service.GongzuoService;
import com.entity.vo.GongzuoVO;
import com.entity.view.GongzuoView;

@Service("gongzuoService")
public class GongzuoServiceImpl extends ServiceImpl<GongzuoDao, GongzuoEntity> implements GongzuoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongzuoEntity> page = this.selectPage(
                new Query<GongzuoEntity>(params).getPage(),
                new EntityWrapper<GongzuoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongzuoEntity> wrapper) {
		  Page<GongzuoView> page =new Query<GongzuoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongzuoVO> selectListVO(Wrapper<GongzuoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongzuoVO selectVO(Wrapper<GongzuoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongzuoView> selectListView(Wrapper<GongzuoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongzuoView selectView(Wrapper<GongzuoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
