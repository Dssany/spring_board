package com.care.member_service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.care.member_dao.MemberDAO;

@Service
public class MemberLoginImpl implements MemberService {

	@Autowired
	private MemberDAO dao;
	
	@Override
	public void execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest re = (HttpServletRequest)map.get("request");
		HttpSession session = (HttpSession)map.get("session");
		
		int loginchk = dao.login(re,session);
		model.addAttribute("list",loginchk);
		
	}
	
	
	

}
