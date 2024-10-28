class Case4{

	public void m1(int i, float f){

		System.out.println("int-float Version");
	}

	public void m1(float f, int i){

		System.out.println("float-int Version");
	}

	public static void main(String[] args){

		Case4 c = new Case4();
		c.m1(10, 10.5f); // int-float Version
		c.m1(10.5f, 10); // float-int Version
		c.m1(10, 10); // compilation Error: reference to m1 is ambiguous.
		c.m1(10.5f, 10.5f); // compilation Error: no suitable method found for m1(float,float)
	}
}