package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;

import spring.di.entity.Exam;

public class GridExamConsole implements ExamConsole {

	private Exam exam;
	
	
	public GridExamConsole() {
	
	}
	
	public GridExamConsole(Exam in) {
		
		
		exam = in;
	}
	
	
	@Override
	public void print() {
		System.out.println("----------------");
		System.out.println("|  total  | avg |");
		System.out.println("----------------");	
		System.out.printf("| %3d     | %3.2f|\n",exam.total(),exam.avg() );
		System.out.println("----------------");	
		
	}


	
	//객체 생성시 setter에 Autowired가 있는 경우 자동으로 di 해준다.
	//xml로 di시에는 namespace의 context config를 사용 설정하고 
	//<context:annotation-config/>를 입력해야 객체 생성시 autowired를 읽어옴  
	@Autowired
	@Override
	public void setExam(Exam exam) {
		this.exam = exam;
		
		
	}
}
