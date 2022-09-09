package second;

class variable {
	int a=10; //instance variable
	static double b=20.3; //static variable
	public static void main(String[] args) {
			
		boolean c=true; //local variable
		
		variable s=new variable();
		System.out.println(s.a);
		System.out.println(b);
		System.out.println(c);
	}

}
