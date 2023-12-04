package com.spring.practice_board.Controller;

import com.spring.practice_board.Service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class MainController {

    @Autowired
    BoardService boardService;

    @RequestMapping("/")
    public String root() throws Exception {
        return "redirect:/home";
    }

    @GetMapping("/home")
    public String Home() {
        return "/Page/home";
    }

    @GetMapping("/board")
    @ResponseBody
    public String Board() {

        List<Map<String, String>> list = new ArrayList<>();
        list = boardService.boardList();

        for(Map<String, String> map : list) {
            System.out.println(map.get("PostNumber"));
            System.out.println(map.get("Title"));
            System.out.println(map.get("Author"));
            System.out.println(map.get("CreationDate"));
        }

            return "--";
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
