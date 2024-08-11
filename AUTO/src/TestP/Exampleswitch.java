package TestP;

public class Exampleswitch {
	
	
	
	void showchannel(String key, String well, int count) {
				
		switch (key) {
		case "NGO": 	System.out.println("NGO was Telecasting");  break;			
		case "TV9": 	System.out.println("TV9 was Telecasting");  break;
		case "MUSIC":   System.out.println("MUSIC was Telecasting");  break;
		case "SPORTS":  System.out.println("SPORTS was Telecasting");  break;
					
		}	
	}

	public static void main(String[] args) {
		
		Exampleswitch obj = new Exampleswitch();
		obj.showchannel("MUSIC","TV9",98 );
		
		

	}

}
