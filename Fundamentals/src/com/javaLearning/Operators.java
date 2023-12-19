package com.javaLearning;

public class Operators {
   int a = 10;
   int b = 5;
   boolean c = true;
	public void arithmeticOperators(){
		System.out.println("Addition :"+(this.a+this.b));
		System.out.println("Subtraction :"+(this.a-this.b));
		System.out.println("Multiplication :"+(this.a*this.b));
		System.out.println("Division :"+(this.a/this.b));
		System.out.println("Modulus :"+(this.a%this.b));
	}
	
	public void unaryOperator(){
		System.out.println("Minus :"+(-this.a));
		System.out.println("Not :"+ !(this.c));
		int data = a++;
		/*
		 * data = a
		 * a = a+1;
		 */
		System.out.println("Increment :"+data + " "+this.a);
		
		int data2 = ++b;
		System.out.println("Increment :"+data2+" "+this.b);
	}
	
	//compare :boolean
	public void relationalOperators(){
		System.out.println("a :"+this.a);
		System.out.println("b :"+this.b);
		System.out.println("Equal :"+(this.a==this.b));
		System.out.println("Greater than :"+(this.a>this.b));
		System.out.println("Greater than equals :"+(this.a>=this.b));
		System.out.println("Lesser than :"+(this.a<this.b));
		System.out.println("Lesser than equal :"+(this.a<=this.b));
		System.out.println("Not equal to :"+(this.a!=this.b));
	}
	
	public void ternaryOperator(){
		// condition ? res1 : res2
		System.out.println("Ternary :"+((this.a < this.b)?"Java":"Python"));
		String data = (this.a>this.b)?(this.a==this.b)?"Hello":"hey":(this.a<=this.b)?"Java":"Python";
	    System.out.println(data);
	}
	
	public void logicalOperators(){
		System.out.println("AND :"+((this.a==this.b) && (this.a>this.b)));
		System.out.println("OR  :"+((this.a==this.b) || (this.a>this.b)));
		System.out.println("NOT :"+!(!(this.a==this.b) && (this.a>this.b)));
	}
	public void bitwiseOperator(){
		int num1 = 8; //1 0 0 0  = -(n+1)
		int num2 = 4; //0 1 0 0
		
		System.out.println("Bitwise AND :"+(num1 & num2));
		System.out.println("Bitwise OR  :"+(num1 | num2));
		System.out.println("Bitwise XOR :"+(num1 ^ num2));
		System.out.println("Compliment Operator :"+(~num2));
	}
	
	public void shiftOperator(){
		int num = 10;
		System.out.println("Left shift :"+ (num<<2));//10 *2*2
		System.out.println("Right shift :"+ (num>>2));//10/2
	}
	
	public void instanceOperator(){
		String str = "Java";
		System.out.println(str instanceof String);
		System.out.println(str instanceof Object);
		
	}
	public static void main(String[] args) {
		Operators op = new Operators();
		op.arithmeticOperators();
		op.unaryOperator();
		op.relationalOperators();
		
//		Operators op1 = new Operators();
//		System.out.println(op1.a);
		
		op.ternaryOperator();
		op.logicalOperators();
		op.bitwiseOperator();
		op.shiftOperator();
		op.instanceOperator();
		
	}

}
