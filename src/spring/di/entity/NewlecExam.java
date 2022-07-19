package spring.di.entity;
import spring.di.entity.Exam;


public class NewlecExam implements Exam {
	
	private int kor;
	private int eng;
	private int math;
	private int com;
	
	
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
 