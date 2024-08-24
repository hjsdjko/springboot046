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


import com.dao.WeixiushenqingDao;
import com.entity.WeixiushenqingEntity;
import com.service.WeixiushenqingService;
import com.entity.vo.WeixiushenqingVO;
import com.entity.view.WeixiushenqingView;

@Service("weixiushenqingService")
public class WeixiushenqingServiceImpl extends ServiceImpl<WeixiushenqingDao, WeixiushenqingEntity> implements WeixiushenqingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WeixiushenqingEntity> page = this.selectPage(
                new Query<WeixiushenqingEntity>(params).getPage(),
                new EntityWrapper<WeixiushenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WeixiushenqingEntity> wrapper) {
		  Page<WeixiushenqingView> page =new Query<WeixiushenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<WeixiushenqingVO> selectListVO(Wrapper<WeixiushenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WeixiushenqingVO selectVO(Wrapper<WeixiushenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WeixiushenqingView> selectListView(Wrapper<WeixiushenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WeixiushenqingView selectView(Wrapper<WeixiushenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
