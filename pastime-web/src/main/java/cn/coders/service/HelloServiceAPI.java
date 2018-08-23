package cn.coders.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Copyright (C) 2017/6/20 北京学信科技有限公司
 *
 * @author :srs
 * @version:v1.0.0 Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2018/8/22   srs                      v1.0.0        create
 */
@FeignClient(value = "${feign.name}", fallback = HelloSerivceHystric.class)
public interface HelloServiceAPI {

    @GetMapping("/hi/say")
    String say(@RequestParam(value = "name") String name);

}
