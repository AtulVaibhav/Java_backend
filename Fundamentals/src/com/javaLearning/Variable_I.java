package com.javaLearning;
/**
 * Instance Variable:
      - variable defined outside fn.
      - object is mandatory to access instance variables.
      - every object has its own copy of instance variable
 * 
 *
 */
public class Variable_I {
    int a = 200;
    
	public static void main(String[] args) {
		// ClassName objName  = new ClassName();
           Variable_I obj = new Variable_I();
           System.out.println(obj.a);
           Variable_I obj2 = new Variable_I();
           System.out.println(obj2.a);
           
           obj.a = 300;
           System.out.println("After modification :");
           System.out.println(obj.a);//300
           System.out.println(obj2.a);//200
           
	}

}
