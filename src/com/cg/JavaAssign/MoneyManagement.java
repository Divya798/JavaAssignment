package com.cg.JavaAssign;

import java.util.Scanner;

public class MoneyManagement {
	public static  void myMethod(int amt) {
		float NEC, FFA, EDU, LTSS, PLAY, GIVE;
		NEC = (55*amt)/100;
		System.out.println("NEC:"+NEC);
		
		FFA = (10*amt)/100;
		System.out.println("FFA: "+FFA);
		
		
		EDU =(10*amt)/100;
		System.out.println("EDU: "+EDU);
		
		
		LTSS =(10*amt)/100;
		System.out.println("LTSS: "+LTSS);
		
		
		PLAY =(10*amt)/100;
		System.out.println("PLAY: "+PLAY);
		
		
		GIVE =(10*amt)/100;
		System.out.println("GIVE: "+GIVE);
	    
	  }
	
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your income this month:");
			int a = sc.nextInt();
			myMethod(a);

	}

}
