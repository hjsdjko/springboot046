package com.entity.view;

import com.entity.HetongzhongzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 合同终止
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-17 11:09:48
 */
@TableName("hetongzhongzhi")
public class HetongzhongzhiView  extends HetongzhongzhiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HetongzhongzhiView(){
	}
 
 	public HetongzhongzhiView(HetongzhongzhiEntity hetongzhongzhiEntity){
 	try {
			BeanUtils.copyProperties(this, hetongzhongzhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
