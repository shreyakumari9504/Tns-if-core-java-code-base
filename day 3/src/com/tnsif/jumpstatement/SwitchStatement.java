package com.tnsif.jumpstatement;

public class SwitchStatement {
	public static void main(String[] args) {
		
		int userInput=7;
		switch(userInput)
		{
		case 1:System.out.println("Current recharge detail ");
		break;
		
		case 2:System.out.println("Current recharge expiry");
		break;
		
		case 3:System.out.println("Now offers");
		break;
		
		case 4:System.out.println("Talk to our customer support person");
		break;
		
		default:
			System.out.println(userInput +" is not a valid user input");
				
		}			
		
	}

}
