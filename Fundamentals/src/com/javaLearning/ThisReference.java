package com.javaLearning;

class Car{
	Car(){
		System.out.println("Current value of this keyword :"+this.hashCode());
	}
}


public class ThisReference {

	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println("Value of c1 :"+ c1.hashCode());
		
		System.out.println("--------------------------------");
		Car c2 = new Car();
		System.out.println("Value of c2 :"+ c2.hashCode());
	}

}
