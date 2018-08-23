package cn.coders.controller;

import cn.coders.service.HelloServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * WEB
 *
 * @author shaorensheng
 * @date 2018/8/22 11:36
 */
@RestController
@RequestMapping("/hi")
public class HelloConroller {

    @Autowired
    HelloServiceAPI helloServiceAPI;

    @GetMapping("/say")
    String say(@RequestParam(value = "name") String name){
        return helloServiceAPI.say(name);
    }
}
