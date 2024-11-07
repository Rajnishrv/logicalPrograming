package com.array;

public class gratSameLessMinus {
	public static void main(String[] args) {
		int[] arr = {13, 46, 8, 43,32,12,5 };
		int maxNo =arr[arr.length-1];

		for(int i = arr.length-1; i>=0;i--) {
			if(arr[i]>=maxNo) {
				maxNo=arr[i];
				arr[i] =-1;
			}else {
				arr[i]=maxNo;
			}
		}
		for(int i= 0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}