package com.arrays;

import java.util.Scanner;

public class Array_I {

	public static void main(String[] args) {
		//data_type [] arrName = {e1,e2,e3,...};
		int[] ar = {1,2,3,4,5};
        int ar2[] = {21,22,23};
        char [] ar3 = {'a','b','c'};
        Object[] ar4 = {1,1.4f,4.5,"hello",'a'};
        
        //reading size from console
        Scanner sc = new Scanner(System.in);
        System.out.println("enter of size of an array");
        int size = sc.nextInt();
        int[] arr5 = new int[size];
        
        System.out.println("Enter the elements");
        for(int i=0;i<size;i++){
        	arr5[i] = sc.nextInt();
        }
        
        System.out.println("Displaying elements");
        //read an array
        for(int i=0;i<size;i++){
        	System.out.print(arr5[i]+" ");
        }
        
        
        
        
        
        
        
        
	}

}
