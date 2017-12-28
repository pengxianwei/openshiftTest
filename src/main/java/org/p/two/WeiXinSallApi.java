package org.p.two;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeiXinSallApi {

	@RequestMapping(value="/weixinApi/v1")
	@ResponseBody
	public String getMyInfo(String name){
		
		return name;
	}
}
