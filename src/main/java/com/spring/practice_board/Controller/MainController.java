package com.spring.practice_board.Controller;

import com.spring.practice_board.Service.BoardService;
import com.spring.practice_board.VO.VO_board;
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
/*        List<Map<String, String>> list = new ArrayList<>();
        list = boardService.boardList();

        for (Map<String, String> map : list) {
            System.out.println(map.get("POSTNUMBER"));
            System.out.println(map.get("TITLE"));
            System.out.println(map.get("AUTHOR"));
            System.out.println(map.get("CREATIONDATE"));
        }

        //request.setAttribute("list", list);
        model.addAttribute("list", list);
        return "/Page/board";*/

        List<VO_board> list = new ArrayList<>();
        list = boardService.boardList();

        //VO객체 사용 명시
        System.out.println("vo_board");

        for (VO_board vo_board : list) {
            System.out.println(vo_board.getPOSTNUMBER());
            System.out.println(vo_board.getTITLE());
            System.out.println(vo_board.getAUTHOR());
            System.out.println(vo_board.getCREATIONDATE());
        }

        request.setAttribute("list", list);
       // model.addAttribute("list", list);
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
