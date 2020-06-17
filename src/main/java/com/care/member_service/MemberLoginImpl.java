package com.care.member_service;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.care.member_dao.MemberDAO;
import com.care.member_dto.MemberDTO;


public class MemberLoginImpl implements MemberService {

	@Override
	public void execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest re = (HttpServletRequest)map.get("request");
		String id = re.getParameter("id");
		String pw = re.getParameter("pw");
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberDTO> list = dao.list();
		model.addAttribute("list",list);
		

	}

}
