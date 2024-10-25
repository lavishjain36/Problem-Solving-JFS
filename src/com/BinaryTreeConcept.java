package com;

import java.util.Scanner;

//define a node for tree

class Node{
	int data;
	Node left,right;
	
	
	Node(int value){
		data=value;
		left=right=null;
	}
}

class BinaryTree{
	Node root;
	
	BinaryTree(){
		root=null;
	}
	
	
	//3 method->inorder,preorder,postorder
	
	void inorder(Node node) {
		if(node==null)
			return;
		inorder(node.left);//left
		System.out.print(node.data+" ");//root
		inorder(node.right);//right
	}
	
	void preorder(Node node) {
		if(node==null)
			return;
		System.out.print(node.data+" ");//root
		preorder(node.left);//left
		preorder(node.right);//right
	}
	
	void postorder(Node node) {
		if(node==null)
			return;
		postorder(node.left);//left
		postorder(node.right);//right
		System.out.print(node.data+" ");//root

	}
	
	
	


	public Node insert(Node root, int data) {
		//tree is null
		if(root==null) {
			root=new Node(data);
			return root;
		}
		//decide to insert->left or right
		if(data<root.data) {
			//insert the data in left subtree
			root.left=insert(root.left, data);
		}else if(data>root.data) {
			root.right=insert(root.right, data);
		}
		
		return root;
	}
	
	
}
public class BinaryTreeConcept {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		BinaryTree bt=new BinaryTree();
		
		int noofnodes=sc.nextInt();//
		
		for(int i=0;i<noofnodes;i++) {
			int value=sc.nextInt();
			bt.root=bt.insert(bt.root,value);
		}
		
		//inorder traversal->
		bt.inorder(bt.root);
		System.out.println();

		bt.preorder(bt.root);
		System.out.println();

		bt.postorder(bt.root);
		System.out.println();


		
	}

}
