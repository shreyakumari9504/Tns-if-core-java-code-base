package com.tsnif.daytwo.operationdemo;

public class IfDemo {
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		
		int x=3;
		
		if(x == 4)
			System.out.println("Value of x is 4:");
		else
		{
			System.out.println("value of x: "+ x);
			
		}
		
		int age=25;
		if(age >= 10)
		{
			System.out.println("you are eligible for voting");
		}
		else
		{
			System.out.println("Sorry, You need to wait more");
		}
		
		int z=8, y=7;
		int a=10, b=11;
		
		if(z>=y)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		if(! (a<b) || (a==b))
		{
			System.out.println("condition is true");
		}
		else
		{
			System.out.println("condition is false");
		}
		
	}

}
