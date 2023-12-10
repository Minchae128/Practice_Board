package com.spring.practice_board.DAO;

import com.spring.practice_board.VO.VO_board;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface BoardDao {

   /* public List<Map<String, String>> boardList();*/

    public List<VO_board> boardList();
}
