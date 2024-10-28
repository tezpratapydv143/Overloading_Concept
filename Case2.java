class Case2{

	public void m1(String s){

		System.out.println("String Version");
	}

	public void m1(Object o){

		System.out.println("Object Version");
	}

	public static void main(String[] args){

		Case2 c = new Case2();
		c.m1(new Object()); // Object Version
		c.m1("Tezpratap"); // String Version
		c.m1(null); // String Version
	}
}