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

    private Integer No;

    private List<Integer> reds;

    private Integer blue;

    private Integer count;

    private Date createDate;

    @Override
    public String toString() {
        return "BallModel{" +
                "No=" + No +
                ", reds=" + reds +
                ", blue=" + blue +
                ", count=" + count +
                ", createDate=" + createDate +
                '}';
    }
}
