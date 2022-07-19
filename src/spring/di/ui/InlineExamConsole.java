package spring.di.ui;

import spring.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {

	private Exam exam;
	
	public InlineExamConsole(Exam in) {
		// TODO Auto-generated constructor stub
		
		exam = in;
	}
	
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.printf("total is %d, avg is %f",exam.total(),exam.avg() );
	}

}
