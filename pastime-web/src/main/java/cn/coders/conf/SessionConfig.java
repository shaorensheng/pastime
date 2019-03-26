package cn.coders.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * @author shaorensheng
 * @date 2019/3/26 14:03
 */
@Configuration
@EnableRedisHttpSession
public class SessionConfig {
}
