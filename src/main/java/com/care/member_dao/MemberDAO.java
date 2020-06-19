package com.care.member_dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.care.member_dto.MemberDTO;

@Repository
public class MemberDAO {
	
	
	
	
	@Autowired
	private SqlSession sqlSession;
	public static final String namespace="com.care.mybatis.myMapper";
	
	
	
	public ArrayList<MemberDTO> login(String id,String pw) {
		String sql = "select * from member02";
		ArrayList<MemberDTO> dto = null;
		dto = (ArrayList<MemberDTO>)template.query(sql, new BeanPropertyRowMapper<MemberDTO>(MemberDTO.class));
		
//		for (MemberDTO value : dto) {
//			if(id.equals(value.getId()) && pw.equals(value.getPw())){
//				System.out.println("로그인성공");
//			}else if(id.equals(value.getId()) && !pw.equals(value.getPw())) {
//				System.out.println("비밀번호 불일치");
//			}else {
//				System.out.println("존재하지 않는 회원, 회원가입 바랍니다");
//			}
//		}
		return dto;
		
	}
	
	public ArrayList<MemberDTO> list() {
		String sql = "select * from member02";
		ArrayList<MemberDTO> list = null;
		try {
			list = (ArrayList<MemberDTO>)template.query(sql, new BeanPropertyRowMapper<MemberDTO>(MemberDTO.class));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	
	public MemberDTO select(String id) {
		String sql = "select * from member02 where id='"+ id + "'";
		MemberDTO dto =null;
		
		try {
			dto = template.queryForObject(sql, new BeanPropertyRowMapper<MemberDTO>(MemberDTO.class));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//하나의 값을 얻어오기 위해 queryForObject를 사용
		
		return dto;
		
		
		
	}
	
	
	
	
	
	
}
