package spring.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.stereotype.Service;



public class LogAfterReturningAdvice implements AfterReturningAdvice{

	// 수행 완료 후에 리턴 데이터로 처리할 로직 
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		
		System.out.println("return : " + returnValue + ", method : " + method.getName());
		
	}

}
