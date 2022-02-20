package com.cg.JavaAssign;
import java.util.*;
public class NumbersToWords {
	static String string;
	  static String singleDigit[]={"","one","two","three","four","five","six","seven","eight","nine"};
	  static String tensPower[]={"hundred","thousand","lakh","crore"};
	  static String twoDigits[]={"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	  static String tensMultiple[]={"twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};

	  public static void main(String args[])
	  {
	    Scanner in=new Scanner(System.in);
	    System.out.println("Enter the number: ");
	    System.out.println(convert_to_words(in.nextInt()));
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
	                show(tensPower[0]);
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
	                show(tensPower[1]);
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
	                show(tensPower[2]);
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
	                show(tensPower[3]);
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
	        show(singleDigit[n]);
	    }
	    if(n>9&&n<20)
	    {
	        show(twoDigits[n-10]);
	    }
	    if(n>19)
	    {
	        word=n%10;
	        if(word==0)
	        {
	            q=n/10;
	            show(tensMultiple[q-2]);
	        }
	        else
	        {
	            q=n/10;
	            show(singleDigit[word]);
	            show(" ");
	            show(tensMultiple[q-2]);
	        }
	    }
	  }
	  public static void show(String s)
	  {
	    String str=string;
	    string=s+str;
	  }
	}


