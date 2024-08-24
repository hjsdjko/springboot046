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

import com.entity.WeixiuqingkuangEntity;
import com.entity.view.WeixiuqingkuangView;

import com.service.WeixiuqingkuangService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 维修情况
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-17 11:09:48
 */
@RestController
@RequestMapping("/weixiuqingkuang")
public class WeixiuqingkuangController {
    @Autowired
    private WeixiuqingkuangService weixiuqingkuangService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,WeixiuqingkuangEntity weixiuqingkuang,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			weixiuqingkuang.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<WeixiuqingkuangEntity> ew = new EntityWrapper<WeixiuqingkuangEntity>();

		PageUtils page = weixiuqingkuangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, weixiuqingkuang), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,WeixiuqingkuangEntity weixiuqingkuang, 
		HttpServletRequest request){
        EntityWrapper<WeixiuqingkuangEntity> ew = new EntityWrapper<WeixiuqingkuangEntity>();

		PageUtils page = weixiuqingkuangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, weixiuqingkuang), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( WeixiuqingkuangEntity weixiuqingkuang){
       	EntityWrapper<WeixiuqingkuangEntity> ew = new EntityWrapper<WeixiuqingkuangEntity>();
      	ew.allEq(MPUtil.allEQMapPre( weixiuqingkuang, "weixiuqingkuang")); 
        return R.ok().put("data", weixiuqingkuangService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(WeixiuqingkuangEntity weixiuqingkuang){
        EntityWrapper< WeixiuqingkuangEntity> ew = new EntityWrapper< WeixiuqingkuangEntity>();
 		ew.allEq(MPUtil.allEQMapPre( weixiuqingkuang, "weixiuqingkuang")); 
		WeixiuqingkuangView weixiuqingkuangView =  weixiuqingkuangService.selectView(ew);
		return R.ok("查询维修情况成功").put("data", weixiuqingkuangView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        WeixiuqingkuangEntity weixiuqingkuang = weixiuqingkuangService.selectById(id);
        return R.ok().put("data", weixiuqingkuang);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        WeixiuqingkuangEntity weixiuqingkuang = weixiuqingkuangService.selectById(id);
        return R.ok().put("data", weixiuqingkuang);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WeixiuqingkuangEntity weixiuqingkuang, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(weixiuqingkuang);
        weixiuqingkuangService.insert(weixiuqingkuang);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody WeixiuqingkuangEntity weixiuqingkuang, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(weixiuqingkuang);
        weixiuqingkuangService.insert(weixiuqingkuang);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody WeixiuqingkuangEntity weixiuqingkuang, HttpServletRequest request){
        //ValidatorUtils.validateEntity(weixiuqingkuang);
        weixiuqingkuangService.updateById(weixiuqingkuang);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        weixiuqingkuangService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
