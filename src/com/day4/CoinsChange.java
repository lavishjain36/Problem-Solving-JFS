package com.day4;

import java.util.Scanner;

public class CoinsChange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//target
		int amount=sc.nextInt();//5
		//denomination
		int n=sc.nextInt();//coins denomination
		
		int[] coins=new int[n];

		//read coins
		for(int i=0;i<n;i++) {
			coins[i]=sc.nextInt();//1 2 3
		}
		
		
	int result=	countways(coins,n,amount);
		
	System.out.println(result);
	}

	private static int countways(int[] coins, int n, int amount) {
		// TODO Auto-generated method stub
		
		int[] dp=new int[amount+1];
		
		//amount-0(no coins)
		dp[0]=1;
		
		
		for(int i=0;i<n;i++) {
			for(int j=coins[i];j<=amount;j++) {
				//update the number of ways to make change  amount j
				dp[j]+=dp[j-coins[i]];
			}
		}
		return dp[amount];
	}

}
//Time complexity-O(n)->target amount->n coins denominationT
//Time->O(n2)