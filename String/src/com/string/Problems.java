package com.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class Problems {
    public static void reverseSentence(String str){
    	String[] newString = str.split(" ");
    	for(int i=newString.length-1;i>=0;i--){
    		System.out.print(newString[i]+" ");
    	}
    	System.out.println();
    }
    
    public static void reverseWord(String str){
    	String[] arr = str.split(" ");
    	String newString="";
    	for(int i=0;i<arr.length;i++){
    		newString = newString +" "+reverse(arr[i]);
    	}
    	System.out.println(newString);
    }
    private static String reverse(String str){
    	String rev="";
    	for(int i=str.length()-1;i>=0;i--){
    		rev = rev+str.charAt(i);
    	}
    	return rev;
    }
    
    
    public static void firstNonRepeating(String str){
    	Map<Character,Integer> map= new LinkedHashMap<>();
    	char[] arr = str.toCharArray();
    	for(char ch:arr){
    		if(!map.containsKey(ch)){
    			map.put(ch, map.getOrDefault(ch, 1));
    		}else{
    			map.put(ch, map.get(ch)+1);
    		}
    	}
    	
    	for(Map.Entry<Character, Integer> entry :map.entrySet()){
    		if(entry.getValue()==1){
    			System.out.println(entry.getKey());
    			break;
    		}
    	}
    }
    
    public static void firstCharacter(String str){
    	for(int i=0;i<str.length();i++){
    		int currentIndex = str.indexOf(str.charAt(i));
    		int lastIndex = str.lastIndexOf(str.charAt(i));
    		if(currentIndex==lastIndex){
    			System.out.print(str.charAt(i));
    			
    		}
    	}
    }
	public static void main(String[] args) {
		String str = "Java is a programming language";
		//reverseSentence(str);
		//reverseWord(str);
		String str2 = "hehllo";
		//firstNonRepeating(str2);
		firstCharacter(str2);
		

	}

}
