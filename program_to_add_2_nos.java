package second;

import java.util.Scanner;

public class addno {

	public static void main(String[] args) {
		
		int a,b,c;
		System.out.print("Enter any Two Numbers");
		Scanner s=new Scanner(System.in);
		
		
		a=s.nextInt();
		b=s.nextInt();
		
		c=a+b;
		System.out.print("sum of two no.s: " +c);
	}

}
