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

import com.entity.JiediaocheliangEntity;
import com.entity.view.JiediaocheliangView;

import com.service.JiediaocheliangService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 借调车辆
 * 后端接口
 * @author 
 * @email 
 * @date 2023-04-19 20:11:05
 */
@RestController
@RequestMapping("/jiediaocheliang")
public class JiediaocheliangController {
    @Autowired
    private JiediaocheliangService jiediaocheliangService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiediaocheliangEntity jiediaocheliang,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiashiyuan")) {
			jiediaocheliang.setJiashiyuangonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JiediaocheliangEntity> ew = new EntityWrapper<JiediaocheliangEntity>();

		PageUtils page = jiediaocheliangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiediaocheliang), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiediaocheliangEntity jiediaocheliang, 
		HttpServletRequest request){
        EntityWrapper<JiediaocheliangEntity> ew = new EntityWrapper<JiediaocheliangEntity>();

		PageUtils page = jiediaocheliangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiediaocheliang), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiediaocheliangEntity jiediaocheliang){
       	EntityWrapper<JiediaocheliangEntity> ew = new EntityWrapper<JiediaocheliangEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiediaocheliang, "jiediaocheliang")); 
        return R.ok().put("data", jiediaocheliangService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiediaocheliangEntity jiediaocheliang){
        EntityWrapper< JiediaocheliangEntity> ew = new EntityWrapper< JiediaocheliangEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiediaocheliang, "jiediaocheliang")); 
		JiediaocheliangView jiediaocheliangView =  jiediaocheliangService.selectView(ew);
		return R.ok("查询借调车辆成功").put("data", jiediaocheliangView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiediaocheliangEntity jiediaocheliang = jiediaocheliangService.selectById(id);
        return R.ok().put("data", jiediaocheliang);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiediaocheliangEntity jiediaocheliang = jiediaocheliangService.selectById(id);
        return R.ok().put("data", jiediaocheliang);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiediaocheliangEntity jiediaocheliang, HttpServletRequest request){
    	jiediaocheliang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiediaocheliang);
        jiediaocheliangService.insert(jiediaocheliang);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiediaocheliangEntity jiediaocheliang, HttpServletRequest request){
    	jiediaocheliang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiediaocheliang);
        jiediaocheliangService.insert(jiediaocheliang);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JiediaocheliangEntity jiediaocheliang, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiediaocheliang);
        jiediaocheliangService.updateById(jiediaocheliang);//全部更新
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiediaocheliangService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
