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
    String home(String name) {
		try {
			
			if (name  == null) {
				return redisClient.get("testone");
			} else {
				redisClient.set("testone",name);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return "Hello World!";
    }
}
