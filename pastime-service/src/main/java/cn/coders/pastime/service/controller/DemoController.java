package cn.coders.pastime.service.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shaorensheng
 * @date 2018/11/28 14:45
 */
@RestController
@RequestMapping("demo")
public class DemoController {

    private static final Logger log = LoggerFactory.getLogger(DemoController.class);

    public static void main(String[] args) {
        int key = 90;
        int[] a = {12,44,47,50,55,60,70,80,90};
        log.info("----->{}在数组的下标：{}",key,binarySearch(key, a, 0, a.length - 1));
    }

    /**
     * 递归二分查找
     * @param key
     * @param a
     * @param start
     * @param end
     * @return
     */
    public static int binarySearch(int key, int[]a, int start, int end){
        //start不可能大于end
        if (start > end){
            return -1;
        }
        //获取中间位置的下标
        int index = start + (end - start) / 2;
        if (a[index] > key){
            //中间位置的值大于待查找的值，则从前区接着找，因为当前位置的值已经比较过，所以-1
            return binarySearch(key, a, start, index -1);
        } else if (a[index] < key){
            //中间位置的值小于待查找的值，则从后区接着找，因为当前位置的值已经比较过，所以+1
            return binarySearch(key, a, index + 1, end);
        }
        //值相等，返回
        return index;
    }


    /**
     * 值传递
     */
    @GetMapping("valuePassed")
    public void valuePassed(){
        int[] a = new int[5];
        //数组-->改变入参的值
        changeArr(a);
        for (int i = 0; i < a.length; i++) {
            log.info("=====>{}",a[i]);
        }
        int b = 0;
        //基本数据类型-->未改变入参的值
        changeValue(b);
        log.info("--->b={}",b);
        Map map = new HashMap();
        map.put("one",1);
        //Map-->改变入参的值
        changeMap(map);
        log.info("--->Map={}",map);
    }

    public void changeArr(int[] a){
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }
    }

    public void changeValue(int a){
        a = a + 1;
        log.info("--->a={}",a);
    }

    public void changeMap(Map map){
        map.put("two",2);
    }
}
