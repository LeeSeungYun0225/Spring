package spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class loggingAfterAspect {
	

	@After("bean(exam)")
	public void loggingAfter(JoinPoint joinPoint)
	{
		System.out.println("log after"+joinPoint.toString());
	}
}
