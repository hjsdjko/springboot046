package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FangyuanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FangyuanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FangyuanxinxiView;


/**
 * 房源信息
 *
 * @author 
 * @email 
 * @date 2024-04-17 11:09:48
 */
public interface FangyuanxinxiService extends IService<FangyuanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FangyuanxinxiVO> selectListVO(Wrapper<FangyuanxinxiEntity> wrapper);
   	
   	FangyuanxinxiVO selectVO(@Param("ew") Wrapper<FangyuanxinxiEntity> wrapper);
   	
   	List<FangyuanxinxiView> selectListView(Wrapper<FangyuanxinxiEntity> wrapper);
   	
   	FangyuanxinxiView selectView(@Param("ew") Wrapper<FangyuanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FangyuanxinxiEntity> wrapper);

   	

}

