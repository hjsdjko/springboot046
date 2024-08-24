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


import com.dao.LeibieDao;
import com.entity.LeibieEntity;
import com.service.LeibieService;
import com.entity.vo.LeibieVO;
import com.entity.view.LeibieView;

@Service("leibieService")
public class LeibieServiceImpl extends ServiceImpl<LeibieDao, LeibieEntity> implements LeibieService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LeibieEntity> page = this.selectPage(
                new Query<LeibieEntity>(params).getPage(),
                new EntityWrapper<LeibieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LeibieEntity> wrapper) {
		  Page<LeibieView> page =new Query<LeibieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<LeibieVO> selectListVO(Wrapper<LeibieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LeibieVO selectVO(Wrapper<LeibieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LeibieView> selectListView(Wrapper<LeibieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LeibieView selectView(Wrapper<LeibieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
