class Case1{

	public void m1(int i){

		System.out.println("int Argument");
	}

	public void m1(float f){

		System.out.println("float Argument");
	}

	public static void main(String[] args){

		Case1 c = new Case1();

		c.m1(10); // int Argument
		c.m1(10.5f); // float Argument
		c.m1('a'); // int Argument. This is possible because automatic promotion.
		c.m1(10l); // float Argument. This is possible because automatic promotion.
		c.m1(10.5); // c.m1(10.5); (argument mismatch; possible lossy conversion from double to int)
                           //^
                              
      
	}
}