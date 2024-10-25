package com.day8;

import java.util.Scanner;

//Class for Linkedlist node
class Node{
	int data;//store the data
	Node next;//reference or pointer to next node
	
	Node(int data){
		this.data=data;
		this.next=null;//next node as null
	}
}

public class Linkedlistconcept {
	Node head;//point to first node in linked list

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Linkedlistconcept ll=new Linkedlistconcept();
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int element=sc.nextInt();//10 20 30 40
			ll.insert(element);
		}
		
		ll.display();

	}

	private void display() {
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

	private void insert(int data) {
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
	
}
