
import java.util.Scanner;

public class conditional_if_else {

	public static void main(String[] args) {
		
		int pwd;
		System.out.print("Enter password:=");
		Scanner obj=new Scanner(System.in);
		pwd=obj.nextInt();
		if(pwd==2673)
		{
			System.out.println("My Name:= yash");
			System.out.println("My age:= 19");
			System.out.println("My address:= in your heart");
		}
		else {
			System.out.print("Sorry! wrong password........");
		}
	}

}
