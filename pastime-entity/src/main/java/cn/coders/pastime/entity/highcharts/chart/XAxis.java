package cn.coders.pastime.entity.highcharts.chart;

import cn.coders.pastime.entity.highcharts.chart.xAxis.Title;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class XAxis implements Serializable {

    private static final long serialVersionUID = 1L;

    private Title title;
    private Boolean startOnTick;
    private Boolean endOnTick;
    private Boolean showLastLabel;
}
