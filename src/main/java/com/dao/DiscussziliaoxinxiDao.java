package com.dao;

import com.entity.DiscussziliaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussziliaoxinxiVO;
import com.entity.view.DiscussziliaoxinxiView;


/**
 * 资料信息评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-13 16:29:36
 */
public interface DiscussziliaoxinxiDao extends BaseMapper<DiscussziliaoxinxiEntity> {
	
	List<DiscussziliaoxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussziliaoxinxiEntity> wrapper);
	
	DiscussziliaoxinxiVO selectVO(@Param("ew") Wrapper<DiscussziliaoxinxiEntity> wrapper);
	
	List<DiscussziliaoxinxiView> selectListView(@Param("ew") Wrapper<DiscussziliaoxinxiEntity> wrapper);

	List<DiscussziliaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussziliaoxinxiEntity> wrapper);
	
	DiscussziliaoxinxiView selectView(@Param("ew") Wrapper<DiscussziliaoxinxiEntity> wrapper);
	

}
