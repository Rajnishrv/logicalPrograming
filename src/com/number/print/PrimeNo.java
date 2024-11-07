package com.number.print;

public class PrimeNo {
public static void main(String[] args) {
	int no =6;
	int c=0;
	for(int i =2;i<no; i++) {
		if(no%i==0) {
			c++;
			break;
		}
	}
	if(c!=0) {
		System.out.println("not a prime no");
	}else {
		System.out.println("prime no");
	}
}
}
