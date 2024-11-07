package com.twod.array;

public class DiagonalSum {
	public static void main(String[] args) {
		int[][] arr = { 
				{1, 2, 3, 1}, 
				{4, 5, 6, 1}, 
				{7, 8, 9, 1},
				{1, 2, 3, 4} };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j || i + j == arr[i].length - 1) {

					sum+=arr[j][i];
					
					System.out.print(arr[i][j]);
				}
				System.out.print("   ");
			}
			System.out.println();
		}
		System.out.println("sum: "+sum);

	}
}
