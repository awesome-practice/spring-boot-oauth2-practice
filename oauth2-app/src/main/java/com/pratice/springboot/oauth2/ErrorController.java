package com.pratice.springboot.oauth2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Luo Bao Ding
 * @since 2018/5/24
 */
@Controller
public class ErrorController {
    @RequestMapping("/unauthenticated")
    public String unauthenticated(){
        return "redirect:/?error=true";
    }

}
