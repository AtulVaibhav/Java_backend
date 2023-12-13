package com.javaLearning;

class StudentInfo{
	 int studentId;
	 String studentName;
	
	public StudentInfo(int studentId,String studentName){
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public String toString(){
		return "StudentId: "+studentId+" StudentName: "+studentName;
	}
}


public class UseOfThis_I {

	public static void main(String[] args) {
		StudentInfo s1 = new StudentInfo(101,"Harsh");
		System.out.println(s1);

	}

}
