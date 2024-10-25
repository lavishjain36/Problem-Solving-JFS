package com.day3;

import java.util.HashSet;
import java.util.Scanner;

public class RepatedElement {

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
		
		getrepeatedElement(array);

	}

	private static void getrepeatedElement(int[] array) {
		HashSet<Integer> obj1=new HashSet<>();//keep as it
		HashSet<Integer> obj2=new HashSet<>();//repeated elements in an array

		//traverse through array
		for(int i=0;i<array.length;i++) {
			if(obj1.contains(array[i])) {
				obj2.add(array[i]);//repeated element
			}else {
				obj1.add(array[i]);
			}
		}
		
		//print the element
		if(obj2.isEmpty()) {
			System.out.println("-1");
		}else {
			for(int repeated:obj2) {
				System.out.println(repeated);
			}
		}
		
		
	}

}


//Space-O(n)
//Time-O(n)