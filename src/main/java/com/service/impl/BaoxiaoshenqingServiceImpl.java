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


import com.dao.BaoxiaoshenqingDao;
import com.entity.BaoxiaoshenqingEntity;
import com.service.BaoxiaoshenqingService;
import com.entity.vo.BaoxiaoshenqingVO;
import com.entity.view.BaoxiaoshenqingView;

@Service("baoxiaoshenqingService")
public class BaoxiaoshenqingServiceImpl extends ServiceImpl<BaoxiaoshenqingDao, BaoxiaoshenqingEntity> implements BaoxiaoshenqingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaoxiaoshenqingEntity> page = this.selectPage(
                new Query<BaoxiaoshenqingEntity>(params).getPage(),
                new EntityWrapper<BaoxiaoshenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaoxiaoshenqingEntity> wrapper) {
		  Page<BaoxiaoshenqingView> page =new Query<BaoxiaoshenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BaoxiaoshenqingVO> selectListVO(Wrapper<BaoxiaoshenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BaoxiaoshenqingVO selectVO(Wrapper<BaoxiaoshenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BaoxiaoshenqingView> selectListView(Wrapper<BaoxiaoshenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaoxiaoshenqingView selectView(Wrapper<BaoxiaoshenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
