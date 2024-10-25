package com.day1;

import java.util.Scanner;

public class FactorialNumber {
   //main function
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		int num=sc.nextInt();
		long result=factorial(num);
		System.out.println(result);

	}

	//logic part
	public static long factorial(int num) {
		long fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;//24*5->120
		}
		return fact;
	}

}

//Time complexity-O(n)
//loop run 1 to n times->n time->
//Space complexity-O(1)->
//we are using few variable to meet 
