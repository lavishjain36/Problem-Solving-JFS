package com.day6;

import java.util.Scanner;

public class CountSorting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//5
		
		int[] array=new int[n];
		
		//read 
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		
		//create a method 
		countSort(array);
		
		for(int i=0;i<n;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();

	}

	private static void countSort(int[] array) {
		//find the maximum element in array
		int max=array[0];
		for(int i=1;i<array.length;i++) {
			if(array[i]>max) {
				//update the max
				max=array[i];//9
			}
		}
		//create a count array of max element->max+1
		int[] count=new int[max+1];
		
		//count the frequency
       for(int i=0;i<array.length;i++) {
    	   count[array[i]]++;
       }
       
//       for(int i=0;i<count.length;i++) {
//           System.out.print(count[i]+" ");
//       }
       
       //updathe our original array based
       int index=0;
       for(int i=0;i<count.length;i++) {
    	   while(count[i]>0) {
    		  array[index++] =i;//place element and move next position
    		  count[i]--;//decrement this count ->we place all element based on frequency
    	   }
       }
	  }
		
	}

//Time-O(n)
//Space-O(n)
