package TestP;

public class Exampleofconstructer {

	int age;
	String name;

	public Exampleofconstructer(int i, String myname) {

		age = i;
		name = myname;

		System.out.println("SATISH");

	}

	void showcreds() {

		System.out.println("Name :" + name);
		System.out.println("age :" + age);
	}

	public static void main(String[] args) {

		Exampleofconstructer obj = new Exampleofconstructer(28, "Satish");
		
		Exampleofconstructer obj1 = new Exampleofconstructer(18, "harish");
		
		
		
		// Objectrepo  obj = new Objrepo("//div(text()='xx')","xpath","descriptionlocater")
		//Objectrepo  obj = new Objrepo("textbox","id","descriptionlocater")
		//Objectrepo  obj = new Objrepo("uname","classname","descriptionlocater")
		
		
		obj.showcreds();
		obj1.showcreds();

	}

}
