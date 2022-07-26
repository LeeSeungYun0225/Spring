package spring.aop.advice;

import java.lang.reflect.Method;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public class LogBeforeAdvice implements MethodBeforeAdvice{



	public void before(Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		
		
		System.out.println("Before Logic");
	}

}
