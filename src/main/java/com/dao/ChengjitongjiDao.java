package com.dao;

import com.entity.ChengjitongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChengjitongjiVO;
import com.entity.view.ChengjitongjiView;


/**
 * 成绩统计
 * 
 * @author 
 * @email 
 * @date 2022-04-13 16:29:36
 */
public interface ChengjitongjiDao extends BaseMapper<ChengjitongjiEntity> {
	
	List<ChengjitongjiVO> selectListVO(@Param("ew") Wrapper<ChengjitongjiEntity> wrapper);
	
	ChengjitongjiVO selectVO(@Param("ew") Wrapper<ChengjitongjiEntity> wrapper);
	
	List<ChengjitongjiView> selectListView(@Param("ew") Wrapper<ChengjitongjiEntity> wrapper);

	List<ChengjitongjiView> selectListView(Pagination page,@Param("ew") Wrapper<ChengjitongjiEntity> wrapper);
	
	ChengjitongjiView selectView(@Param("ew") Wrapper<ChengjitongjiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ChengjitongjiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ChengjitongjiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ChengjitongjiEntity> wrapper);
}
