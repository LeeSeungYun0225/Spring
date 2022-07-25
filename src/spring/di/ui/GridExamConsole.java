package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import spring.di.entity.Exam;


@Component("console")
public class GridExamConsole implements ExamConsole {

	//Autowired는 field/생성자/setter에 사용 가능 
	
	
	
	//@Autowired(required=false) :: 해당 객체가 반드시 존재해야 하는지를 설정 가능 
	@Autowired
	@Qualifier("exam1")
	// 기본 생성자를 호출하며 인젝션 수행 - 기본생성자가 없으면 오류 발생함.
	//오버로드 생성자가 없으면 기본생성자는 자동 생성되므로 문제없음
	private Exam exam;
	
	
	public GridExamConsole() {
		System.out.println("constructor");
	}
	
	
	//@Autowired
	//@Qualifier("exam1")
	//오버로드 생성자는 Qualifier를 지정시 빨간줄이 그어짐
	// 이는 필드나 세터와 달리 파라미터로 동일 객체가 여러개 받아질 수 있기 때문임
	//따라서 각각의 파라미터에 @Qualifier를 이용해 지정
	public GridExamConsole(@Qualifier("exam1")Exam in) {
		System.out.println("overload constructor");
		
		exam = in;
	}
	
	
	@Override
	public void print() {
		
		if(exam==null)
		{
			System.out.println("----------------");
			System.out.println("|  total  | avg |");
			System.out.println("----------------");	
			System.out.printf("| %3d     | %3.2f|\n",0,0.0 );
			System.out.println("----------------");	
		}
		else
		{
			System.out.println("----------------");
			System.out.println("|  total  | avg |");
			System.out.println("----------------");	
			System.out.printf("| %3d     | %3.2f|\n",exam.total(),exam.avg() );
			System.out.println("----------------");	
		}
		
		
	}


	
	//객체 생성시 setter에 Autowired가 있는 경우 자동으로 di 해준다.
	//xml로 di시에는 namespace의 context config를 사용 설정하고 
	//<context:annotation-config/>를 입력해야 객체 생성시 autowired를 읽어옴  
	//Autowired의 대상은 IOC 컨테이너에 존재하는 대상 객체중 id값이 세터의 파라미터 변수와 같은것을 대상으로 한다.
	// 아래 setExam에서는 id가 exam인 Exam클래스의 객체를 Autowire해줌.
	//혹은 Qualifier를 이용해 id값을 지정해 줄수 있다.
	
	//세터함수가 호출 되면서 인젝션 수행 
//	@Autowired
//	@Qualifier("exam1")
//	@Override
	public void setExam(Exam exam) {
		System.out.println("setter");
		this.exam = exam;
		
		
	}
}
