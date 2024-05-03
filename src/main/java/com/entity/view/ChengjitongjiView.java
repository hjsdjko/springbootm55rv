package com.entity.view;

import com.entity.ChengjitongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 成绩统计
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-13 16:29:36
 */
@TableName("chengjitongji")
public class ChengjitongjiView  extends ChengjitongjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChengjitongjiView(){
	}
 
 	public ChengjitongjiView(ChengjitongjiEntity chengjitongjiEntity){
 	try {
			BeanUtils.copyProperties(this, chengjitongjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
