package cn.coders.pastime.service.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 *
 * Redis在springboot中的使用
 * 1、已入jar包spring-boot-starter-data-redis
 * 2、在yml中配置redis
 * 3、在需要使用redis的类中注入RedisTemplate或者StringRedisTemplate
 * 4、redis常使用的类型：（redisTemplate和stringRedisTemplate均有以下几种方法）
 *          redisTemplate.opsForValue();    处理字符串
 *          redisTemplate.opsForHash();     处理hash      无序
 *          redisTemplate.opsForList();     处理list，value可重复，存储顺序，以栈的方式先进后出，全部取出则key也不存在
 *          redisTemplate.opsForSet();      处理Set，value不可重复，无序，全部取出则key也不存在
 *          redisTemplate.opsForZSet();     处理有序Set
 * 5、如果使用redisTemplate时，不设置实例化方式，则key和value均以对象的方式保存。
 *      也可以单独设置key或者value的实例化方式。详情见RedisConfig类
 * 6、一般使用可直接使用StringRedisTemplate，反序列化时如果需要别的返回类型可使用RedisTemplate
 *
 * RedisTemplate和StringRedisTemplate区别
 *              RedisTemplate                   StringRedisTemplate
 *          key和value均是Object         key和value均是String
 *              byte[]实例化                          json实例化
 *                                                     继承自RedisTemplate
 *
 * @author shaorensheng
 * @date 2018/11/14 14:23
 */
@RestController
@RequestMapping("redis")
public class RedisController {

    private static final Logger Log = LoggerFactory.getLogger(RedisController.class);

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @GetMapping("test")
    public void insert(){
        /*redisTemplate*/
        Log.info("---------->开始以，redisTemplate方式缓存---START");
        //操作字符串
        ValueOperations value = redisTemplate.opsForValue();
        value.set("value","value");
        value.set("value1","value1");
        value.set("value2","value2");
        Object o = value.get("value2");
        Log.debug("===value===>{}",o);
        //操作hash
        HashOperations hash = redisTemplate.opsForHash();
        hash.put("hash","hash","hash");
        hash.put("hash","hash1","hash1");
        hash.put("hash","hash2","hash2");
        Object o1 = hash.get("hash", "hash1");
        Log.debug("===hash===>{}",o1);
        //操作list
        ListOperations list = redisTemplate.opsForList();
        list.leftPush("list","list");
        list.leftPush("list","list2");
        list.leftPush("list","list1");
        Object o2 = list.leftPop("list");
        Log.debug("===从list中第一次出栈===>{}",o2);
        Object o4 = list.leftPop("list");
        Log.debug("===从list中第二次出栈====>{}",o4);
        Object o5 = list.leftPop("list");
        Log.debug("===从list中第三次出栈====>{}",o5);
        //操作set
        SetOperations set = redisTemplate.opsForSet();
        set.add("set",56);
        set.add("set",34);
        set.add("set",67);
        set.add("set",89);
        set.add("set",17);
        Object set1 = set.pop("set");
        Log.debug("===从set中第一次取出===>{}",set1);
        Object set2 = set.pop("set");
        Log.debug("===从set中第二次取出===>{}",set2);
        Object set3 = set.pop("set");
        Log.debug("===从set中第三次取出===>{}",set3);
        //操作有序set，以后边的double数值排序
        ZSetOperations zSet = redisTemplate.opsForZSet();
        zSet.add("zSet","B",2.0);
        zSet.add("zSet","A",1.0);
        zSet.add("zSet","C",3.0);
        Set zSet1 = zSet.range("zSet", 1, 2);
        Log.debug("===zSet，返回的是一个Set对象===>{}",zSet1);
        Set<ZSetOperations.TypedTuple> tuples = new HashSet<>();
        Log.info("---------->开始以，redisTemplate方式缓存---END");
        /*stringRedisTemplate*/
        Log.info("---------->开始以，stringRedisTemplate方式缓存---START");
        ValueOperations<String, String> stringValue = stringRedisTemplate.opsForValue();
        stringValue.set("stringValue1","stringValue1");
        stringValue.set("stringValue","stringValue");
        stringValue.set("stringValue2","stringValue2");
        String stringValue2 = stringValue.get("stringValue2");
        Log.debug("===stringValue===>{}",stringValue2);
        HashOperations<String, Object, Object> stringHash = stringRedisTemplate.opsForHash();
        stringHash.put("stringHash","stringHash1","stringHash1");
        stringHash.put("stringHash","stringHash","stringHash");
        stringHash.put("stringHash","stringHash2","stringHash2");
        Object o3 = stringHash.get("stringHash", "stringHash2");
        Log.debug("===stringHash===>{}",o3);
        ListOperations<String, String> stringList = stringRedisTemplate.opsForList();
        stringList.leftPush("stringList","stringList1");
        stringList.leftPush("stringList","stringList");
        stringList.leftPush("stringList","stringList2");
        String stringList1 = stringList.leftPop("stringList");
        Log.debug("===stringList第一次取出===>{}",stringList1);
        String stringList2 = stringList.leftPop("stringList");
        Log.debug("===stringList第二次取出===>{}",stringList2);
        String stringList3 = stringList.leftPop("stringList");
        Log.debug("===stringList第三次取出===>{}",stringList3);
        SetOperations<String, String> stringSet = stringRedisTemplate.opsForSet();
        stringSet.add("stringSet","98");
        stringSet.add("stringSet","56");
        stringSet.add("stringSet","100");
        stringSet.add("stringSet","12");
        stringSet.add("stringSet","50");
        stringSet.add("stringSet","440");
        String stringSet1 = stringSet.pop("stringSet");
        Log.debug("===stringSet第一次取出===>{}",stringSet1);
        String stringSet2 = stringSet.pop("stringSet");
        Log.debug("===stringSet第二次取出===>{}",stringSet2);
        String stringSet3 = stringSet.pop("stringSet");
        Log.debug("===stringSet第三次取出===>{}",stringSet3);
        ZSetOperations<String, String> stringZSet = stringRedisTemplate.opsForZSet();
        stringZSet.add("stringZSet","stringZSet1",2.0);
        stringZSet.add("stringZSet","stringZSet",3.0);
        stringZSet.add("stringZSet","stringZSet2",1.0);
        Set<String> stringZSet1 = stringZSet.range("stringZSet", 1, 2);
        Log.debug("===stringZSet，返回的是一个Set<String>对象===>{}",stringZSet1);
        Log.info("---------->开始以，stringRedisTemplate方式缓存---END");

        //设置key的超时时间
        redisTemplate.expire("key",10, TimeUnit.SECONDS);
    }

}
