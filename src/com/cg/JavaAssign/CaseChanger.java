package com.cg.JavaAssign;

import java.util.*;

public class CaseChanger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");  
		String str= sc.nextLine();
		System.out.println("Upper Case: " + AllUpper(str));
		System.out.println("");
		System.out.println("Lower Case: " + Alllower(str));
		System.out.println("");
		System.out.println("Capitalize: " + CapitalLetter(str));
		System.out.println("");
		System.out.println("Sentence case: " + SentenceCase(str));
		System.out.println("");
		System.out.println("Invert: " + InvertCase(str));
	}
	
	public static String AllUpper(String str) {
		return str.toUpperCase();
	}
	
	public static String Alllower(String str) {
		return str.toLowerCase();
	}
	
	public static String CapitalLetter(String str) {
		
		char[] charArr = str.toCharArray();
		boolean foundSpace = true;
		
		for(int i=0; i<charArr.length; i++) {
			if (Character.isLetter(charArr[i])) {
			if (foundSpace) {
				charArr[i] = Character.toUpperCase(charArr[i]);
				foundSpace = false;
			}
			}
			else {
				foundSpace = true;
			}
		}
		
		str = String.valueOf(charArr);
		return str;
	}
	
	public static String SentenceCase(String str) {
		String first = str.substring(0,22);
		String remaining = str.substring(21, str.length());
		CapitalLetter(remaining);
		str = first + remaining;
		return str;
	}
	
	public static String InvertCase(String str) {
		StringBuffer newStr = new StringBuffer(str);
		for (int i = 0; i < str.length(); i++) {    
            
         if(Character.isLowerCase(str.charAt(i))) {    
            newStr.setCharAt(i, Character.toUpperCase(str.charAt(i)));    
        }    
         else if(Character.isUpperCase(str.charAt(i))) {    
             newStr.setCharAt(i, Character.toLowerCase(str.charAt(i)));    
        }        
    }    
		str= newStr.toString();
		return str;
}     
}