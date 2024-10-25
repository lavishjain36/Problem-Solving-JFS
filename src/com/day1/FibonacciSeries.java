package com.day1;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		int n=sc.nextInt();
		findfibonaccci(n);

	}

	public static void findfibonaccci(int n) {
		int ft=0, st=1;
		
		for(int i=1;i<=n;i++) {
			System.out.print(ft+" ");
			//calculate next term
			int nt=ft+st;//1->addition of previous 2 terms.
			ft=st;//1
			st=nt;//1
		}
		
		
	}

}

//Time->n times->O(n)-Linear complexity
//Space->O(1)->constant space complexity
