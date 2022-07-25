package spring.aop.advice;

import org.springframework.aop.ThrowsAdvice;

public class LogAfterThrowingAdvice implements ThrowsAdvice{

	//본래 메소드를 호출중 예외 발생시 수행됨 
	public void afterThrowing(IllegalArgumentException e) throws Throwable{
		
		System.out.println("예외가 발생하였습니다. : " + e.getMessage());
	}
	
}
