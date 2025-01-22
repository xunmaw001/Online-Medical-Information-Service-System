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


import com.dao.JiuzhenjieguoDao;
import com.entity.JiuzhenjieguoEntity;
import com.service.JiuzhenjieguoService;
import com.entity.vo.JiuzhenjieguoVO;
import com.entity.view.JiuzhenjieguoView;

@Service("jiuzhenjieguoService")
public class JiuzhenjieguoServiceImpl extends ServiceImpl<JiuzhenjieguoDao, JiuzhenjieguoEntity> implements JiuzhenjieguoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiuzhenjieguoEntity> page = this.selectPage(
                new Query<JiuzhenjieguoEntity>(params).getPage(),
                new EntityWrapper<JiuzhenjieguoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiuzhenjieguoEntity> wrapper) {
		  Page<JiuzhenjieguoView> page =new Query<JiuzhenjieguoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiuzhenjieguoVO> selectListVO(Wrapper<JiuzhenjieguoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiuzhenjieguoVO selectVO(Wrapper<JiuzhenjieguoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiuzhenjieguoView> selectListView(Wrapper<JiuzhenjieguoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiuzhenjieguoView selectView(Wrapper<JiuzhenjieguoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
