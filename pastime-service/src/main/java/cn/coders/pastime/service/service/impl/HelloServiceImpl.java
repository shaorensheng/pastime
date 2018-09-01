//package cn.coders.pastime.service.service.impl;
//
//import cn.coders.pastime.entity.Doubleball;
//import cn.coders.pastime.service.mapper.DoubleballMapper;
//import cn.coders.pastime.service.service.HelloService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//
///**
// * service impl
// *
// * @author shaorensheng
// * @date 2018/8/22 13:28
// */
//@Service
//public class HelloServiceImpl implements HelloService{
//
//    @Autowired
//    DoubleballMapper doubleballMapper;
//
//    @Value("${foo}")
//    String foo;
//    @Override
//    public Doubleball say(String name) {
//        Doubleball doubleball = doubleballMapper.selectByPrimaryKey(18001);
//        return doubleball;
//    }
//
//}
