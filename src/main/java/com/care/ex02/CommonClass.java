package com.care.ex02;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import com.care.member_dto.MemberLogDTO;
@Aspect //"공통기능으로 사용하겠다" 라는 어노테이션
public class CommonClass {
	
	MemberLogDTO logdto = null;
	@Around("within(com.care.ex02.*)")
	public void commonAOP(ProceedingJoinPoint joinpoint) {
		try {
			System.out.println("===공통 기능 시작===");
			joinpoint.proceed();//comminAop 기능이 일시중지되고 coreclass가 실행된다
			System.out.println("===공통 기능 종료===");
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	@Before("execution(* com.care.ex02.CoreClass.start())")
	public void beforeAdvice() {
		
		long starttime = System.currentTimeMillis(); 
		SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		String str = dayTime.format(new Date(starttime));
		
		logdto.setStarttime(str);


	}
	
	
}
