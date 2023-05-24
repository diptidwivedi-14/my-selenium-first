package com.org.automation.automobile;

public class Test {
	
	
	
	public static void main(String[] args)  {
		
		System.out.println("We are in main");
		
		int res = 0;
		
			try {
				res = print();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		
		
		System.out.println("Value of res ="+res);
		
		
	}
	
	public static int print() throws Exception{
		System.out.println("We are in print");
		int i = 100,res = 0;
		res = i/0;
		System.out.println("Exiting print");
		return res;
	}

}
