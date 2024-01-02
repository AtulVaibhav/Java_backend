package com.switch_statement;

import java.util.Scanner;

public class SwitchStatement {
    public static void getFactorial(Scanner sc){
    	int fact=1;
    	System.out.println("Enter the number to get factorial");
    	int number = sc.nextInt();
    	for(int i=1;i<=number;i++){
    		fact = fact*i;
    	}
    	System.out.println("Factorial of number :"+fact);
    }
    
    public static void getPowerOfNumber(Scanner sc){
    	int result=1;
    	System.out.println("Enter the base number");
    	int base = sc.nextInt();
    	System.out.println("Enter the value of power of number");
    	int power = sc.nextInt();
    	for(int i=1;i<=power;i++){
    		result = result*base;
    	}
    	System.out.println("Power of number :"+result);
    	
    }
    
    public static void getMultiple(Scanner sc){
    	System.out.println("Enter the  number");
    	int num = sc.nextInt();
    	for(int i=1;i<=10;i++){
    		System.out.println(num+" * "+i+" = "+(num*i));
    	}
    }
    
    public static void isPrimeNumber(Scanner sc){
    	boolean flag=true;
    	System.out.println("Enter the  number");
    	int num = sc.nextInt();
    	for(int i=2;i<=num/2;i++){
    		if(num%i==0){
    			flag = false;
    			break;
    		}
    	}
    	if(flag){
    		System.out.println("number is a prime number");
    	}else{
    		System.out.println("Number is not a prime number");
    	}
    	
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		do{
			System.out.println("Select to perform operations");
			System.out.println("Press  1.Factorial  2.Power   3.PrintTable 4.PrimeNumber");
		    
			int choice = sc.nextInt();
			switch(choice){
			case 1: getFactorial(sc);
			        break;
			case 2: getPowerOfNumber(sc);
			        break;
			case 3: getMultiple(sc);
			        break;
			case 4: isPrimeNumber(sc);
			        break;
			 default :System.out.println("Incorrect option");
			}
		  
			System.out.println("Do you want to continue:y/n");
			ch = sc.next().charAt(0);
		}while(ch=='y');
		System.out.println("Out of switch");
	}

}
