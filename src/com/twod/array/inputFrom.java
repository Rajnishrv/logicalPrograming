package com.twod.array;

import java.util.Scanner;

public class inputFrom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int outSize = sc.nextInt();
		int inSize = sc.nextInt();
		int[][]arr = new int[outSize][inSize];
		for(int i =0; i<arr.length; i++) {
			for(int j=0;j<arr[i].length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i =0; i<arr.length; i++) {			
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			
		}
		sc.close();
	}
}
