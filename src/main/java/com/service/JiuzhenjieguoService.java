package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiuzhenjieguoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiuzhenjieguoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiuzhenjieguoView;


/**
 * 就诊结果
 *
 * @author 
 * @email 
 * @date 2022-04-02 16:37:02
 */
public interface JiuzhenjieguoService extends IService<JiuzhenjieguoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiuzhenjieguoVO> selectListVO(Wrapper<JiuzhenjieguoEntity> wrapper);
   	
   	JiuzhenjieguoVO selectVO(@Param("ew") Wrapper<JiuzhenjieguoEntity> wrapper);
   	
   	List<JiuzhenjieguoView> selectListView(Wrapper<JiuzhenjieguoEntity> wrapper);
   	
   	JiuzhenjieguoView selectView(@Param("ew") Wrapper<JiuzhenjieguoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiuzhenjieguoEntity> wrapper);
   	

}

