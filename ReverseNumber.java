package programs;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
	System.out.println("enter the numbers");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int rev=0;
	while(n>0) {
		int m=n%10;
		rev=rev*10+m;
		n=n/10;
	}
	System.out.println(rev);
	}
}
