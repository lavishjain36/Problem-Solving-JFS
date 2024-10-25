package com.day5;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//5
		
		int[] array=new int[n];
		
		//read 
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		
		displayarray(array);//original
		bubblesort(array);
		displayarray(array);//after 


	}

	private static void bubblesort(int[] array) {
		int n=array.length;
		boolean swapped;//already
		
		for(int i=0;i<n-1;i++) {
			swapped=false;
			for(int j=0;j<n-i-1;j++) {
				if(array[j]>array[j+1]) {
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					swapped=true;

				}
				
			}
			
			if(!swapped) {
				break;
			}
		}
		
	}

	private static void displayarray(int[] array) {
		for(int i:array) {
			System.out.print(i+" ");
		}
		System.out.println();//move to next line
	}

}


//Time and Space complexity->
//Worst->all elements reversed sorted
//7 5 4 3 1
//for n->n-1 ,each pass should perform n comparsion
//n*n=>O(n2)
//Best->all elements in sorted position->O(n)
//Space->O(1)->working in same place without creating extra space.