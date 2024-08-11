package TestP;

import java.util.Iterator;

public class Cntrl1 {
	
	
	 static void opendoor() {
		System.out.println("list opned in  fllor");
      }

	public static void main(String[] args) {
		
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		
		System.out.println("-----------------------");
			
		for(int i=0; i<10; i++) {
			
			if(i==3) {				
				opendoor();				
			}
			else {
			System.out.println("floor was not opend");}						
		}
		

	}

}
