package com.cg.JavaAssign;
import java.util.*;

public class Permutation {
	
	public static void printArray(int[] a)
	{
		System.out.println("");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	public static void swap(int[] a, int i, int j)
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] =temp;
	}
	
	public static void printPermutation(int[] a, int cid) {
		if(cid == a.length-1) {
			{
				printArray(a);
				return;
			}
		}
		
		for (int i=cid; i<a.length; i++) {
			swap(a, i, cid);
			printPermutation(a, cid+1);
			swap(a, i, cid);
		}
	}


	public static void main(String[] args) {
		int[] a = {2, 8, 9};
		System.out.println("The Permutation of (2,8,9) are: ");
		printPermutation(a, 0);		
	}	
}
