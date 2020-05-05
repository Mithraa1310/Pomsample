package pages;

import base.ProjectSpecificMethods;

public class Leadcreation extends ProjectSpecificMethods {

	public Leadcreation companyname(String cname) {
		driver.findElementById("createLeadForm_companyName").sendKeys(cname);
		return this;
	}

	public Leadcreation firstname(String fname) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fname);
		return this;
	}

	public Leadcreation lstnme(String lname){
		driver.findElementById("createLeadForm_lastName").sendKeys(lname);
		return this;
	}

	public ViewLead submitcreateLead() {

		driver.findElementByName("submitButton").click();
		return new ViewLead();
	}

	

}
