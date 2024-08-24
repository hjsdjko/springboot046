package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LeibieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LeibieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LeibieView;


/**
 * 类别
 *
 * @author 
 * @email 
 * @date 2024-04-17 11:09:48
 */
public interface LeibieService extends IService<LeibieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LeibieVO> selectListVO(Wrapper<LeibieEntity> wrapper);
   	
   	LeibieVO selectVO(@Param("ew") Wrapper<LeibieEntity> wrapper);
   	
   	List<LeibieView> selectListView(Wrapper<LeibieEntity> wrapper);
   	
   	LeibieView selectView(@Param("ew") Wrapper<LeibieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LeibieEntity> wrapper);

   	

}

