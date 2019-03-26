package cn.coders.controller;

import cn.coders.pastime.entity.Doubleball;
import cn.coders.service.HelloServiceAPI;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * WEB
 *
 * @author shaorensheng
 * @date 2018/8/22 11:36
 */
@RestController
@RequestMapping("/hi")
@Slf4j
public class HelloConrollerWEB {

    @Autowired
    HelloServiceAPI helloServiceAPI;

    @GetMapping("/say")
    Doubleball say(@RequestParam(value = "name") String name){
        return helloServiceAPI.say(name);
    }


    @GetMapping("setSession")
    public void setSession(HttpServletRequest request, HttpServletResponse response){
        HttpSession session = request.getSession();
        String sessionId = session.getId();
        session.setAttribute("key",sessionId);
        log.info("-------{}----key={}----", request.getMethod(), sessionId);
    }

    @GetMapping("getSession")
    public void getSession(HttpServletRequest request, HttpServletResponse response){
        HttpSession session = request.getSession();
        Object key = session.getAttribute("key");
        log.info("-------{}----key={}----", request.getMethod(), key);
    }
}
