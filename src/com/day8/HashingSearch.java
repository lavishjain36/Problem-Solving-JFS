package com.day8;

import java.util.Scanner;

class HashTableArray{
	private int[] table;
	private int size;

	//constructor
	public HashTableArray(int size) {
		this.size=size;
		table=new int[size];//10->array with 10spaces
		
		for(int i=0;i<size;i++) {
			table[i]=-1;//set all the hash table slot to -1;
		}
	}

	private int hashfunction(int key) {
		// TODO Auto-generated method stub
		return key%size;
	}
	public void insert(int key) {
		int index=hashfunction(key);//5->25
		//linear probing->
		while(table[index]!=-1) {
			//calculate next index
			index=(index+1)%size;//6
		}
		
		table[index]=key;//inser=15 ,25,35,10
	}

	public void display() {
		for(int i=0;i<size;i++) {
			if(table[i]==-1) {
				System.out.println("-1");
			}else {
				System.out.print(table[i]+" ");
			}
		}
		
	}

	public boolean search(int key) {
		int index=hashfunction(key);
		
		while(table[index]!=-1) {
			if(table[index]==key) {
				return true;
			}
			//move to next slot
			index=(index+1)%size;
		}
		return false;//in case element not found
	}
}
public class HashingSearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();//10->hash table size
		
		
		HashTableArray ht=new HashTableArray(size);
		
		int nokeys=sc.nextInt();//insert the keys values
		
		
		for(int i=0;i<nokeys;i++) {
			int key=sc.nextInt();
			ht.insert(key);
		}
		
		ht.display();
		
		int searchelement=sc.nextInt();
		
		//search
		if(ht.search(searchelement)) {
			System.out.println(searchelement);
		}else {
			System.out.println("-1");
		}
		
	}

}
