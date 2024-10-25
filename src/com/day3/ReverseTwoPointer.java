package com.day3;

import java.util.Scanner;

public class ReverseTwoPointer {

	public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the size of the array");
			int n=sc.nextInt();
			//create an array 
			int[] array=new int[n];
			
			System.out.println("Enter the elements of the array: ");
			//to read the input element
			for(int i=0;i<n;i++) {
				array[i]=sc.nextInt();//1 2 3 4 5 
			}
			
			//logic-two pointer technique
			int left=0;
			int right=n-1;//5
			
			
			//
			while(left<right) {
				//swap the left and right pointers
				int temp=array[left];//1
				array[left]=array[right];//5
				array[right]=temp;//1
				
				left++;
				right--;
			}
			
			for(int i=0;i<n;i++) {
				System.out.print(array[i]+" ");
			}

	}

}


//Time complexity-O(n)
//Space complexity->O(1)