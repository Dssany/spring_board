package com.care.member_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.care.member_dao.MemberDAO;
import com.care.member_dto.MemberDTO;
@Service
public class MemberContentServiceImpl implements MemberService{
	
	@Autowired
	private MemberDAO dao;
	
	@Override
	public void execute(Model model) {
		List<MemberDTO> list = dao.list();
		model.addAttribute("list",list);
	}
	
}
