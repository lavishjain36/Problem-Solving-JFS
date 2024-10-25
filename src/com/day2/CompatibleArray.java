package com.day2;

import java.util.Scanner;

public class CompatibleArray {

	public static void main(String[] args) {
		//take input from the user
				Scanner sc=new Scanner(System.in);
				
				int n=sc.nextInt();
				
				//create 2 array of n size->
				int[] array1=new int[n];
				int[] array2=new int[n];

				
				//read the values of the first array 
				for(int i=0;i<n;i++) {
					array1[i]=sc.nextInt();

				}
				
				//read the values of the second array 
				for(int i=0;i<n;i++) {
					array2[i]=sc.nextInt();

				}
				
				
			boolean result=checkcompatibility(array1,array2);
				
			if(result) {
				System.out.println("Compatible");
			}else {
				System.out.println("Not compatible");
			}
	}

	private static boolean checkcompatibility(int[] array1, int[] array2) {
		if(array1.length!=array2.length) {
			return false;
		}
		for(int i=0;i<array1.length;i++) {
			if(array1[i]<array2[i]) {
				return false;
			}
		}
		return true;
	}

}
