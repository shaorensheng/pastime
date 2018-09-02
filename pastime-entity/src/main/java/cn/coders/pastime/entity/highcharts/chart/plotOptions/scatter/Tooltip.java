package cn.coders.pastime.entity.highcharts.chart.plotOptions.scatter;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Tooltip implements Serializable {
    private static final long serialVersionUID = 1L;

    private String headerFormat;
    private String pointFormat;
}
