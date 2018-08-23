package cn.coders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient	//eureka client
@EnableFeignClients	//feign client
public class PastimeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PastimeServiceApplication.class, args);
	}
}
