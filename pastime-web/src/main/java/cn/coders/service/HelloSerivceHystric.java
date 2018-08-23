package cn.coders.service;

import org.springframework.stereotype.Component;

/**
 * 熔断器
 *
 * @author shaorensheng
 * @date 2018/8/22 13:42
 */

@Component
public class HelloSerivceHystric implements HelloServiceAPI {
    @Override
    public String say(String name) {
        return "sorry";
    }
}
