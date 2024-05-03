package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengzuoyeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengzuoyeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengzuoyeView;


/**
 * 学生作业
 *
 * @author 
 * @email 
 * @date 2022-04-13 16:29:36
 */
public interface XueshengzuoyeService extends IService<XueshengzuoyeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengzuoyeVO> selectListVO(Wrapper<XueshengzuoyeEntity> wrapper);
   	
   	XueshengzuoyeVO selectVO(@Param("ew") Wrapper<XueshengzuoyeEntity> wrapper);
   	
   	List<XueshengzuoyeView> selectListView(Wrapper<XueshengzuoyeEntity> wrapper);
   	
   	XueshengzuoyeView selectView(@Param("ew") Wrapper<XueshengzuoyeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengzuoyeEntity> wrapper);
   	

}

