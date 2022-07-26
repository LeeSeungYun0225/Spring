package spring.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class loggingAroundAspect {
	
	
	@Around("bean(exam)")
	public Object around(ProceedingJoinPoint joinPoint)
	{
		System.out.println("start logic");
		
		Object obj =null;
		
		try {
			obj = joinPoint.proceed(); // 실제 비즈니스 로직 실행 
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		System.out.println("end logic");
		
		return obj;
	}
}
