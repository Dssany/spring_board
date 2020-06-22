package com.care.boardService;

import org.springframework.ui.Model;

public class BoardinsertImpl implements BoardService{

	@Override
	public void execute(Model model) {
		model.addAttribute("insert",dao.insert());
		
	}
	
}
