package com.javaLearning;

class Product{
	int productId;
	String productName;
	
	public Product(int productId, String productName) {
		this.productId = productId;
		this.productName = productName;
	}
	
	public void show(){
		System.out.println(this.productId+" "+this.productName);
	}
	
	
}

public class UseOfThis_III {

	public static void main(String[] args) {
		Product p1 = new Product(101,"Laptop");
		p1.show();
	}

}
