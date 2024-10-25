package com.day4;

import java.util.Scanner;

public class StairCaseProblem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		 
		int countsteps=calculateways(n);
		System.out.println(countsteps);

	}

	private static int calculateways(int n) {
		//base-0 or 1 step->1 ways
		
		if(n==0||n==1) {
			return 1;
		}
		//create for n ways
		int[] ways=new int[n+1];
		
		ways[0]=1;//stay on ground->0 step
		ways[1]=1;//1 way to climb 1 step
		
		//DP solution to calculate -n ways
		for(int i=2;i<=n;i++) {
			ways[i]=ways[i-1]+ways[i-2];
		}
		return ways[n];
		
	}

}
