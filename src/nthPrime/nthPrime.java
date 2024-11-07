package nthPrime;
import java.util.Scanner;

public class nthPrime {

	    public static boolean isPrime(int num){
	        boolean flag = true;
	        for(int i = 2; i<num; i++){
	            if (num%i==0) {
	                flag = false;
	            }
	        }
	        return flag;
	    }
	    
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println( "enater nth of prime number");
	        int n = sc.nextInt();
	        int c = 1;
	        int i =2;
	        while (true) {
	            if (isPrime(i)) {
	                c++;
	            }
	            if (c==n) {
	                System.out.println(i);
	                break;
	            }
	            i++;

	        }
	    }
	}
