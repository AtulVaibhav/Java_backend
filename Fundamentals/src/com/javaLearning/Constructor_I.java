package com.javaLearning;
/*
 * Constructor:
 * -special function having name which matches className
 * -they don't have return type.
 * -access_modifier nameOfFn(){}
 * -Constructor is used to instantiate a class
 * -Types of constructor: 1.default constructor 2.parameterized constructor
 */

class Box{
	//No-args constructor (default constructor)
	public  Box(){
		System.out.println("Box is created..");
	}
}

public class Constructor_I {

	public static void main(String[] args) {
		//ClassName objName = new ClassName();
		Box box = new Box();
        Box box1 = new Box();
	}

}
