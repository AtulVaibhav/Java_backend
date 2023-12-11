package com.javaLearning;

/**
 * Static Variable
 * - static keyword
 * - related to class
 * - Using className ,we can access static variable
 * - static data are shared among objects.
 */
public class Variable_II {
    static int data = 300;
	public static void main(String[] args) {
		//Accessing static data : ClassName.variable_name
		System.out.println(Variable_II.data);
		Variable_II obj2 = new Variable_II();
		System.out.println(obj2.data);
		Variable_II obj3 = new Variable_II();
		System.out.println(obj3.data);
		
		System.out.println("After modification");
		obj2.data = 400;
		System.out.println(obj2.data);
		System.out.println(obj3.data);
		
		

	}

}
