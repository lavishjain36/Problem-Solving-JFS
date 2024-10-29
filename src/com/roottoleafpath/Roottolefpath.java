package com.roottoleafpath;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Node {
	int data;
	Node left, right;

	Node(int value) {
		data = value;
		left = right = null;
	}
}

class Leafnodelogic {
	Node root;

	Leafnodelogic() {
		root = null;
	}

	// method implement to insert the node data in binary tree
	public Node insert(Node root, int data) {
		// tree is null
		if (root == null) {
			root = new Node(data);
			return root;
		}
		// decide to insert->left or right
		if (data < root.data) {
			// insert the data in left subtree
			root.left = insert(root.left, data);
		} else if (data > root.data) {
			root.right = insert(root.right, data);
		}

		return root;
	}
	
	
	void printrootoleafpath(Node node) {
		
		//list element
		List<Integer> pl=new ArrayList<>();//collect
		findpaths(node,pl);
	}
	
	
	void findpaths(Node node, List<Integer> pl) {
		//base case->
		if(node==null) return;
		
		//add an element to list and print 
		pl.add(node.data);//[10,5,2]
		
		if(node.left==null&&node.right==null) {
			System.out.println(pl);
		}else {
			//recursive
			findpaths(node.left, new ArrayList<>(pl));
			findpaths(node.right, new ArrayList<>(pl));

		}
		
	}

}

public class Roottolefpath {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Leafnodelogic tree = new Leafnodelogic();
		int noofnodes = sc.nextInt();//

		for (int i = 0; i < noofnodes; i++) {
			int value = sc.nextInt();
			tree.root = tree.insert(tree.root, value);//
		}

		
		tree.printrootoleafpath(tree.root);
	}

}
