package cn.coders.pastime.entity.highcharts.chart;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Legend implements Serializable {
    private static final long serialVersionUID = 1L;

    private String layout;
    private String align;
    private String verticalAlign;
    private Integer x;
    private Integer y;
    private Boolean floating;
    private String backgroundColor;
    private Integer borderWidth;
}
