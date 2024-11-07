package com.array;

public class printPositiveNo {
	public static void main(String[] args) {
		int[] arr = {-3,3,5,-4,0,10};
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]>=0) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}
