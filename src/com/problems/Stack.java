package com.problems;

public class Stack {
	
	private int arr[];
	private int top;
	private int capacity;//to know the size of stack

	//constructor->Stack to initialize the data 
	public Stack(int size) {
		//initialize all values
		arr=new int[size];//5
		capacity=size;
		top=-1;
	}

	public void push(int x) {
		if(isFull()) {
			System.out.println("Stack Overflow");
			
		}
		
		arr[++top]=x;
		System.out.println("Element pushed "+x+" into the stack ");
	}

	private boolean isFull() {
		return top==capacity-1;//return top of the stack
	}

	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is already empty .No element to remove");
			return -1;
		}
		return arr[top--];
	}

	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return top==-1;//stack is empty
	}

	//return the top element without removal
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		return arr[top];
	}

	public void display() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return;
		}
		for(int i=0;i<=top;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}

}
