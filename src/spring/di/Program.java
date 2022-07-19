package spring.di;
 // spring 없이 di 해보기 

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {
	
	public static void main(String[] args) {
		Exam exam = new NewlecExam();
		//ExamConsole console = new InlineExamConsole(exam); // di
		ExamConsole console = new GridExamConsole(exam);
		// InlineExamConsole & GridExamConsole과 같이 새로운 클래스로 변경할 시 위와 같이 코드를 변경해야 하는 문제 발생
		// 이를 막기위해 ExamConsole console = ?에서 ?자리를 스프링이 대신 채워넣어주는, 따라서 코드의 
		console.print();
		
		
	}
		
}
	