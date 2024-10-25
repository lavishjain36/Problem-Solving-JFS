package com.problems;

import java.util.Scanner;


public class DriverMainStack {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of stack");
		int size=sc.nextInt();//5
		
		Stack st=new Stack(size);
		
		while(true) {
			System.out.println("Select the operation you want to perform");
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Peek");
			System.out.println("4.Display Element of Stack:");
			System.out.println("5.Exit");


			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter the element to push");
				int element=sc.nextInt();
				st.push(element);
				break;
				
			case 2:
				int popped=st.pop();
				if(popped!=-1) {
					System.out.println("Popped element "+popped);
					break;
				}
			
			case 3:
				int peekelement=st.peek();
				if(peekelement!=-1) {
					System.out.println("Top element "+peekelement);
					break;
				}
				
			
			case 4:
				st.display();
				break;
				
			case 5:
				System.out.println("Exiting from program");
			    System.exit(0);//exit from the program
			    break;
			    
			default:
				System.out.println("Invalid choice.Enter correct choice");
				break;
			}


		}
	}

}
