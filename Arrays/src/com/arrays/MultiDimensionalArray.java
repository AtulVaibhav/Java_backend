package com.arrays;

import java.util.Scanner;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		int[][] arr={{21,22,23,24},{31,32},{41,42,43,44}};
		System.out.println(arr.length);
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
        
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter tyhe number of rows");
		int rows = sc.nextInt();
		System.out.println("Enter the number of columns");
		int col = sc.nextInt();
		int [][] arr2 = new int[rows][col];
		System.out.println("Enter the elements");
		for(int i=0;i<rows;i++){
			for(int j=0;j<col;j++){
				arr2[i][j] = sc.nextInt();
			}
		}
		System.out.println("Displaying elements :");
		for(int i=0;i<rows;i++){
			for(int j=0;j<col;j++){
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Enter the row value");
		int x = sc.nextInt();
		System.out.println("Enter the col value");
		int y = sc.nextInt();
		for(int i=0;i<rows;i++){
			for(int j=0;j<col;j++){
				if(i==x || j==y){
					arr2[i][j] = 0;
				}
			}
		}
		System.out.println("Displaying elements :");
		for(int i=0;i<rows;i++){
			for(int j=0;j<col;j++){
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
