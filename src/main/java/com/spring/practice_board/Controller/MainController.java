package com.spring.practice_board.Controller;

import com.spring.practice_board.Service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
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
    public String Board(HttpServletRequest request, Model model) {
        List<Map<String, String>> list = new ArrayList<>();
        list = boardService.boardList();

        for (Map<String, String> map : list) {
            System.out.println(map.get("POSTNUMBER"));
            System.out.println(map.get("TITLE"));
            System.out.println(map.get("AUTHOR"));
            System.out.println(map.get("CREATIONDATE"));
        }

        //request.setAttribute("list", list);
        model.addAttribute("list", list);
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
