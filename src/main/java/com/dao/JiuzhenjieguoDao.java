package com.dao;

import com.entity.JiuzhenjieguoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiuzhenjieguoVO;
import com.entity.view.JiuzhenjieguoView;


/**
 * 就诊结果
 * 
 * @author 
 * @email 
 * @date 2022-04-02 16:37:02
 */
public interface JiuzhenjieguoDao extends BaseMapper<JiuzhenjieguoEntity> {
	
	List<JiuzhenjieguoVO> selectListVO(@Param("ew") Wrapper<JiuzhenjieguoEntity> wrapper);
	
	JiuzhenjieguoVO selectVO(@Param("ew") Wrapper<JiuzhenjieguoEntity> wrapper);
	
	List<JiuzhenjieguoView> selectListView(@Param("ew") Wrapper<JiuzhenjieguoEntity> wrapper);

	List<JiuzhenjieguoView> selectListView(Pagination page,@Param("ew") Wrapper<JiuzhenjieguoEntity> wrapper);
	
	JiuzhenjieguoView selectView(@Param("ew") Wrapper<JiuzhenjieguoEntity> wrapper);
	

}
