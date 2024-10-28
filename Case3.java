class Case3{

	public void m1(String s){

		System.out.println("String Version");
	}

	public void m1(StringBuffer sb){

		System.out.println("StringBuffer Version");
	}

	public static void main(String[] args){

		Case3 c = new Case3();
		c.m1("Tezpratap"); // String Version
		c.m1(new StringBuffer("Yadav")); // StringBuffer Version
		c.m1(null); //  reference to m1 is ambiguous because both have null value so they didn't decied and both are same level
	}
}