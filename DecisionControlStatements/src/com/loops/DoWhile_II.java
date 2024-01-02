package com.loops;

import java.util.Scanner;

public class DoWhile_II {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//input from user
		int sum= 0;
		int choice;
		do{
			System.out.println("Enter the number");
			int num = sc.nextInt();
			if(num!=0){
				sum = sum+num;
			}
			System.out.println("Do you want to continue ?y/n(1:0)");
			choice = sc.nextInt();
			
		}while(choice!=0);
	}

}
