package cn.coders.pastime.entity.highcharts.chart.plotOptions;

import cn.coders.pastime.entity.highcharts.chart.plotOptions.scatter.MarkerOne;
import cn.coders.pastime.entity.highcharts.chart.plotOptions.scatter.States;
import cn.coders.pastime.entity.highcharts.chart.plotOptions.scatter.Tooltip;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Scatter implements Serializable {
    private static final long serialVersionUID = 1L;

    private MarkerOne marker;
    private States states;
    private Tooltip tooltip;
}
