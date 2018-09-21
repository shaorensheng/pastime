package cn.coders.pastime.service.mapper;

import cn.coders.pastime.entity.Doubleball;
import java.util.List;
import java.util.Map;

public interface DoubleballMapper {
    public List<Map> getRedTotalAndTimes();
    public List<Map> getTotalAndTimes();

    public List<Map> getBlues();
}