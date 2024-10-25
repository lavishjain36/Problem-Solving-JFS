package com.day3;

import java.util.Scanner;

public class Rotatearray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();//size of -6
		
		//create an array 
		int[] array=new int[n];//heap
		
		System.out.println("Enter the elements of the array: ");
		//to read the input element
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();//1 2 3 4 5 6
		}
	
		System.out.println("Enter the position value to rotate");
		int k=sc.nextInt();
		
		rotateArray(array,k);

	}

	//logic  to rotate an array by k position
	private static void rotateArray(int[] array, int k) {
		int n=array.length;//6
		//if position>array size
		k=k%n; //2%6->2
		//rotate an array by k position
		for(int i=0;i<k;i++) {
			//rotate an array by 1 position
			rotateOne(array,n);
		}
		for(int i=0;i<n;i++) {
			System.out.print(array[i]+" ");
		}
	}

	private static void rotateOne(int[] array, int n) {
		//hold the last element
		int last =array[n-1];//5
		//shift the all the element to right by one
		for(int i=n-1;i>0;i--) {
			    array[i]= array[i-1];//array[5]=array[4]=5
		}
		//move the last element to first position
		array[0]=last;
	}

}


//Time complexity-1 unit->n unit->n*k times
//O(n*k)
//Space Complexity-O(1)->