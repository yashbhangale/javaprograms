package second;


public class nested_ifelse {

	public static void main(String[] args) {
		int num1=7,num2=8,num3=0;

		System.out.println("num1,num2,num3");
		if(num1>num2)
		{
			if(num1>num3)
			{
				System.out.print("maximum no: "+num1);
			}
			else
			{
				System.out.print("maximum no: "+num3);
			}
		}
		else
		{
			if(num2>num3) {
				System.out.print("maximum no: "+num2);
			}
			else
			{
				System.out.print("maximum no: "+num3);
			}
		}
	}

}
