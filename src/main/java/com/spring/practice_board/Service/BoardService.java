package com.spring.practice_board.Service;

import com.spring.practice_board.DAO.BoardDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class BoardService {

    @Autowired
    BoardDao boardDao;

    public List<Map<String, String>> boardList(){
        List<Map<String, String>> list = new ArrayList<>();
        list = boardDao.boardList();

        return list;

    }
}
