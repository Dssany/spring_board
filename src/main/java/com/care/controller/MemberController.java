package com.care.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.care.member_service.MemberContentServiceImpl;
import com.care.member_service.MemberLoginImpl;
import com.care.member_service.MemberSelectImpl;
import com.care.member_service.MemberService;

@Controller
public class MemberController {
	@Autowired
	@Qualifier("memberLoginImpl")
	private MemberService jdbc;
	
	@RequestMapping("index")
	public String index() {
		return "member/index";
	}
	
	
	@RequestMapping("loginpage")
	public String login() {
		return "member/login";
	}
	
	
	@RequestMapping("loginchk")
	public String loginchk(Model model,HttpServletRequest request) {
		model.addAttribute("request",request);
		jdbc.execute(model);
		
		return "member/sessionchk";
	}
	
	@RequestMapping("resultlogin")
	public String loginre() {
		return "member/successLogin";
	}
	
	@RequestMapping("logout")
	public String loginout() {
		
		return "member/logoutchk";
	}
	
	
	@RequestMapping("memberInfo")
	public String memberInfo(Model model) {
		jdbc = (MemberService)AC.ac.getBean("memberContentServiceImpl");
		jdbc.execute(model);
		
		
		return "member/memberInfo";
	}
	
	@RequestMapping("select")
	public String selectid(@RequestParam String id,Model model) {
		model.addAttribute("id",id);
		jdbc = (MemberService)AC.ac.getBean("memberSelectImpl");
		jdbc.execute(model);
		return "member/selectInfo";
	}
	
}
