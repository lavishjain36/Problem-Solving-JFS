package com.day3;

import java.util.Scanner;

public class DeleteElement {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		//create an array 
		int[] array=new int[n];
		
		System.out.println("Enter the elements of the array: ");
		//to read the input element
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();//1 2 3 4 5 6
		}
		
		int elementtobedelete=sc.nextInt();
	
		int newsize=removeanElement(array,n,elementtobedelete);

		
		for(int i=0;i<newsize;i++) {
			System.out.print(array[i]+" ");
		}
	}

	private static int removeanElement(int[] array, int n, int elementtobedelete) {
		int index=-1;
		
		//index ->find the element 
		for(int i=0;i<n;i++) {
			if(array[i]==elementtobedelete) {
			index=	i;
			break;
			}
		}
		
		//second case-2
		if(index==-1) {
			System.out.println("-1");
			return n;
		}
		
		//shift the remaining element towards left and print
		for(int i=index;i<n-1;i++) {
		array[i]=array[i+1];//shift one element to previous from deleted elements
		}
		
		//return new size of the array
		return  n-1;//6-1=5	
		
	}

}


//Space-O(1)
//Time->
//Best->O(1)
////Worst->first position->shift remaing all element-
//O(n)