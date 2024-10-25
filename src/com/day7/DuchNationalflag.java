package com.day7;

import java.util.Scanner;

public class DuchNationalflag {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		int[] array=new int[n];

		//read 
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}

		sortdutchnationalflag(array);
		
		displaysorteddata(array);
	
	}

	//printing
	private static void displaysorteddata(int[] array) {
		for(int num:array) {
			System.out.print(num+" ");
		}
		System.out.println();
		
	}

	//logic
	private static void sortdutchnationalflag(int[] array) {
		int low=0,mid=0,high=array.length-1;
		//
		while(mid<=high) {
			//if current element -0 ,swap with low
			if(array[mid]==0) {
				swap(array,low,mid);//swap mid with low
				low++;
				mid++;
				
			//if the element-1,move to next element->no swap
			}else if(array[mid]==1) {
				mid++;//no swap
			}else if(array[mid]==2) {
				swap(array,mid,high);//swap mid with high
				high--;
			}
		}
	}

	//swap the data 
	private static void swap(int[] array, int i, int j) {
		//swap logic
	    int temp=array[i];
	    array[i]=array[j];
	    array[j]=temp;
		
	}

}

//Time complexity-O(n)
//space complexity-O(1)