package spring.aop.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import spring.aop.entity.Exam;


@Component("exam")
public class NewlecExam implements Exam {
	
	

	@Value("20")
	private int kor;
	@Value("20")
	private int eng;
	@Value("20")
	private int math;
	@Value("20")
	private int com;
	
	
	
	public NewlecExam(int kor,int eng,int math, int com) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.com = com;
	}
	
	
	public int getKor() {
		return kor;
	}


	public void setKor(int kor) {
		this.kor = kor;
	}


	public int getEng() {
		return eng;
	}


	public void setEng(int eng) {
		this.eng = eng;
	}


	public int getMath() {
		return math;
	}


	public void setMath(int math) {
		this.math = math;
	}


	public int getCom() {
		return com;
	}


	public void setCom(int com) {
		this.com = com;
	}

	
		
	
	@Override
	public String toString() {
		return "NewlecExam [kor=" + kor + ", eng=" + eng + ", math=" + math + ", com=" + com + "]";
	}


	public NewlecExam() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public float avg() {
		// TODO Auto-generated method stub
		float result = total()/4.0f;
			
		return result;
	}
	
	@Override
	public int total() {
		// TODO Auto-generated method stub
		
	
		
		int result = kor+eng+math+com;
		
	
		System.out.println("total result : " + result);
	
		
		return result;
	}
}
 