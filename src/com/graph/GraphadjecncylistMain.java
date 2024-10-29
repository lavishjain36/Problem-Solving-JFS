package com.graph;

import java.util.ArrayList;
import java.util.Scanner;

class Graph{
	int nodes;
	//list of list
	ArrayList<ArrayList<Integer>> adjlist;
	
	//constructor-
	public Graph(int nodes) {
		this.nodes = nodes;
		adjlist= new ArrayList<>();
		
		for(int i=0;i<nodes;i++) {
			adjlist.add(new ArrayList<>() );
		}
	}

	public void addEdge(int src, int dest) {
		adjlist.get(src).add(dest);
		//undirected
		adjlist.get(dest).add(src);//
		
	}

	public void displaygraph() {
		for(int i=0;i<nodes;i++) {
			for(int data:adjlist.get(i)) {
				System.out.print(data + " ");
			}
			System.out.println();
		}
		
	}
	
	
	
}
public class GraphadjecncylistMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		int nodes=sc.nextInt();//node number//5
		int edges=sc.nextInt();//no of edges
		
		
		Graph graph=new Graph(nodes);
		
		for(int i=0;i<edges;i++) {
			int src=sc.nextInt();
			int dest=sc.nextInt();
			
			graph.addEdge(src,dest);
		}
		

		graph.displaygraph();
	}

}
