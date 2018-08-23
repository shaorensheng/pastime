package cn.coders;

import lombok.Getter;
import lombok.Setter;

/**
 * 双色球实体类
 *
 * @author shaorensheng
 * @date 2018/8/23 10:43
 */
@Getter
@Setter
public class DoubleColorBall {

    private Integer id;
    private Integer red1;
    private Integer red2;
    private Integer red3;
    private Integer red4;
    private Integer red5;
    private Integer red6;
    private Integer blue;
    private Double sales;
    private Double accumulatedSales;
    private Integer oneNum;
    private Double oneBonus;
    private Integer twoNum;
    private Double twoBonus;
    private Integer threeNum;
    private Integer fourNum;
    private Integer fiveNum;
    private Integer sixNum;
    private Integer year;
}
