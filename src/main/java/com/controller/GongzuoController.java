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

import com.entity.GongzuoEntity;
import com.entity.view.GongzuoView;

import com.service.GongzuoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 工作
 * 后端接口
 * @author 
 * @email 
 * @date 2023-04-19 20:11:05
 */
@RestController
@RequestMapping("/gongzuo")
public class GongzuoController {
    @Autowired
    private GongzuoService gongzuoService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,GongzuoEntity gongzuo,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiashiyuan")) {
			gongzuo.setJiashiyuangonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<GongzuoEntity> ew = new EntityWrapper<GongzuoEntity>();

		PageUtils page = gongzuoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gongzuo), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,GongzuoEntity gongzuo, 
		HttpServletRequest request){
        EntityWrapper<GongzuoEntity> ew = new EntityWrapper<GongzuoEntity>();

		PageUtils page = gongzuoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gongzuo), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( GongzuoEntity gongzuo){
       	EntityWrapper<GongzuoEntity> ew = new EntityWrapper<GongzuoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( gongzuo, "gongzuo")); 
        return R.ok().put("data", gongzuoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(GongzuoEntity gongzuo){
        EntityWrapper< GongzuoEntity> ew = new EntityWrapper< GongzuoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( gongzuo, "gongzuo")); 
		GongzuoView gongzuoView =  gongzuoService.selectView(ew);
		return R.ok("查询工作成功").put("data", gongzuoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        GongzuoEntity gongzuo = gongzuoService.selectById(id);
        return R.ok().put("data", gongzuo);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        GongzuoEntity gongzuo = gongzuoService.selectById(id);
        return R.ok().put("data", gongzuo);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody GongzuoEntity gongzuo, HttpServletRequest request){
    	gongzuo.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(gongzuo);
        gongzuoService.insert(gongzuo);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody GongzuoEntity gongzuo, HttpServletRequest request){
    	gongzuo.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(gongzuo);
        gongzuoService.insert(gongzuo);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody GongzuoEntity gongzuo, HttpServletRequest request){
        //ValidatorUtils.validateEntity(gongzuo);
        gongzuoService.updateById(gongzuo);//全部更新
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        gongzuoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
