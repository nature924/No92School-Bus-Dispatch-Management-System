package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.BaoxiaoshenqingEntity;
import com.entity.view.BaoxiaoshenqingView;

import com.service.BaoxiaoshenqingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 报销申请
 * 后端接口
 * @author 
 * @email 
 * @date 2023-04-19 20:11:06
 */
@RestController
@RequestMapping("/baoxiaoshenqing")
public class BaoxiaoshenqingController {
    @Autowired
    private BaoxiaoshenqingService baoxiaoshenqingService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,BaoxiaoshenqingEntity baoxiaoshenqing,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiashiyuan")) {
			baoxiaoshenqing.setJiashiyuangonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<BaoxiaoshenqingEntity> ew = new EntityWrapper<BaoxiaoshenqingEntity>();

		PageUtils page = baoxiaoshenqingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, baoxiaoshenqing), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,BaoxiaoshenqingEntity baoxiaoshenqing, 
		HttpServletRequest request){
        EntityWrapper<BaoxiaoshenqingEntity> ew = new EntityWrapper<BaoxiaoshenqingEntity>();

		PageUtils page = baoxiaoshenqingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, baoxiaoshenqing), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( BaoxiaoshenqingEntity baoxiaoshenqing){
       	EntityWrapper<BaoxiaoshenqingEntity> ew = new EntityWrapper<BaoxiaoshenqingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( baoxiaoshenqing, "baoxiaoshenqing")); 
        return R.ok().put("data", baoxiaoshenqingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(BaoxiaoshenqingEntity baoxiaoshenqing){
        EntityWrapper< BaoxiaoshenqingEntity> ew = new EntityWrapper< BaoxiaoshenqingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( baoxiaoshenqing, "baoxiaoshenqing")); 
		BaoxiaoshenqingView baoxiaoshenqingView =  baoxiaoshenqingService.selectView(ew);
		return R.ok("查询报销申请成功").put("data", baoxiaoshenqingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        BaoxiaoshenqingEntity baoxiaoshenqing = baoxiaoshenqingService.selectById(id);
        return R.ok().put("data", baoxiaoshenqing);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        BaoxiaoshenqingEntity baoxiaoshenqing = baoxiaoshenqingService.selectById(id);
        return R.ok().put("data", baoxiaoshenqing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BaoxiaoshenqingEntity baoxiaoshenqing, HttpServletRequest request){
    	baoxiaoshenqing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(baoxiaoshenqing);
        baoxiaoshenqingService.insert(baoxiaoshenqing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody BaoxiaoshenqingEntity baoxiaoshenqing, HttpServletRequest request){
    	baoxiaoshenqing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(baoxiaoshenqing);
        baoxiaoshenqingService.insert(baoxiaoshenqing);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody BaoxiaoshenqingEntity baoxiaoshenqing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(baoxiaoshenqing);
        baoxiaoshenqingService.updateById(baoxiaoshenqing);//全部更新
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        baoxiaoshenqingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
