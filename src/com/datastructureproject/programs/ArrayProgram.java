package com.datastructureproject.programs;

public class ArrayProgram {

	public static void main(String[] args) {
		
		//int[][] twodArray = new int[2][3];
		
		int[][] twodArray = {{2,3,4},{5,6,7}};
		
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(twodArray[i][j]+" ");
			}
			System.out.println();
		}

	}

}
