package com.bfsconcept;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class BfsImplementation {

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
		
		bfsmethodimpl(startnode,nodes,adjlist);

	}

	private static void bfsmethodimpl(int startnode, int nodes, List<List<Integer>> adjlist) {
			//array to check all visted nodes
		boolean[] visited=new boolean[nodes];
		//BFS->queue implementation
		Queue<Integer> queue=new LinkedList<>();
		
		visited[startnode]=true;//assiume firstnode as visited
		queue.add(startnode);
		
		//continue untill you visit all node at level 
		while(!queue.isEmpty()) {
			int currentnode=queue.poll();
			System.out.print(currentnode + " ");
			
			//unvisited
			for(int neighbor:adjlist.get(currentnode)) {
				if(!visited[neighbor]) {
					visited[neighbor]=true;
					queue.add(neighbor);
				}
			}
		}
		
		
	}

}
