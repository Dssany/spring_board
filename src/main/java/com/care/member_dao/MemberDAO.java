package com.care.member_dao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.care.member_dto.MemberDTO;
import com.care.member_dto.MemberLogDTO;

@Repository
public class MemberDAO {
	
	
	
	
	@Autowired
	private SqlSession sqlSession;
	public static final String namespace="com.care.mybatis.myMapper";
	
	
	
	public List<MemberDTO> list() {
		return sqlSession.selectList(namespace + ".listAll");
		
	}
	public int login(@RequestParam HttpServletRequest re,@RequestParam HttpSession session) {
		List<MemberDTO> list = sqlSession.selectList(namespace + ".listAll");
		String id = re.getParameter("id");
		String pw = re.getParameter("pw");
		
		
		for (MemberDTO value : list) {
			if(id.equals(value.getId())&& pw.equals(value.getPw())){
				System.out.println("로그인성공");
				session.setAttribute("id", id);
				session.setAttribute("pw", pw);
				return 1;
			}else if(id.equals(value.getId())&& !pw.equals(value.getPw())){
				System.out.println("비밀번호 오류");
				return 0;
			}else {
				System.out.println("존재하지 않는회원");
				return 0;
			}
			
		}
	return 0;
		
	}
		
	public List<MemberLogDTO> log(){
		return sqlSession.selectList(namespace + ".log");
	}
	
	public MemberDTO select(String id) {
		try {
			return sqlSession.selectOne(namespace + ".list",id);//하나의 값만 넘길 수 있다
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return null;
		
		
		
		
//		String sql = "select * from member02 where id='"+ id + "'";
//		MemberDTO dto =null;
//		
//		try {
//			dto = template.queryForObject(sql, new BeanPropertyRowMapper<MemberDTO>(MemberDTO.class));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		//하나의 값을 얻어오기 위해 queryForObject를 사용
		
//		return dto;
		
		
		
	}
	
	
	
	
	
	
}
