package com.entity.view;

import com.entity.NewstypeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 公告信息分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-17 11:09:48
 */
@TableName("newstype")
public class NewstypeView  extends NewstypeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public NewstypeView(){
	}
 
 	public NewstypeView(NewstypeEntity newstypeEntity){
 	try {
			BeanUtils.copyProperties(this, newstypeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
