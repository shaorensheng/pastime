package cn.coders.pastime.service.controller;

import cn.coders.pastime.entity.Doubleball;
import cn.coders.pastime.service.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * service
 *
 * @author shaorensheng
 * @date 2018/8/22 12:10
 */
@RestController
@RequestMapping("/hi")
public class HelloController {

    @Autowired
    HelloService helloService;
    @GetMapping("/say")
    Doubleball say(@RequestParam(value = "name") String name){
        return helloService.say(name);
    }
}
