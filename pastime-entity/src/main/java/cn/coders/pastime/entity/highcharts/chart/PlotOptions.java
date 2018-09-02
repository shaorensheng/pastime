package cn.coders.pastime.entity.highcharts.chart;

import cn.coders.pastime.entity.highcharts.chart.plotOptions.Scatter;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class PlotOptions implements Serializable {
    private static final long serialVersionUID = 1L;

    private Scatter scatter;
}
