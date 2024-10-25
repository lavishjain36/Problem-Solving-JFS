package com.day6;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//5
		
		int[] array=new int[n];
		
		//read 
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		
		displayarray(array);//original
		selectionsort(array);
		displayarray(array);//after 
	}

	private static void selectionsort(int[] array) {
		int n=array.length;
		for(int i=0;i<n-1;i++) {
			//assume first element is minimum
			int minindex=i;//0
			
			for(int j=i+1;j<n;j++) {
				//compare
				if(array[j]<array[minindex]) {
					//next minimum
					minindex=j;//11
				}
			}
			
			//swap=>
			int temp=array[minindex];//11
			array[minindex]=array[i];//64
			array[i]=temp;//swap
			
			
		}
	
		
	}

	private static void displayarray(int[] array) {
		for(int value:array) {
			System.out.print(value +" ");
		}
		System.out.println();
		
	}

}


//Time complexity->O(N2)=?
//n-1 comparision
//n-2 comparsion
//n-3
//n*(n-1)/2=>O(n2)
//Space compexity->O(1)


//Selection ->it will find the minimum element
//from unsorted part and swap it the first element
//
//above process gets repeated untill we sort element,