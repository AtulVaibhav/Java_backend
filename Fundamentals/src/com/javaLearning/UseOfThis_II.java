package com.javaLearning;

 
class Vehicle{
	Vehicle(){
		this(10);
		System.out.println("default constructor is called");
		
	}
	Vehicle(int wheels){
	
		System.out.println("parameterized constructor is called");
	}
}


public class UseOfThis_II {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();

	}

}
