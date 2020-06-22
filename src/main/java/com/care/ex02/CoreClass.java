package com.care.ex02;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.care.member_dto.MemberLogDTO;

public class CoreClass {
	MemberLogDTO logdto = null;
	public void stat() {
		
		long starttime = System.currentTimeMillis(); 
		SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		String str = dayTime.format(new Date(starttime));
		
		logdto.setStarttime(str);


		
		
		System.out.println("corePrint 핵심 기능 실행");
	}
	public void end() {
		long endtime = System.currentTimeMillis(); 
		SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		String str = dayTime.format(new Date(endtime));
		logdto.setEndtime(str);
	}
	
}
