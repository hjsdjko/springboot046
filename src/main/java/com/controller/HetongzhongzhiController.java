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

import com.entity.HetongzhongzhiEntity;
import com.entity.view.HetongzhongzhiView;

import com.service.HetongzhongzhiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 合同终止
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-17 11:09:48
 */
@RestController
@RequestMapping("/hetongzhongzhi")
public class HetongzhongzhiController {
    @Autowired
    private HetongzhongzhiService hetongzhongzhiService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,HetongzhongzhiEntity hetongzhongzhi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			hetongzhongzhi.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<HetongzhongzhiEntity> ew = new EntityWrapper<HetongzhongzhiEntity>();

		PageUtils page = hetongzhongzhiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, hetongzhongzhi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,HetongzhongzhiEntity hetongzhongzhi, 
		HttpServletRequest request){
        EntityWrapper<HetongzhongzhiEntity> ew = new EntityWrapper<HetongzhongzhiEntity>();

		PageUtils page = hetongzhongzhiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, hetongzhongzhi), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( HetongzhongzhiEntity hetongzhongzhi){
       	EntityWrapper<HetongzhongzhiEntity> ew = new EntityWrapper<HetongzhongzhiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( hetongzhongzhi, "hetongzhongzhi")); 
        return R.ok().put("data", hetongzhongzhiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(HetongzhongzhiEntity hetongzhongzhi){
        EntityWrapper< HetongzhongzhiEntity> ew = new EntityWrapper< HetongzhongzhiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( hetongzhongzhi, "hetongzhongzhi")); 
		HetongzhongzhiView hetongzhongzhiView =  hetongzhongzhiService.selectView(ew);
		return R.ok("查询合同终止成功").put("data", hetongzhongzhiView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        HetongzhongzhiEntity hetongzhongzhi = hetongzhongzhiService.selectById(id);
        return R.ok().put("data", hetongzhongzhi);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        HetongzhongzhiEntity hetongzhongzhi = hetongzhongzhiService.selectById(id);
        return R.ok().put("data", hetongzhongzhi);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HetongzhongzhiEntity hetongzhongzhi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(hetongzhongzhi);
        hetongzhongzhiService.insert(hetongzhongzhi);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody HetongzhongzhiEntity hetongzhongzhi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(hetongzhongzhi);
        hetongzhongzhiService.insert(hetongzhongzhi);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody HetongzhongzhiEntity hetongzhongzhi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(hetongzhongzhi);
        hetongzhongzhiService.updateById(hetongzhongzhi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        hetongzhongzhiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
