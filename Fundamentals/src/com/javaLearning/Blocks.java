package com.javaLearning;

class Java{
	//static block
	static{
		System.out.println("static block executed...");
	}
	
	//instance initialization block
	{
		System.out.println("IIB executed");
	}
	
}


public class Blocks {

	public static void main(String[] args) {
		Java ob = new Java();
		Java ob1 = new Java();
		Java ob2 = new Java();

	}

}
