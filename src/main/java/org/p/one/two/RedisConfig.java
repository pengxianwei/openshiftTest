package org.p.one.two;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix=RedisConfig.JEDIS_PREFIX)
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


	
	
	private int port;  
	
	private Pool pool;
	
	
	public Pool getPool() {
		return pool;
	}

	public void setPool(Pool pool) {
		this.pool = pool;
	}


	public static class Pool {
	
    private int maxActive;  
    private int maxIdle;  
    private int maxWaitMillis;
	public int getmaxActive() {
		return maxActive;
	}
	public void setmaxActive(int maxActive) {
		this.maxActive = maxActive;
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
    
    
	}
	
    
}
