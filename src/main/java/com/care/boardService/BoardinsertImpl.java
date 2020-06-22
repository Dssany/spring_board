package com.care.boardService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.care.board_dao.BoardDAO;
@Service
public class BoardinsertImpl implements BoardService{
	@Autowired
	private BoardDAO dao;
	@Override
	public void execute(Model model) {
		
		
		System.out.println(dao.insert());
		dao.insert();
		
	}
	
}
