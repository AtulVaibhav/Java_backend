package com.javaLearning;

/**
 * Local Variable
 * - defined inside function/method
 * - we can't access local variable outside the function directly.
 *
 */


public class Variable_III {
	public void show(){
		int data = 100;
		System.out.println(data);
	}
	
	public int display(){
		int data2 = 200;
		return data2;
	}
	public static void main(String[] args) {
		Variable_III obj = new Variable_III();
		obj.show();
		
		int result = obj.display();
		System.out.println(result);

	}

}
