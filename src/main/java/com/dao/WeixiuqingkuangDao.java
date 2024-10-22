package com.dao;

import com.entity.WeixiuqingkuangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WeixiuqingkuangVO;
import com.entity.view.WeixiuqingkuangView;


/**
 * 维修情况
 * 
 * @author 
 * @email 
 * @date 2024-04-17 11:09:48
 */
public interface WeixiuqingkuangDao extends BaseMapper<WeixiuqingkuangEntity> {
	
	List<WeixiuqingkuangVO> selectListVO(@Param("ew") Wrapper<WeixiuqingkuangEntity> wrapper);
	
	WeixiuqingkuangVO selectVO(@Param("ew") Wrapper<WeixiuqingkuangEntity> wrapper);
	
	List<WeixiuqingkuangView> selectListView(@Param("ew") Wrapper<WeixiuqingkuangEntity> wrapper);

	List<WeixiuqingkuangView> selectListView(Pagination page,@Param("ew") Wrapper<WeixiuqingkuangEntity> wrapper);

	
	WeixiuqingkuangView selectView(@Param("ew") Wrapper<WeixiuqingkuangEntity> wrapper);
	

}
