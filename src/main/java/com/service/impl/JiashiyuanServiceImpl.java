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


import com.dao.JiashiyuanDao;
import com.entity.JiashiyuanEntity;
import com.service.JiashiyuanService;
import com.entity.vo.JiashiyuanVO;
import com.entity.view.JiashiyuanView;

@Service("jiashiyuanService")
public class JiashiyuanServiceImpl extends ServiceImpl<JiashiyuanDao, JiashiyuanEntity> implements JiashiyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiashiyuanEntity> page = this.selectPage(
                new Query<JiashiyuanEntity>(params).getPage(),
                new EntityWrapper<JiashiyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiashiyuanEntity> wrapper) {
		  Page<JiashiyuanView> page =new Query<JiashiyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiashiyuanVO> selectListVO(Wrapper<JiashiyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiashiyuanVO selectVO(Wrapper<JiashiyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiashiyuanView> selectListView(Wrapper<JiashiyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiashiyuanView selectView(Wrapper<JiashiyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
