package cn.coders.pastime.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author shaorensheng
 * @date 2018/9/18 17:07
 */
@Getter
@Setter
public class BallModel implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;

    private Integer No;

    private Integer red1;

    private Integer red2;

    private Integer red3;

    private Integer red4;

    private Integer red5;

    private Integer red6;

    private Integer blue;

    private Integer count;

    private Date createDate;

}
