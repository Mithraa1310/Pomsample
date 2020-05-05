package pages;

import base.ProjectSpecificMethods;

public class LeadsPage  extends ProjectSpecificMethods{
	
	public Leadcreation clickCreateLead()

	{
		driver.findElementByLinkText("Create Lead").click();
		return new Leadcreation();
	}
}
