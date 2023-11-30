package com.spring.practice_board.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class LoginController {

    @GetMapping("/login")
    public String Login() {
        return "/WEB-INF/views/login-join/login.jsp";
    }

    @GetMapping("/member_join")
    public String Memeber_join() {
        return "/WEB-INF/views/login-join/member_join.jsp";
    }
}
