package com.entity.view;

import com.entity.LeibieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 类别
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-17 11:09:48
 */
@TableName("leibie")
public class LeibieView  extends LeibieEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LeibieView(){
	}
 
 	public LeibieView(LeibieEntity leibieEntity){
 	try {
			BeanUtils.copyProperties(this, leibieEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
