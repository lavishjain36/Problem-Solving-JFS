package com.day1;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		int n=sc.nextInt();//123
		int sum=sumofdigits(n);
		System.out.println(sum);

	}

	//create separate 
	private static int sumofdigits(int n) {
		int sum=0;
		while(n!=0) {
			sum+=n%10;//3+2->5+1->6
			n/=10;//12/10->1/10->0
		}
	    return sum;
	}

}



//Time-log10(n)
//Space-O(1)