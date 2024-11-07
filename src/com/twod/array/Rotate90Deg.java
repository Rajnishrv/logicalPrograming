package com.twod.array;
//importent
public class Rotate90Deg {
	static void reverseArr(int[] arr) {
		int i=0,j=arr.length-1;
				while(i<j) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					i++;j--;
				}
	}
	public static void main(String[] args) {
		int[][] arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9}};
		for(int i =0; i<arr.length; i++) {			
			for(int j = i; j<arr[i].length; j++) {  
				int temp = arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}			
		}
		
		for(int k=0;k<arr.length;k++) {
			reverseArr(arr[k]);
		}
		
		for(int i =0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++) {
				
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	
		
	}
}
