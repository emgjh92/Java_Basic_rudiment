package constructor;

public class Student {
	private String name;
	private int kor;
	private int mat;
	private int eng;
	
	public Student() {
		
		super();
	}
	public Student(String name, int kor, int mat,int eng) {
		this.name=name;
		this.kor=kor;
		this.mat=mat;
		this.eng=eng;
		
	}
	public String toString() {
		
		return name + "의 점수는" + getTotal() +"이며, 평균은"+String.format("%.2f",getAvg())+"이고 학점은 "+getGrade()+"입니다." ;
	}
	public int getTotal() {
		return kor+mat+eng;
	}
	public double getAvg() {
		return getTotal()/3.0;
	}
	public char getGrade() {
		switch ((int)getAvg()/10) {
		case 10:
		case 9 :	return 'A';
		case 8 :	return 'B';
		case 7 :	return 'C';
		case 6 :	return 'D';
		default: return 'F';

		} 
	}
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getMat() {
		return mat;
	}
	public int getEng() {
		return eng;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}

	

	
}
