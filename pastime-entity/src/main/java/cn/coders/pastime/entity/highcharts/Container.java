package cn.coders.pastime.entity.highcharts;

import cn.coders.pastime.entity.highcharts.chart.*;
import cn.coders.pastime.entity.highcharts.chart.xAxis.Title;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class Container implements Serializable {
    private static final long serialVersionUID = 1L;

    private Chart chart;
    private Title title;
    private Subtitle subtitle;
    private XAxis xAxis;
    private YAxis yAxis;
    private Legend legend;
    private PlotOptions plotOptions;
    private List<Series> series;
}
