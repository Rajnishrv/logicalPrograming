package com.array;

public class firstRepeat {
	public static void main(String[] args) {
		int arr[]= {3,2,4,5,6,4,2};
		int max = arr[0];
		for(int i = 0; i<arr.length; i++) {
			if(max<arr[i]) {
				max =arr[i];
			}
		}
		int k=2, ans=-1;
		int[] temp = new int[max+1];
		for(int i =0; i<arr.length;i++) {
			temp[arr[i]]++;
			if(temp[arr[i]]==k) {
				ans =arr[i];
				break;
			}
		}
		System.out.println(ans);
	}
}
