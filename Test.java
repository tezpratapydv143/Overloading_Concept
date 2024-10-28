class Animal{


}

class Monkey extends Animal{

}

class Test{

	public void m1(Animal a){
		System.out.println("Animal Version");
	}

	public void m1(Monkey m){
		System.out.println("Monkey  Version");
	}

	public static void main(String[] args){

		Test t = new Test();

		Animal a = new Animal(); // Animal Version
		t.m1(a);

		Monkey m = new Monkey(); // Monkey Version
		t.m1(m);

		Animal a1 = new Monkey(); // Animal Version
		t.m1(a1);


	}
}