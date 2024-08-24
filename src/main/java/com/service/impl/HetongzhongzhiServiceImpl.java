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


import com.dao.HetongzhongzhiDao;
import com.entity.HetongzhongzhiEntity;
import com.service.HetongzhongzhiService;
import com.entity.vo.HetongzhongzhiVO;
import com.entity.view.HetongzhongzhiView;

@Service("hetongzhongzhiService")
public class HetongzhongzhiServiceImpl extends ServiceImpl<HetongzhongzhiDao, HetongzhongzhiEntity> implements HetongzhongzhiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HetongzhongzhiEntity> page = this.selectPage(
                new Query<HetongzhongzhiEntity>(params).getPage(),
                new EntityWrapper<HetongzhongzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HetongzhongzhiEntity> wrapper) {
		  Page<HetongzhongzhiView> page =new Query<HetongzhongzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<HetongzhongzhiVO> selectListVO(Wrapper<HetongzhongzhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HetongzhongzhiVO selectVO(Wrapper<HetongzhongzhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HetongzhongzhiView> selectListView(Wrapper<HetongzhongzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HetongzhongzhiView selectView(Wrapper<HetongzhongzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
