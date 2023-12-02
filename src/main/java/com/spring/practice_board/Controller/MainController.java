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
        return "/Page/home";
    }

    @GetMapping("/board")
    public String Board() {
        return "/Page/board";
    }

    @GetMapping("/member_list")
    public String Member() {
        return "/Page/member_list";
    }

    @GetMapping("/about")
    public String About() {
        return "/Page/about";
    }

}
