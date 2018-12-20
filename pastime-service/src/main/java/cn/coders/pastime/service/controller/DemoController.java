package cn.coders.pastime.service.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
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
