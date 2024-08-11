package com.qa.objrepo;

public class Elementrepo {

	private String Locater;
	private String Type;
	private String Description;

	public Elementrepo(String Locater, String Type, String Description) {

		this.Locater = Locater;
		this.Type = Type;
		this.Description = Description;
	}

	public String getlocater() {

		return this.Locater;
	}

	public void setlocater(String Locater) {

		this.Locater = Locater;
	}

	public String getType() {

		return this.Type;
	}

	public void setType(String Type) {

		this.Type = Type;
	}

	public String getDescription() {

		return this.Description;
	}

	public void setDescription(String Description) {

		this.Description = Description;
	}
	
	public static Elementrepo sigin = new Elementrepo("//li[@class='authorization-link'][1]", "XPATH", "Signinlink");
	public static Elementrepo username = new Elementrepo("//input[@id='email']", "XPATH", "username Textbox");
	public static Elementrepo password = new Elementrepo("//input[@title='Password']", "XPATH", "password Textbox");
	public static Elementrepo loginbutton = new Elementrepo("//button[@id='send2'][1]", "XPATH", "Loginbutton");
	public static Elementrepo Welcometext = new Elementrepo("//li[@class='greet welcome'][1]", "XPATH", "Welcome text from Home page");
	public static Elementrepo womanstab	= new Elementrepo("//span[text()='Women']", "XPATH", "Womans tab");
	public static Elementrepo whatsnewtab	= new Elementrepo("//span[text()='Women']//preceding::span[2]", "XPATH", "whats new tab");
	public static Elementrepo salestab	= new Elementrepo("//span[text()='Sale']", "XPATH", "Sales tab");
	public static Elementrepo logoutarrow = new Elementrepo("//button[@class='action switch'][1]", "XPATH", "Arrow button");
	public static Elementrepo signoutlink = new Elementrepo("/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a","XPATH","Signoutlink");
			

}
