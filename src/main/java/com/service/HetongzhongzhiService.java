package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HetongzhongzhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HetongzhongzhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HetongzhongzhiView;


/**
 * 合同终止
 *
 * @author 
 * @email 
 * @date 2024-04-17 11:09:48
 */
public interface HetongzhongzhiService extends IService<HetongzhongzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HetongzhongzhiVO> selectListVO(Wrapper<HetongzhongzhiEntity> wrapper);
   	
   	HetongzhongzhiVO selectVO(@Param("ew") Wrapper<HetongzhongzhiEntity> wrapper);
   	
   	List<HetongzhongzhiView> selectListView(Wrapper<HetongzhongzhiEntity> wrapper);
   	
   	HetongzhongzhiView selectView(@Param("ew") Wrapper<HetongzhongzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HetongzhongzhiEntity> wrapper);

   	

}

