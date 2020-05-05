package pages;

import base.ProjectSpecificMethods;

public class HomePage  extends ProjectSpecificMethods {

	public HomePage verifyLogin()
	{
		String text =driver.findElementByXPath("//div[@id='form']/h2").getText();
		 System.out.println(text);
		 return this;
	}
	
		
	public MyHomePage clickcrmlink()
	{
		driver.findElementByLinkText("CRM/SFA").click();
		return new MyHomePage();
		
	}
}
