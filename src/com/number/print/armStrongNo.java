package com.number.print;

import java.util.Scanner;

public class armStrongNo {
	static int countDigit(int no) {
		int c=0;
		while(no!=0) {
			no/=10;
			c++;
		}
		return c;
	}
	static int power(int rem, int exp) {
		int pow =1;
		for(int i= 1; i<=exp;i++) {
			pow*=rem;
		}
		return pow;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int no = sc.nextInt();
	int no2 =no;
	int exp = countDigit(no);
	int sum = 0;
	
while(no!=0) {
	int rem = no%10;
	sum+= power(rem,exp);
	no/=10;
}
if(no2==sum) {
	System.out.println("armstrong no");
}else {
	System.out.println("not an armstrong no");
}
sc.close();
}
}
