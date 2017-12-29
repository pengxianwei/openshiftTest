package org.p.one.two;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = RedisConfig.JEDIS_PREFIX) 
public class RedisConfig {
	public static final String JEDIS_PREFIX = "spring.redis";  
    
    private String host;  
      
    public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public int getMaxTotal() {
		return maxTotal;
	}

	public void setMaxTotal(int maxTotal) {
		this.maxTotal = maxTotal;
	}

	public int getMaxIdle() {
		return maxIdle;
	}

	public void setMaxIdle(int maxIdle) {
		this.maxIdle = maxIdle;
	}

	public int getMaxWaitMillis() {
		return maxWaitMillis;
	}

	public void setMaxWaitMillis(int maxWaitMillis) {
		this.maxWaitMillis = maxWaitMillis;
	}

	private int port;  
    @Value("${spring.redis.pool.max-active}")  
    private int maxTotal;  
    @Value("${spring.redis.pool.max-idle}")
    private int maxIdle;  
    @Value("${spring.redis.pool.max-wait}")
    private int maxWaitMillis; 
}
