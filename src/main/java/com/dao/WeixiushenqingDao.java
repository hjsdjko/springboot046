package com.dao;

import com.entity.WeixiushenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WeixiushenqingVO;
import com.entity.view.WeixiushenqingView;


/**
 * 维修申请
 * 
 * @author 
 * @email 
 * @date 2024-04-17 11:09:48
 */
public interface WeixiushenqingDao extends BaseMapper<WeixiushenqingEntity> {
	
	List<WeixiushenqingVO> selectListVO(@Param("ew") Wrapper<WeixiushenqingEntity> wrapper);
	
	WeixiushenqingVO selectVO(@Param("ew") Wrapper<WeixiushenqingEntity> wrapper);
	
	List<WeixiushenqingView> selectListView(@Param("ew") Wrapper<WeixiushenqingEntity> wrapper);

	List<WeixiushenqingView> selectListView(Pagination page,@Param("ew") Wrapper<WeixiushenqingEntity> wrapper);

	
	WeixiushenqingView selectView(@Param("ew") Wrapper<WeixiushenqingEntity> wrapper);
	

}
