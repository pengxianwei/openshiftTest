package org.p.one.two;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

@Configuration 
@EnableConfigurationProperties(RedisConfig.class)
@ConditionalOnClass(RedisClient.class)//判断这个类是否在classpath中存在
public class JedisAutoConfiguration {
	
	@Autowired  
    private RedisConfig prop; 
	
	@Bean(name="redisPool_my")
	public JedisPool jedisPool() {
		JedisPoolConfig config = new JedisPoolConfig();
		config.setMaxTotal(3);
		config.setMaxIdle(3);
		config.setMaxWaitMillis(1);
		return new JedisPool(config, "172.30.52.200", 6379);
	}
	
	@Bean
	@ConditionalOnMissingBean(RedisClient.class)//容器中如果没有RedisClient这个类,那么自动配置这个RedisClient
	public RedisClient redisClient(@Qualifier("redisPool_my")JedisPool pool) {
		RedisClient redisClient = new RedisClient();
		redisClient.setJedisPool(pool);
		return redisClient;
	}
	
}
