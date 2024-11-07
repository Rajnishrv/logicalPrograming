package com.twod.array;

public class sumOfTwoarr {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,3},{7,8,3}};
		int[][] arr2 = {{5,3,6},{5,2,6}, {2,1,5}};
		for(int i =0; i<arr.length; i++) {			
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+arr2[i][j]+" ");
			}
			System.out.println();
			
		}
		
	}
}
