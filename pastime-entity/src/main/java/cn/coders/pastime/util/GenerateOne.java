package cn.coders.pastime.util;

import cn.coders.pastime.entity.BallModel;
import com.alibaba.fastjson.JSONObject;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author shaorensheng
 * @date 2018/9/18 17:09
 */
public class GenerateOne {

    public static BallModel createOne(Integer No){
        BallModel ballModel = new BallModel();
        Random random = new Random();
        TreeMap map = new TreeMap();
        List<Integer> reds = new ArrayList<>();
        Integer count = 0;
        ballModel.setNo(No);
        while (map.size() < 6) {
            int num = random.nextInt(33) + 1;
            if (!map.containsKey(num)){
                map.put(num,null);
                reds.add(num);
                count += num;
            }
        }
        reds = reds.stream().sorted((i1, i2) ->
                i1.compareTo(i2)
        ).collect(Collectors.toList());
        ballModel.setRed1(reds.get(0));
        ballModel.setRed2(reds.get(1));
        ballModel.setRed3(reds.get(2));
        ballModel.setRed4(reds.get(3));
        ballModel.setRed5(reds.get(4));
        ballModel.setRed6(reds.get(5));
        ballModel.setBlue(random.nextInt(16) + 1);
        ballModel.setCount(count);
        ballModel.setCreateDate(new Date());
        return ballModel;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
//        for (int i = 0; i < 150000000; i ++) {
//            Random random = new Random();
//            int j = random.nextInt(33);
//            System.out.println(j);
//        }
        for (int i = 0; i < 100; i ++){
            BallModel one = createOne(10001);
            System.out.println(JSONObject.toJSONString(one));
        }
        long end = System.currentTimeMillis();
        System.out.println((end-start) / 1000 + "s");
    }
}
