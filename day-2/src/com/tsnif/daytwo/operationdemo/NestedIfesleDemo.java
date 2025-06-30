package com.tsnif.daytwo.operationdemo;

public class NestedIfesleDemo {
	public static void main(String[] args) {
		//TODO Auto-generatated method atub
		int a=10,b=20,c=5;
		
		System.out.println("The largest no is : ");
	    
	    if(a>b)
	    {
	    	if(a>c) 
	    	{
	    		System.out.println(a);
	    	}
	    	else
	    	{
	    		System.out.println(c);
	    	}
	    }
	    else
	    {
	    	if(c>b)
	    	{
	    		System.out.println(c);
	    	}
	    	else
	    	{
	    		System.out.println(b);
	    	}
	    }
	}
	
}
