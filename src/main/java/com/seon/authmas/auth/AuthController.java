package com.seon.authmas.auth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author seonjihwan
 * @version 1.0
 * @since 2025-02-16
 */
@Controller
public class AuthController {
    @GetMapping({"", "/"})
    public String login(){
        return "auth/login";
    }
}
