package spring.aop.entity;

import spring.aop.entity.Exam;

public class NewlecExam implements Exam {
	
	

	private int kor;
	private int eng;
	private int math;
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
		
		if(kor>100)
		{
			throw new IllegalArgumentException("유효하지 않은 점수입니다.");
		}
	
		
	
		
		return result;
	}
}
 