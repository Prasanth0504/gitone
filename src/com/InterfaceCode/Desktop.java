package com.InterfaceCode;

public class Desktop implements Hardware,SoftwareResources{
	
	//Multiple Inheritance through Interface
	
	@Override
	public void SoftwareResources() {
		System.out.println("Method of softwareResources");
		
	}

	@Override
	public void HardwareResource() {
		
		System.out.println("method of Hardware resources");
		
		
	}

	public static void main(String[] args) {
		

		Desktop D=new Desktop();
		
		D.SoftwareResources();
		D.HardwareResource();
		
	
	}

	

}
