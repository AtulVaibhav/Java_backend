package com.javaLearning;

//Parameterized constructor:to initialize object
//one or more args
class Student{
	 int studentId;
	 String studentName;
	 
	 public Student(int id,String name){
		 studentId = id;
		 studentName = name;
	 }
 
//	public void getStudentDetails(){
//		System.out.println("Id :"+studentId+" Name :"+studentName);
//	}
	 
	 public String toString(){
		 return "Id :"+studentId+" Name :"+studentName;
	 }
	
}

public class Constructor_III {

	public static void main(String[] args) {
		Student s1 = new Student(101,"Harsh");
		//System.out.println(s1.studentId);
		//System.out.println(s1.studentName);
		
		//s1.getStudentDetails();
		System.out.println(s1.toString());
	
		Student s2 = new Student(102,"Aman");
		//System.out.println(s2.studentId);
		//System.out.println(s2.studentName);
		//s2.getStudentDetails();
		System.out.println(s2.toString());

	}

}
//s1.toString()
//Employee : empId,empName, companyName