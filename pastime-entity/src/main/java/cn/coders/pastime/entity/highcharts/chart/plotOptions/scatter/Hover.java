package cn.coders.pastime.entity.highcharts.chart.plotOptions.scatter;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Hover implements Serializable {
    private static final long serialVersionUID = 1L;

    private Boolean enabled;
    private String lineColor;
    private MarkerOne marker;
}
