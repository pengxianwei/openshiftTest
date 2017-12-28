package org.p.one.two;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WeiXinSallApi {

	@RequestMapping("/h")
	@ResponseBody
    String home() {
        return "Hello World!";
    }
}
