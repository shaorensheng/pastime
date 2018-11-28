package cn.coders.pastime.service.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

/**
 * 接收消息
 *
 * @author shaorensheng
 * @date 2018/11/16 10:48
 */
public class Receiver {
    private static final Logger log = LoggerFactory.getLogger(Receiver.class);

    private CountDownLatch latch;

    public Receiver(CountDownLatch latch) {
        this.latch = latch;
    }

    public void receiveMessage(String message){
        log.info("Receive<" + message + ">");
        latch.countDown();
    }
}
