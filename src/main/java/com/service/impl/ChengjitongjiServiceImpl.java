package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ChengjitongjiDao;
import com.entity.ChengjitongjiEntity;
import com.service.ChengjitongjiService;
import com.entity.vo.ChengjitongjiVO;
import com.entity.view.ChengjitongjiView;

@Service("chengjitongjiService")
public class ChengjitongjiServiceImpl extends ServiceImpl<ChengjitongjiDao, ChengjitongjiEntity> implements ChengjitongjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChengjitongjiEntity> page = this.selectPage(
                new Query<ChengjitongjiEntity>(params).getPage(),
                new EntityWrapper<ChengjitongjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChengjitongjiEntity> wrapper) {
		  Page<ChengjitongjiView> page =new Query<ChengjitongjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChengjitongjiVO> selectListVO(Wrapper<ChengjitongjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChengjitongjiVO selectVO(Wrapper<ChengjitongjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChengjitongjiView> selectListView(Wrapper<ChengjitongjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChengjitongjiView selectView(Wrapper<ChengjitongjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<ChengjitongjiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<ChengjitongjiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<ChengjitongjiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
