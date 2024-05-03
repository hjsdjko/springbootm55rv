package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChengjitongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChengjitongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChengjitongjiView;


/**
 * 成绩统计
 *
 * @author 
 * @email 
 * @date 2022-04-13 16:29:36
 */
public interface ChengjitongjiService extends IService<ChengjitongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChengjitongjiVO> selectListVO(Wrapper<ChengjitongjiEntity> wrapper);
   	
   	ChengjitongjiVO selectVO(@Param("ew") Wrapper<ChengjitongjiEntity> wrapper);
   	
   	List<ChengjitongjiView> selectListView(Wrapper<ChengjitongjiEntity> wrapper);
   	
   	ChengjitongjiView selectView(@Param("ew") Wrapper<ChengjitongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChengjitongjiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ChengjitongjiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ChengjitongjiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ChengjitongjiEntity> wrapper);
}

