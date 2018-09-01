package cn.coders.pastime.service.controller;

import cn.coders.pastime.entity.Doubleball;
//import cn.coders.pastime.service.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * service
 *
 * @author shaorensheng
 * @date 2018/8/22 12:10
 */
@Controller
@RequestMapping("/hi")
public class HelloController {

    private static final Logger log = LoggerFactory.getLogger(HelloController.class);

//    @Autowired
//    HelloService helloService;
    @GetMapping("/say")
    Doubleball say(@RequestParam(value = "name") String name){
        return null;
    }

    @RequestMapping("/take")
    String take(Model model){
        String name = "Bei Jing";
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        List<List> listList = new ArrayList<>();
        listList.add(list);
        model.addAttribute("dataList",listList);
        return "view/demo";
    }
}
