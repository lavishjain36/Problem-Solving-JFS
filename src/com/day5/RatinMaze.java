package com.day5;

import java.util.Scanner;

public class RatinMaze {
	
	//
    static int N;

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the maze");
		N=sc.nextInt();
		
		//input of maze matrix->N*N
		int[][] maze=new int[N][N];
		
		System.out.println("Enter the input 1 and 0 for path selection and blocked resp.");
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				maze[i][j]=sc.nextInt();
			}
		}
		
		int[][] sol=new int[N][N];
		
		if(solveMaze(maze,sol,0,0)) {
			System.out.println("Solution Found");
			displaysolution(sol);
		}else {
			System.out.println("No Solution exist due to blockage");
		}
	
	}

	private static void displaysolution(int[][] sol) {
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				System.out.print(sol[i][j]+" ");
			}
			System.out.println();//move to next line
		}
		
	}

	private static boolean solveMaze(int[][] maze, int[][] sol, int x, int y) {
		//if the rat reached its destination ,mark the cell =?
		if(x==N-1&&y==N-1) {
			sol[x][y]=1;
			return true;
		}
		
		if(isSafe(maze,x,y)){
			//make the current cell solution path
			sol[x][y]=1;
			
			//Move to right(x,y+1)
			if(solveMaze(maze,sol,x,y+1))
				return true;//recusive solution
			
			//move to down(x+1,y)
			if(solveMaze(maze,sol,x+1,y))
				return true;////recusive solution
			
			sol[x][y]=0;//blocked cells->backtracking
			return false;
		}
		
		return false;
	}

	private static boolean isSafe(int[][] maze, int x, int y) {
		//if x and y are within boundaries->x->0 to <N y->0 to <N->
		return (x>=0 && x<N && y>=0 && y<N  && maze[x][y]==1);//selection path
	}

}


//Time->
//Total possible move->either right or down-
//
//O(2)