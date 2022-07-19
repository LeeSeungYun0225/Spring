package spring.di.ui;

import spring.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {

	private Exam exam;
	
	
	public InlineExamConsole() {
		
	}
	
	public InlineExamConsole(Exam in) {
		
		
		exam = in;
	}
	
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.printf("total is %d, avg is %f",exam.total(),exam.avg() );
	}


	@Override
	public void setExam(Exam exam) {
		this.exam = exam;
		
	}

}
