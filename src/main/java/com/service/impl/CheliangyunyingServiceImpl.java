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


import com.dao.CheliangyunyingDao;
import com.entity.CheliangyunyingEntity;
import com.service.CheliangyunyingService;
import com.entity.vo.CheliangyunyingVO;
import com.entity.view.CheliangyunyingView;

@Service("cheliangyunyingService")
public class CheliangyunyingServiceImpl extends ServiceImpl<CheliangyunyingDao, CheliangyunyingEntity> implements CheliangyunyingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CheliangyunyingEntity> page = this.selectPage(
                new Query<CheliangyunyingEntity>(params).getPage(),
                new EntityWrapper<CheliangyunyingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CheliangyunyingEntity> wrapper) {
		  Page<CheliangyunyingView> page =new Query<CheliangyunyingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CheliangyunyingVO> selectListVO(Wrapper<CheliangyunyingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CheliangyunyingVO selectVO(Wrapper<CheliangyunyingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CheliangyunyingView> selectListView(Wrapper<CheliangyunyingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CheliangyunyingView selectView(Wrapper<CheliangyunyingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<CheliangyunyingEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<CheliangyunyingEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<CheliangyunyingEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
