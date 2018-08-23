package cn.coders.pastime.service.mapper;

import cn.coders.pastime.entity.Doubleball;
import java.util.List;

public interface DoubleballMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Doubleball record);

    Doubleball selectByPrimaryKey(Integer id);

    List<Doubleball> selectAll();

    int updateByPrimaryKey(Doubleball record);
}