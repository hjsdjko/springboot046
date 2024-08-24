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

import com.entity.HetongxinxiEntity;
import com.entity.view.HetongxinxiView;

import com.service.HetongxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 合同信息
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-17 11:09:48
 */
@RestController
@RequestMapping("/hetongxinxi")
public class HetongxinxiController {
    @Autowired
    private HetongxinxiService hetongxinxiService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,HetongxinxiEntity hetongxinxi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			hetongxinxi.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<HetongxinxiEntity> ew = new EntityWrapper<HetongxinxiEntity>();

		PageUtils page = hetongxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, hetongxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,HetongxinxiEntity hetongxinxi, 
		HttpServletRequest request){
        EntityWrapper<HetongxinxiEntity> ew = new EntityWrapper<HetongxinxiEntity>();

		PageUtils page = hetongxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, hetongxinxi), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( HetongxinxiEntity hetongxinxi){
       	EntityWrapper<HetongxinxiEntity> ew = new EntityWrapper<HetongxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( hetongxinxi, "hetongxinxi")); 
        return R.ok().put("data", hetongxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(HetongxinxiEntity hetongxinxi){
        EntityWrapper< HetongxinxiEntity> ew = new EntityWrapper< HetongxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( hetongxinxi, "hetongxinxi")); 
		HetongxinxiView hetongxinxiView =  hetongxinxiService.selectView(ew);
		return R.ok("查询合同信息成功").put("data", hetongxinxiView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        HetongxinxiEntity hetongxinxi = hetongxinxiService.selectById(id);
        return R.ok().put("data", hetongxinxi);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        HetongxinxiEntity hetongxinxi = hetongxinxiService.selectById(id);
        return R.ok().put("data", hetongxinxi);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HetongxinxiEntity hetongxinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(hetongxinxi);
        hetongxinxiService.insert(hetongxinxi);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody HetongxinxiEntity hetongxinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(hetongxinxi);
        hetongxinxiService.insert(hetongxinxi);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody HetongxinxiEntity hetongxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(hetongxinxi);
        hetongxinxiService.updateById(hetongxinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        hetongxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
