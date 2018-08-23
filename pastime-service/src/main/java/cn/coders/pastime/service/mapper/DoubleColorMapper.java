package cn.coders.pastime.service.mapper;

import cn.coders.DoubleColorBall;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Copyright (C) 2017/6/20 北京学信科技有限公司
 *
 * @author :srs
 * @version:v1.0.0 Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2018/8/23   srs                      v1.0.0        create
 */
public interface DoubleColorMapper {

    public List<DoubleColorBall> findAll(@Param("name") String name);
}
