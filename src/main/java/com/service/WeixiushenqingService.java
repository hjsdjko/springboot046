package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WeixiushenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WeixiushenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WeixiushenqingView;


/**
 * 维修申请
 *
 * @author 
 * @email 
 * @date 2024-04-17 11:09:48
 */
public interface WeixiushenqingService extends IService<WeixiushenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WeixiushenqingVO> selectListVO(Wrapper<WeixiushenqingEntity> wrapper);
   	
   	WeixiushenqingVO selectVO(@Param("ew") Wrapper<WeixiushenqingEntity> wrapper);
   	
   	List<WeixiushenqingView> selectListView(Wrapper<WeixiushenqingEntity> wrapper);
   	
   	WeixiushenqingView selectView(@Param("ew") Wrapper<WeixiushenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WeixiushenqingEntity> wrapper);

   	

}

