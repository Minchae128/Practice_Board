package com.spring.practice_board.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String root() throws Exception {
        return "redirect:/home";
    }

    @GetMapping("/home")
    public String Home() {
        return "/WEB-INF/views/home.jsp";
    }

    @GetMapping("/board")
    public String Board() {
        return "/WEB-INF/views/board.jsp";
    }

    @GetMapping("/member_list")
    public String Member() {
        return "/WEB-INF/views/member_list.jsp";
    }

    @GetMapping("/about")
    public String About() {
        return "/WEB-INF/views/about.jsp";
    }

}
