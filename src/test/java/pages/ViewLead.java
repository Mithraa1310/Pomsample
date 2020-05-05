package pages;

import base.ProjectSpecificMethods;

public class ViewLead extends ProjectSpecificMethods{

	public void viewLead()
	{
		String title =driver.findElementByXPath("//div[@class='x-panel-header sectionHeaderTitle']").getText();
		System.out.println(title);
	}
}
