package com.care.member_dao;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

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
