package com.day9;

import java.util.Scanner;

class Node{
	int data;//store the data
	Node next;//reference or pointer to next node

	Node(int data){
		this.data=data;
		this.next=null;//next node as null
	}
}
class LinkedList{
	Node head;//point to first node in linked list
	//element ->insertion

	public void insert(int data) {
		Node newnode=new Node(data);
		if(head==null) {
			head=newnode;
		}else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newnode;
		}
	}
	//to print the data
	public void display() {
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		Node temp=head;//start from the head first element
		while(temp!=null) {
			System.out.print(temp.data+"->");//10 20 30 40
			temp=temp.next;//move the pointer next node to print 20 and 30
		}
		System.out.println("null");
	}
	
	//method to reverse the element in linked list
	public void reverse() {
		Node previous=null;
		Node current=head;
		Node nextnode;
		while(current!=null) {
			nextnode=current.next;//storing the next
			current.next=previous;//reverse the current node pointer
			previous=current;
			current=nextnode;
		}
		head=previous;//last node->new head 
	}

	

}
public class Reverselinkedlist {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		LinkedList ll=new LinkedList();
		
		
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			int value=sc.nextInt();
			ll.insert(value);//10 20 30 40 50 60
		}
		
		ll.display();//before
		
		//To reverse the list
		ll.reverse();
		
		
		ll.display();//after
	
	}
}


//Time-O(n)
//Space->O(1)