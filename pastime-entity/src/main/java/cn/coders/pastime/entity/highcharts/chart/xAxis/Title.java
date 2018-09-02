package cn.coders.pastime.entity.highcharts.chart.xAxis;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Title implements Serializable {

    private static final long serialVersionUID = 1L;

    private String text;
    private Boolean enabled;
}
