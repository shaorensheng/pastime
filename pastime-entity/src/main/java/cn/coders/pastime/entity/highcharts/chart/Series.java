package cn.coders.pastime.entity.highcharts.chart;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Series implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private String color;
    private Object data;
}
