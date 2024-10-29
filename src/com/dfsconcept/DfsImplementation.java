package com.dfsconcept;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DfsImplementation {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
		
		int nodes=sc.nextInt();//5
		int edges=sc.nextInt();//
		
		List<List<Integer>> adjlist=new ArrayList<>();
		
		for(int i=0;i<nodes;i++) {
			adjlist.add(new ArrayList<>());
		}
		
		//take edges
		for(int i=0;i<edges;i++) {
			int u=sc.nextInt();
			int v=sc.nextInt();
			adjlist.get(u).add(v);
			adjlist.get(v).add(u);//undirected graph
		}
		
		//ask user start node for traversing
		int startnode=sc.nextInt();
		boolean[] visited=new boolean[nodes];
		dfstraversal(startnode,adjlist,visited);
		
	}
	
	//Depth first search->Recursivelu-Stack implem.
	private static void dfstraversal(int node, List<List<Integer>> adjlist, boolean[] visited) {
		visited[node]=true;
		System.out.print(node + " ");
		
		//visit all the unvisited nodes in adjacent node
		for(int data:adjlist.get(node)) {
			if(!visited[data]) {
				dfstraversal(data,adjlist,visited);//Recursive call->Stack Memory
			}
		}
	}

}
