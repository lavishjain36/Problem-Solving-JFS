package com.day2;

public class ArrayFirst {

	public static void main(String[] args) {
		
		//declarae and initalization
		int[] numbers=new int[5];
		
		numbers[0]=10;
		numbers[1]=20;
		numbers[2]=40;
		numbers[3]=26;
		numbers[4]=56;
		
		//Loop mechanism
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}

	}

}
