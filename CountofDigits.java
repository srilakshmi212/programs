package programs;

import java.util.Scanner;

public class CountofDigits {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enetr the number");
	int n=sc.nextInt();
	int c=0;
	while(n>0) {
		int m=n%10;
		n=n/10;
		c++;
	}
	System.out.println(c);
	}
}
//public static void main(String[] args) {
//	System.out.println("enter the numbers");
//	Scanner sc=new Scanner(System.in);
//	int n=sc.nextInt();
//	int c=0;
//	System.out.println(n);
//	while(n>0) {
//		int m=n%10;
//		n=n/10;
//		c++;
//	}
//	System.out.println(c);
//	}