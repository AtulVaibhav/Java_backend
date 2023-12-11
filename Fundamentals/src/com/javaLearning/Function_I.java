package com.javaLearning;

public class Function_I {
	//function with void as return type
    //access_modifier return_type nameOfFunction(){}
	public void greet(){
		System.out.println("Good Evening");
	}
	//function with int as return type
	public int getData(){
		return 100;
	}
	
	public String getMsg(String name){
		return "Good Evening "+name; 
	}
	
	public boolean isEven(int num){
		if(num%2==0){
			return true;
		}
		return false;
	}
	
	
	public static void doSomething(){
		System.out.println("Hello Fn");
	}
	
	
	public static void main(String[] args) {
		Function_I obj = new Function_I();
        obj.greet();
        
       int box =  obj.getData();
       System.out.println(box);
       
       String box2 = obj.getMsg("Aman");
       System.out.println(box2);
       
       System.out.println( obj.getData());
       
       
       System.out.println(obj.isEven(12));
       
       Function_I.doSomething();
	}

}
