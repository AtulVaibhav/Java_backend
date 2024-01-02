//WAP to find sum of elements of an array
package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayProblem_I {
    public static int getSum(int[] arr){
    	int sum=0;
    	for(int i=0;i<arr.length;i++){
    		sum = sum+arr[i];
    	}
    	return sum;
    }
    
    public static int getEvenSum(int[] arr){
    	int sum=0;
    	for(int i=0;i<arr.length;i++){
    		if(arr[i]%2==0)sum = sum+arr[i];
    	}
    	return sum; 
    }
    
    public static int findElement(int[] arr,int key){
    	return -1;
    }
    
    public static int peakElement(int[] arr2){
    	return 0;
    }
    
    public static int[] getAllPrime(int startingNumber,int endingNumber){
    	int[] arr = new int[100];
    	int j=0;
    	for(int i=startingNumber;i<=endingNumber;i++){
    		boolean isPrime = checkPrime(i);
    		if(isPrime){
    			arr[j++]=i;
    		}
    		
    	}
    	return arr;
    }
    
    private static boolean checkPrime(int num){
    	boolean isPrime =true;
    	for(int i=2;i<=num/2;i++){
    		if(num%i==0){
    			isPrime = false;
    			break;
    		}
    	}
    	return isPrime;
    }
    
    public static int secondLargestElement(int[] arr){
//    	for(int i=0;i<arr.length;i++){
//    		for(int j=i+1;j<arr.length;j++){
//    			if(arr[i]>arr[j]){
//    				int temp = arr[i];
//    				arr[i] = arr[j];
//    				arr[j] = temp;
//    			}
//    		}
//    	}
    	
    	Arrays.sort(arr);//TimSort O(nlogn)
    		
    		//sorted array
    		for(int data:arr){
    			System.out.print(data+" ");
    		}
    	
    	return arr[arr.length-2];
    }
	public static void main(String[] args) {
		int[] arr ={1,2,3,4,5,6};
		int[] arr2 = {5,10,20,15};
		//int sum = getSum(arr);
		//System.out.println("Sum of elements :"+sum);
      // System.out.println(getAllPrime(1, 100));
		
//		for(int data:getAllPrime(1, 100)){
//			System.out.print(data+" ");
//		}
		
		int[] arr3={12,23,22,25,35};
		int result = secondLargestElement(arr3);
		System.out.println();
		System.out.println(result);
		
	}

}
