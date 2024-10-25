package com.day2;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		//take input from the user
		Scanner sc=new Scanner(System.in);
		
//		System.out.println("Enter the size of the array");
		int n=sc.nextInt();//size->5
		
		//create an array of n size->
		int[] array=new int[n];
		
		//read the values of the array 
//		System.out.println("Enter the elements of the array");
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();//1 3 5 7 9
		}
	
		//target element->read
//		System.out.println("Enter the element you want to search");
		int target=sc.nextInt();
		
		//Logic part
		int res=binarysearch(array,target);
		
		if(res==-1) {
			System.out.println("-1");
		}else {
			System.out.println(res);
		}
	}

	//Logic 
	private static int binarysearch(int[] array, int target) {
		int left=0;//first index
		int right=array.length-1;//last index //5
		
		while(left<=right) {
			//middle 
			int mid=left+(right-left)/2;//(0+5)/2=2
			
			//check target elemtnt -mid element
			if(array[mid]==target) {
				return mid;//target element is calculate in second iteration
			}
			
			if(array[mid]<target) {
				left=mid+1;//4
			}else {
				right=mid-1;//3
			}			
			
		}
		
		
		return -1;//element not found
	}

}



//Time Complexity->
//Best -case->O(1)->middle element match with target ->first try
//Worst Case->O(log n)->reducing the size to half every time

//log2(16)->4 steps
//log2(5)->2 steps
//Space->O(1)->