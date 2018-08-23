package cn.coders.service.impl;

import cn.coders.service.HelloService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * service impl
 *
 * @author shaorensheng
 * @date 2018/8/22 13:28
 */
@Service
public class HelloServiceImpl implements HelloService{

    @Value("${foo}")
    String foo;
    @Override
    public String say(String name) {
        return "hi  "+name+"    ;"+foo;
    }

}
