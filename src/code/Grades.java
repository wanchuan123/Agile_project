package code;


public class Grades {
	private String ID, name;
	private int lab1, lab2, lab3, midTerm, finalExam, totalGrade;
	
	public Grades() {
		
	}
	
	public Grades(String iD, String name, int lab1, int lab2, int lab3,
			int midTerm, int finalExam) {
		super();
		ID = iD;
		this.name = name;
		this.lab1 = lab1;
		this.lab2 = lab2;
		this.lab3 = lab3;
		this.midTerm = midTerm;
		this.finalExam = finalExam;
	}

	// totalGrade須四捨五入
	public int calculateTotalGrade(int[] weights){
		return 0;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLab1() {
		return lab1;
	}

	public void setLab1(int lab1) {
		this.lab1 = lab1;
	}

	public int getLab2() {
		return lab2;
	}

	public void setLab2(int lab2) {
		this.lab2 = lab2;
	}

	public int getLab3() {
		return lab3;
	}

	public void setLab3(int lab3) {
		this.lab3 = lab3;
	}

	public int getMidTerm() {
		return midTerm;
	}

	public void setMidTerm(int midTerm) {
		this.midTerm = midTerm;
	}

	public int getFinalExam() {
		return finalExam;
	}

	public void setFinalExam(int finalExam) {
		this.finalExam = finalExam;
	}

	public int getTotalGrade() {
		return totalGrade;
	}

	public void setTotalGrade(int totalGrade) {
		this.totalGrade = totalGrade;
	}
	
	
	
}