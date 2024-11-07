package com.twod.array;

public class occren {
public static void main(String[] args) {
	String s = "hello";
	char[] arr1 = s.toCharArray();
	char[] arr2 = s.toCharArray();
	
	for(int i=0; i<s.length(); i++) {
		int c=0;
		for(int j=0;j<s.length();j++) {
			if(arr1[i]==arr2[j]) {
				c++;
				arr2[j]='\0';
			}
		}
		if(c>0) {
			System.out.println(arr1[i]+" "+c);
		}
	}
}
}
