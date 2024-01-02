package com.if_else;

public class Test {
    public void checkPositiveNumber(int number){
    	if(number>0){
    		System.out.println("Positive Number");
    	}else{
    		System.out.println("Negative Number");
    	}
    }
	public static void main(String[] args) {
		Test t = new Test();
		t.checkPositiveNumber(-12);
	}

}
