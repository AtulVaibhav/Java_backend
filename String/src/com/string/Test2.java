package com.string;

public class Test2 {

	public static void main(String[] args) {
//		String str = "Java";
//		String str1 = "java";
		
		String str = new String("Java");
		String str1 = new String("Java");
		if(str==str1){
			System.out.println("Both point to same object");
		}else{
			System.out.println("Both point to different object");
		}
		
		//1.length()
		String data = "Encyclopedia";
		System.out.println(data.length());
		//2.toUppercase
		System.out.println(data.toUpperCase());
		//3.toLowercase
		System.out.println(data.toLowerCase());
		//4.indexOf(char ch)
		System.out.println(data.indexOf('n'));
		//5.charAt(int)
		System.out.println(data.charAt(1));
		//6.subString(startIndex,endingIndex)
		System.out.println(data.substring(1, 4));
		//7.split()
		String data2 = "Java is a programming language";
		String[] arr = (data2.split(" "));
		for(String ele:arr){
			System.out.println(ele);
		}
		//8.concat()
		System.out.println(data+data2);
		
		//9.equals:comparing content
		String str4 ="hello";
		String str5 = "hello";
		System.out.println(str4.equals(str5));
		
		//10. == : compare location
		System.out.println(str4==str5);
		//toCharArray()
		char ch[] = str4.toCharArray();
	}

}
