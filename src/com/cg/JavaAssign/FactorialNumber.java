package com.cg.JavaAssign;

import java.util.*;


public class FactorialNumber{
	static String string;
	  static String str1[]={"","one","two","three","four","five","six","seven","eight","nine"};
	  static String str2[]={"hundred","thousand","lakh","crore"};
	  static String str3[]={"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	  static String str4[]={"twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};

	static int factorial(int num) {
		if(num == 0 || num ==1) {
			return 1;
		}
		
		else {
			return (num*factorial(num-1));
		}
	}

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);	
	System.out.println("Enter the number: ");
	int num = scan.nextInt();
	
	int result = factorial(num);
	System.out.println(num+"! = "+result+ " "+"(" +convert_to_words(result)+")");
	
	}
	public static String convert_to_words(int n)
	  {
	    int word;
	    int num=1;
	    string="";
	    while(n!=0)
	    {
	        switch(num)
	        {
	        case 1:
	            word=n%100;
	            pass(word);
	            if(n>100&&n%100!=0)
	            {
	                show("and ");
	            }
	            n=n/100;
	            break;
	        case 2:
	            word=n%10;
	            if(word!=0)
	            {
	                show(" ");
	                show(str2[0]);
	                show(" ");
	                pass(word);
	            }
	            n=n/10;
	            break;
	        case 3:
	            word=n%100;
	            if(word!=0)
	            {
	                show(" ");
	                show(str2[1]);
	                show(" ");
	                pass(word);
	            }
	            n=n/100;
	            break;
	        case 4:
	            word=n%100;
	            if(word!=0)
	            {
	                show(" ");
	                show(str2[2]);
	                show(" ");
	                pass(word);
	            }
	            n=n/100;
	            break;
	        case 5:
	            word=n%100;
	            if(word!=0)
	            {
	                show(" ");
	                show(str2[3]);
	                show(" ");
	                pass(word);
	            }
	            n=n/100;
	            break;
	        }
	        num++;
	    }
	    return string;
	  }
	  public static void pass(int n)
	  {
	    int word,q;
	    if(n<10)
	    {
	        show(str1[n]);
	    }
	    if(n>9&&n<20)
	    {
	        show(str3[n-10]);
	    }
	    if(n>19)
	    {
	        word=n%10;
	        if(word==0)
	        {
	            q=n/10;
	            show(str4[q-2]);
	        }
	        else
	        {
	            q=n/10;
	            show(str1[word]);
	            show(" ");
	            show(str4[q-2]);
	        }
	    }
	  }
	  public static void show(String s)
	  {
	    String str=string;
	    string=s+str;
	  }
	}
