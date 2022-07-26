package spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class loggingAfterReturningAspect {
	
	@Pointcut("bean(exam)")
	private void loggingAfterPointcut() {}
	
	
	@AfterReturning(value = "loggingAfterPointcut()",returning ="obj")
	public void afterReturningLogging(JoinPoint joinPoint,Object obj)
	{
		System.out.println("log afterReturning : " + joinPoint.toString() + obj.toString());
	}
}
