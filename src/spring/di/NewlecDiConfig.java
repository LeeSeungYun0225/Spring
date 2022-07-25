package spring.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;

//xml파일을 대체함 
//컴포넌트를 스캔할 패키지 경로 설정 
@ComponentScan({"spring.di.ui","spring.di.entity"})
@Configuration
public class NewlecDiConfig {
	
	
	//@Bean :: IOC컨테이너에 객체를 담아주는 역할 
	// 함수명으로 사용된 이름 (exam)이 id를 의미한다.
	@Bean
	public Exam exam()
	{
		return new NewlecExam();
	}
}
