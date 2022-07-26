package spring.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import spring.aop.advice.LogAfterReturningAdvice;
import spring.aop.advice.LogAfterThrowingAdvice;
import spring.aop.advice.LogAroundAdvice;
import spring.aop.advice.LogBeforeAdvice;
import spring.aop.aspect.loggingAfterAspect;
import spring.aop.aspect.loggingAfterReturningAspect;
import spring.aop.aspect.loggingAroundAspect;
import spring.aop.aspect.loggingAspect;
import spring.aop.entity.Exam;
import spring.aop.entity.NewlecExam;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan({"spring.aop.entity"})
public class AopConfig {

	@Bean
	public Exam exam()
	{
		return new NewlecExam();
	}
	
	
	@Bean
	public loggingAspect logging()
	{
		return new loggingAspect();
	}
	
	@Bean 
	public loggingAfterAspect loggingAfter()
	{
		return new loggingAfterAspect();
	}
	
	@Bean
	public loggingAfterReturningAspect loggingAfterReturning()
	{
		return new loggingAfterReturningAspect();
	}
	
	@Bean
	public loggingAroundAspect loggingAround()
	{
		return new loggingAroundAspect();
	}
	
}
