package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.Login;

public class TC001_CreateLead extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setData()
	{
		excelFile="create";
	}

	
	@Test(dataProvider="fetchData")
	public void runCreateLead(String fname,String lname,String cname)
	{
		new Login()
		.typeUsername()
		.typePassword()
		.clickLogin()
		.verifyLogin()
		.clickcrmlink()
		.clickLeads()
		.clickCreateLead()
		.companyname(cname)
		.firstname(fname)
		.lstnme(lname)
		.submitcreateLead()
		.viewLead();
	}
}
