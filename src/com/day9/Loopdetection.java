//package com.day9;
//
//import java.util.Scanner;
//
//
//class Node{
//	int data;//store the data
//	Node next;//reference or pointer to next node
//
//	Node(int data){
//		this.data=data;
//		this.next=null;//next node as null
//	}
//}
//
//class LinkedList{
//	Node head;//point to first node in linked list
//
//	private void display() {
//		if(head==null) {
//			System.out.println("List is empty");
//			return;
//		}
//		Node temp=head;//start from the head first element
//		while(temp!=null) {
//			System.out.print(temp.data+"->");//10 20 30 40
//			temp=temp.next;//move the pointer next node to print 20 and 30
//		}
//		System.out.println("null");
//	}
//
//	void insert(int data) {
//		Node newnode=new Node(data);
//
//		if(head==null) {
//			head=newnode;
//		}else {
//			Node temp=head;
//			while(temp.next!=null) {
//				temp=temp.next;
//			}
//			temp.next=newnode;
//		}
//	}
//
//	public void createloop(int position) {
//		if(position==-1) return;
//		
//		Node temp=head;
//		Node loopNode=null;
//		int count=0;
//		
//		//traverse through
//		while(temp.next!=null) {
//			if(count==position) {
//				loopNode=temp;
//			}
//			temp=temp.next;
//			count++;
//		
//		}
//		
//		temp.next=loopNode;//create a loop  by pointing loopnode to the last
//		
//	}
//
//	public boolean detectloop() {
//		Node slow=head;//move-1 stepi->tortoise
//		Node fast=head;//move-2 step->hare
//		while(fast!=null&& fast.next!=null) {
//			slow=slow.next;//move slow pointer to one step
//			fast=fast.next.next;//move fast pointer-2 step
//			if(slow==fast)
//			{
//				return true;
//			}
//		}
//			
//			return false;
//		}
//		
//}
//
//
//public class Loopdetection {
//	
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//
//		LinkedList ll=new LinkedList();
//		
//		int n=sc.nextInt();//5
//		
//		for(int i=0;i<n;i++) {
//			int value=sc.nextInt();
//			ll.insert(value);//10 20 30 40 50 60
//		}
//		
//		int position=sc.nextInt();
//		ll.createloop(position);
//		
//		//detect the loop
//		if(ll.detectloop()) {
//			System.out.println("Loop detected.");
//		}else {
//			System.out.println("Loop Not detected.");
//		}
//
//	}
//
//}
