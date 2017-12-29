package org.p.one.two;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WeiXinSallApi {

	@Autowired  
	private RedisClient redisClient;
	 
	@RequestMapping("/h")
	@ResponseBody
    String home() {
		try {
			//redisClient.set("testone", "is ok");
			return redisClient.get("testone");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return "Hello World!";
    }
}
