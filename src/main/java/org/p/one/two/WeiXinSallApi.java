package org.p.one.two;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WeiXinSallApi {

	@RequestMapping("/h")
    String home() {
        return "Hello World!";
    }
}
