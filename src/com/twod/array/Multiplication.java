package com.twod.array;

public class Multiplication {

	    static int N = 3;

	    static void multiply(int mat1[][], int mat2[][], int res[][]) {
	        for (int i = 0; i < N; i++) {
	            for (int j = 0; j < N; j++) {
	                res[i][j] = 0;
	                for (int k = 0; k < N; k++) {
	                    res[i][j] += mat1[i][k] * mat2[k][j];
	                }
	            }
	        }
	    }

	    public static void main(String[] args) {
	        int mat1[][] = {
	            {12,8,4},
	            {3,17,14},
	            {9,8,10}
	        };

	        int mat2[][] = {
	          	{5,19,3},
	            {6,15,9},
	            {7,8,16}
	        };

	        int res[][] = new int[N][N];
	        multiply(mat1, mat2, res);

	        System.out.println("mult of matrix is:");
	        for (int i = 0; i < N; i++) {
	            for (int j = 0; j < N; j++) {
	                System.out.print(res[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}
