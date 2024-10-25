package com.day4;

import java.util.Scanner;

public class SubstringMatch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();//hello world->11
		String substr=sc.nextLine();//world-5
		
		int result=	getsubstring(str,substr);
		
		if(result!=-1) {
			System.out.println(result);
		}else {
			System.out.println("-1");
		}
	}

	
	private static int getsubstring(String str, String substr) {
		for(int i=0;i<=str.length()- substr.length();i++) {
			if(str.substring(i,i+substr.length()).equals(substr)) {
				return i;
			}
		}
		return -1;
	}

}
