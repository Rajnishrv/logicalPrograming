package com.number.print;

import java.util.Scanner;

public class duckNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		boolean flag = false;
		while(no!=0) {
			int rem = no%10;
			if(rem==0) {
				flag = true;
				break;
			}
			no/=10;
		}
		if(flag) {
			System.out.println("duck no");

		}else {
			System.out.println("not a duck no");
		}
		sc.close();
	}
}


//
//int num = sc.nextInt();
//String duc= "not a duck";
//while(num!=0) {
//	int rem=num%10;
//	if(rem==0) {
//		duc="duck no";
//		break;
//	}
//	num/=10;
//}	
//System.out.println(duc);
