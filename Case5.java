class Case5{

	public void m1(int x){

		System.out.println("General Method");
	}

	public void m1(int... x){

		System.out.println("Var-argu Method");
	}

	public static void main(String[] args){

		Case5 c = new Case5();
		c.m1(); // Var-argu Method
		c.m1(10, 20); // Var-argu Method
		c.m1(10); // General Method
		 
	}
}