package pages;

import base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods {
	
	public LeadsPage clickLeads()
	{
		driver.findElementByLinkText("Leads").click();
		return new LeadsPage();
		
	}

}
