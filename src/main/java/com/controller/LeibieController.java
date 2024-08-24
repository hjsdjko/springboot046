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

import com.entity.LeibieEntity;
import com.entity.view.LeibieView;

import com.service.LeibieService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 类别
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-17 11:09:48
 */
@RestController
@RequestMapping("/leibie")
public class LeibieController {
    @Autowired
    private LeibieService leibieService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,LeibieEntity leibie,
		HttpServletRequest request){
        EntityWrapper<LeibieEntity> ew = new EntityWrapper<LeibieEntity>();

		PageUtils page = leibieService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, leibie), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,LeibieEntity leibie, 
		HttpServletRequest request){
        EntityWrapper<LeibieEntity> ew = new EntityWrapper<LeibieEntity>();

		PageUtils page = leibieService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, leibie), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( LeibieEntity leibie){
       	EntityWrapper<LeibieEntity> ew = new EntityWrapper<LeibieEntity>();
      	ew.allEq(MPUtil.allEQMapPre( leibie, "leibie")); 
        return R.ok().put("data", leibieService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(LeibieEntity leibie){
        EntityWrapper< LeibieEntity> ew = new EntityWrapper< LeibieEntity>();
 		ew.allEq(MPUtil.allEQMapPre( leibie, "leibie")); 
		LeibieView leibieView =  leibieService.selectView(ew);
		return R.ok("查询类别成功").put("data", leibieView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        LeibieEntity leibie = leibieService.selectById(id);
        return R.ok().put("data", leibie);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        LeibieEntity leibie = leibieService.selectById(id);
        return R.ok().put("data", leibie);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody LeibieEntity leibie, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(leibie);
        leibieService.insert(leibie);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody LeibieEntity leibie, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(leibie);
        leibieService.insert(leibie);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody LeibieEntity leibie, HttpServletRequest request){
        //ValidatorUtils.validateEntity(leibie);
        leibieService.updateById(leibie);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        leibieService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
