package com.javaLearning;

/**
 * non-static fn : non-static as well as static data
 * static fn : static data
 *
 */

public class Function_II {
    int data  = 100;
    static int data2 = 200;
    
    public void fn1(){
    	System.out.println(data);
    	System.out.println(data2);
    }
    
    public static void fn2(){
    	System.out.println(data2);
    	System.out.println(new Function_II().data);
    }
	public static void main(String[] args) {
		Function_II obj = new Function_II();
		obj.fn1();
		
		Function_II.fn2();

	}

}

//WAP to calculate SimpleInterest
//WAP to calculate perimeter and area of circle.


