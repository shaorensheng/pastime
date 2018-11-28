package cn.coders;

import cn.coders.pastime.service.util.Receiver;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.listener.PatternTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.data.redis.listener.adapter.MessageListenerAdapter;

import java.util.concurrent.CountDownLatch;

@SpringBootApplication
@EnableEurekaClient	//eureka client
@EnableFeignClients	//feign client
@MapperScan("cn.coders.pastime.service.mapper")
public class PastimeServiceApplication {

	private static final Logger log = LoggerFactory.getLogger(PastimeServiceApplication.class);

//	/**
//	 * 消息侦听器容器
//	 * @param connectionFactory
//	 * @param listenerAdapter
//	 * @return
//	 */
//	@Bean
//	public RedisMessageListenerContainer container(RedisConnectionFactory connectionFactory,
//											MessageListenerAdapter listenerAdapter){
//		RedisMessageListenerContainer container = new RedisMessageListenerContainer();
//		container.setConnectionFactory(connectionFactory);
//		container.addMessageListener(listenerAdapter,new PatternTopic("chat"));
//
//		return container;
//	}
//
//	/**
//	 *
//	 * @param receiver
//	 * @return
//	 */
//	@Bean
//	public MessageListenerAdapter listenerAdapter(Receiver receiver){
//		return new MessageListenerAdapter(receiver,"receiveMessage");
//	}
//
//	@Bean
//	public Receiver receiver(CountDownLatch latch) {
//		return new Receiver(latch);
//	}
//
//	@Bean
//	public CountDownLatch latch() {
//		return new CountDownLatch(1);
//	}
//
//	/**
//	 * 模板
//	 * @param connectionFactory
//	 * @return
//	 */
//	@Bean
//	public StringRedisTemplate template(RedisConnectionFactory connectionFactory) {
//		return new StringRedisTemplate(connectionFactory);
//	}

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(PastimeServiceApplication.class, args);
//		ConfigurableApplicationContext ctx =
//				SpringApplication.run(PastimeServiceApplication.class, args);
//
//		StringRedisTemplate template = ctx.getBean(StringRedisTemplate.class);
//		CountDownLatch latch = ctx.getBean(CountDownLatch.class);
//
//		log.info("Sending message....");
//		template.convertAndSend("chat","Hello from Redis!");
//
//		latch.await();
//		System.exit(0);
	}
}
