package com.number.print;

public class nthPrime {
	static boolean isPrime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int nth = 5;
		int c=1;
		while(true) {
			if(isPrime(nth)) {
				c++;
			}
		}
	}
}
