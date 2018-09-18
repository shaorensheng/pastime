package cn.coders.pastime.util;

import cn.coders.pastime.entity.BallModel;

import java.util.*;

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
        ballModel.setReds(reds);
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
            System.out.println(one.toString());
        }
        long end = System.currentTimeMillis();
        System.out.println((end-start) / 1000 + "s");
    }
}
