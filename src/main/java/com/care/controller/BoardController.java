package com.care.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.care.boardService.BoardService;
import com.care.boardService.BoardinsertImpl;

@Controller
public class BoardController {
	
	@Autowired
	@Qualifier("boardListImpl")
	private BoardService bs;
	
	
	@RequestMapping("board")
	public String board(Model model) {
		bs.execute(model);
		return "board/board";
	}
	
	@RequestMapping("boardinsert")
	public String insert(Model model) {
		bs = (BoardService)AC.ac.getBean("boardinsertImpl");
		bs.execute(model);
		return "board/insert";
	}
}
