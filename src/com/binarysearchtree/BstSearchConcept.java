package com.binarysearchtree;

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

class BinarySearchlogic{
	Node root;

	
	public BinarySearchlogic() {
		root=null;
	}
	
	//method implement to insert the node data in binary tree
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

	public boolean search(Node root, int key) {
		// base case->if the root is null 
		if(root==null) {
			return false;
		}
		
		//value-search ->current node
		if(root.data==key) {
			return true;//this is our correct condition
		}
		
		//recursive ->left- or right direction
		if(key<root.data) {
			//search in left
			return search(root.left,key);
		}else {
			return search(root.right,key);
		}
	
	}
}



public class BstSearchConcept {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		
        BinarySearchlogic bst=new BinarySearchlogic();
		
		int noofnodes=sc.nextInt();//
		
		for(int i=0;i<noofnodes;i++) {
			int value=sc.nextInt();
			bst.root=bst.insert(bst.root,value);//
		}
		
		int key=sc.nextInt();
		//search the value in binary search tree
		boolean isexist=bst.search(bst.root,key);
		
		if(isexist) {
			System.out.println("Value "+ key + "is available in tree");
		}else {
			System.out.println("Value "+ key + "is  not available in tree");

		}
	}

}
