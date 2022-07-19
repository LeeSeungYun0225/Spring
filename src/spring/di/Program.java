package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;


//#1 Xml을 활용 


public class Program {
	
	public static void main(String[] args) {
		
		// xml 지시서로 변경 
		/*Exam exam = new NewlecExam();
		//ExamConsole console = new InlineExamConsole(exam); // di
		ExamConsole console = new GridExamConsole();
	
		console.setExam(exam);
		
		*/
		
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/di/setting.xml");
		
		//ExamConsole console = (ExamConsole) context.getBean("console");
		ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
		
		
	}
		
}
	