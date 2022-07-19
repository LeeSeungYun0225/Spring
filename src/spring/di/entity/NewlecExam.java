package spring.di.entity;
import spring.di.entity.Exam;


public class NewlecExam implements Exam {
	
	private int kor;
	private int eng;
	private int math;
	private int com;
	
	
	public NewlecExam() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public float avg() {
		// TODO Auto-generated method stub
		
		
		return total()/4.0f;
	}
	
	@Override
	public int total() {
		// TODO Auto-generated method stub
		
		return kor+eng+math+com;
	}
}
 