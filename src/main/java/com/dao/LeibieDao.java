package com.dao;

import com.entity.LeibieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LeibieVO;
import com.entity.view.LeibieView;


/**
 * 类别
 * 
 * @author 
 * @email 
 * @date 2024-04-17 11:09:48
 */
public interface LeibieDao extends BaseMapper<LeibieEntity> {
	
	List<LeibieVO> selectListVO(@Param("ew") Wrapper<LeibieEntity> wrapper);
	
	LeibieVO selectVO(@Param("ew") Wrapper<LeibieEntity> wrapper);
	
	List<LeibieView> selectListView(@Param("ew") Wrapper<LeibieEntity> wrapper);

	List<LeibieView> selectListView(Pagination page,@Param("ew") Wrapper<LeibieEntity> wrapper);

	
	LeibieView selectView(@Param("ew") Wrapper<LeibieEntity> wrapper);
	

}
