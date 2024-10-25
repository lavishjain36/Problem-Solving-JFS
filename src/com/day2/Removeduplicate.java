package com.day2;

import java.util.Scanner;

public class Removeduplicate {

	public static void main(String[] args) {
		//take input from the user
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		//create an array of n size->
		int[] array=new int[n];
		
		//read the values of the array 
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();

		}
		
	     int newjlength=removeduplicates(array,n);
	     
	     //display
	     for(int i=0;i<newjlength;i++) {
	    	 System.out.print(array[i]+" ");
	     }

	}

	private static int removeduplicates(int[] array, int n) {
		if(n==0||n==1) {
			return n;//no duplicates are there ->when array size is 0 or 1
		}
		int j=0;//unique elements
		for(int i=0;i<n-1;i++) {
			if(array[i]!=array[i+1]) {
				 array[j++] = array[i];
			}
		}	
		//place last valu inside array[j] becoz it was not part loop comparision
		 array[j++]=array[n-1]; 
		 
		 return j;//length of j would be 4->
	}
	

}

//Time complexity->O(n)
//Space complexity->O(1)
