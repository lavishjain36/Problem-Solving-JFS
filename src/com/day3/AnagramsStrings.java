package com.day3;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramsStrings {

	public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
		   
		   String str1=sc.nextLine();//listen
		   String str2=sc.nextLine();//silent
		   
		   
		   //create 
		  if( checkifanagram(str1,str2)) {
			  System.out.println("Anagrams");
		  }else {
			  System.out.println("Not Anagrams");
		  }



	}

	private static boolean checkifanagram(String str1, String str2) {
		if(str1.length()!=str2.length()) {
			return false;
		}
		
		//
	char[] array1=	str1.toCharArray();
	char[] array2=	str2.toCharArray();

	//sort the arrays
	Arrays.sort(array1);
	Arrays.sort(array2);
	
	//compare 
	

	return Arrays.equals(array1, array2);
		
	}

}
