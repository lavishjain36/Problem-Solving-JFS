package com.day6;

import java.util.Scanner;

public class TernarySearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		int[] array=new int[n];

		//read 
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}

		//take element to be search
		int key=sc.nextInt();//7


		//create a function->
		int targetindex=ternarySearch(array,0,n-1,key);

		if(targetindex==-1) {
			System.out.println("Element not exist in the array");
		}else {
			System.out.println("Element found at index "+targetindex);
		}



	}

	private static int ternarySearch(int[] array, int left, int right, int key) {
		if(right>=left) {
			//find 2 mid points
			int mid1=left+(right-left)/3;//mid1-
			int mid2=right-(right-left)/3;//mid2

			//compare with target key
			if(array[mid1]==key) {
				return mid1;
			}
			if(array[mid2]==key) {
				return mid2;
			}

			//key is smaller than mid1->search in left
			if(key<array[mid1]) {
				//search in left
				return ternarySearch(array,left,mid1-1,key);
			}else if(key>array[mid2]) {
				//search in rigt part 
				return ternarySearch(array, mid2+1, right, key);
			}else {
				//middle
				return ternarySearch(array, mid1+1, mid2-1, key);
			}
		}

		//target element is not there
		return -1;

	}

}
