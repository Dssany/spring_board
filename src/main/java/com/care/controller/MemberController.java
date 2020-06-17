package com.care.controller;

import javax.servlet.http.HttpServletRequest;

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
import com.care.template.Constant;

@Controller
public class MemberController {
	
	public MemberController() {
		String config = "classpath:applicationJDBC.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(config);
		JdbcTemplate template = ctx.getBean("template",JdbcTemplate.class);//template.xml 객체를 생성해서 저장
		Constant.template = template;//스태틱 변수에저장
		System.out.println("====멤버 컨트롤러 실행 ====");
	}
	
	
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
		jdbc = new MemberLoginImpl();
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
		jdbc = new MemberContentServiceImpl();
		jdbc.execute(model);
		
		
		return "member/memberInfo";
	}
	
	@RequestMapping("select")
	public String selectid(@RequestParam String id,Model model) {
		model.addAttribute("id",id);
		jdbc = new MemberSelectImpl();
		jdbc.execute(model);
		return "member/selectInfo";
	}
	
}
