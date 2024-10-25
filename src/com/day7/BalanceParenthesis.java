package com.day7;

import java.util.Scanner;
import java.util.Stack;


public class BalanceParenthesis {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String expr=sc.nextLine();
		
		//function->to check
	boolean res=	checkbalanced(expr);
	
	if(res) {
		System.out.println("Balanced");
	}else {
		System.out.println("Not Balanced");
	}
	}

	private static boolean checkbalanced(String expr) {
		Stack<Character> st=new Stack<>();
		
		
		for(int i=0;i<expr.length();i++) {
			char ch=expr.charAt(i);
			
			if(ch=='('||ch=='{'||ch=='[') {
				//push
				st.push(ch);
			}
			else if(ch==')'||ch=='}'||ch==']') {
				if(st.isEmpty()) {
					return false;
				}
				char top=st.pop();
				
				
				//mismatch pair while removing
			     if((ch==')'&& top!='('||
					ch=='}'&& top!='{'||
					ch==']'&& top!='[')){
						return false;
					}
				
			}
		}
		
		return st.isEmpty();
			
	}

}
