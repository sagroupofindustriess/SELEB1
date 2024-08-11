package TestP;

public class Javaexample {
	
	//instance varaibles
	String name = "satish";   
	int number = 865;
	double ff  = 328642783;
	
	
	//static variable
	static String inistitutename =  "keystone";
		
	 //non static method
	 void type() {
		 //local variables
		double ff  = 328642783;
		boolean flag = true;  //false
		char ch = 'A';
		
		System.out.println("HYD");
	 }
	
	    //static method
		static void type1() {
		    //local variables
			double ff  = 328642783;
			boolean flag = true;  //false
			char ch = 'A';
		
		System.out.println("vja");
		
	}
	
	public static void main(String[] args) {
				
		//creating object or instantiation
		Javaexample obj =  new Javaexample();
		
		System.out.println(obj.name);
		System.out.println(inistitutename);
		
		obj.type();    //calling not static method using obj refernce
		type1();       //calling static method with using obj refernce
	}
}
