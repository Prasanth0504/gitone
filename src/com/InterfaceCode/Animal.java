package com.InterfaceCode;

public class Animal implements Birds{
	
	//Interface Code

	@Override
	public void eat() {
		
		System.out.println("Bird eating");
	}

	@Override
	public void sleep() {
		System.out.println("Bird sleeping");
		
	}
	
	public static void main(String[] args) {
		
		Animal A =new Animal();
		
		A.eat();
		A.sleep();
		
	}


}
