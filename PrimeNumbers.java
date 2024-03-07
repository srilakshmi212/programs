package programs;

import java.util.Scanner;

public class PrimeNumbers {
public static void main(String[] args) {
	System.out.println("enter the number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=2;i<n;i++) {
		if(n%i==0) {
			System.out.println("is not prime");
			return;
		}
	}
		System.out.println("is prime");
}
	
	
}
