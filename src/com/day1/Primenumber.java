package com.day1;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		
		if(isPrime(num)) {
			System.out.println(num+" is prime number");
		}else {
			System.out.println(num+" is not prime number");
		}
		
		
	}

	//develop method to check if number is prime
	public static boolean isPrime(int num) {
		if(num<=1) {
			return false;//not prime
		}
		
		//any number having more than one factor can not be prime
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;//not prime number
			}
		}
		return true;//prime if it is only divisible by itslef
		
	}
}
//time complexity-O(log n)
//space complexity-O(1)