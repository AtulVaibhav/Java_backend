package com.loops;

public class Whileloop_II {
   public static int getCount(){
	   int num =12111134;
	    int count= 0;
	   while(num>0){
		   int rem = num%10;
		   num = num/10;
		   if(rem==1)count++;
	   }
	   return count;
   }
   public static String sumOf3(){
	   int num = 32333334;
	   int sum=0;
	   int count=0;
	   while(num>0){
		   int rem = num%10;
		   num = num/10;
		   if(rem==3){
			   count++;
			   sum = sum+rem;
		   }
	   }
	   return "Count of 3 = "+count+" Sum of 3's = "+sum;
   }
	public static void main(String[] args) {
	  System.out.println(Whileloop_II.getCount());
	  System.out.println(Whileloop_II.sumOf3());

	}

}
