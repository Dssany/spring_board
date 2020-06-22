package com.care.board_dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.care.board_dto.BoardDTO;

@Repository
public class BoardDAO {
	@Autowired
	private SqlSession sqlSession;
	public static final String namespace="com.care.mybatis.myMapper";
	
	
	
	public List<BoardDTO> list(){
		return sqlSession.selectList(namespace + ".boardlist");
	}
	
	public int insert() {
		return sqlSession.insert(namespace + ".boardinsert");
	}
}
