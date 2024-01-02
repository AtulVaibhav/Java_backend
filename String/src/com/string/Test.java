package com.string;


class Employee{
  @Override
  public String toString(){
	  return "Harsh";
  }
}
public class Test {

	public static void main(String[] args) {
		String str = "Java";
		System.out.println("Before Update");
		System.out.println(str.toString());
		str.concat("World");
		System.out.println(str.hashCode());
		System.out.println("After update");
		System.out.println(str);
		
		str = str.concat("Code");
		System.out.println(str.hashCode());
		System.out.println(str);
		
		Employee e = new Employee();
		System.out.println(e.toString());
		
	}

}
