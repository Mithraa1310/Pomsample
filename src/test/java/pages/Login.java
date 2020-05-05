package pages;

import base.ProjectSpecificMethods;

//@Parameters({"username","Password"})
public class Login extends ProjectSpecificMethods{
	
public Login typeUsername()
{
	driver.findElementById("username").sendKeys("demosalesmanager");
	return this;
}
public  Login typePassword()

{
	driver.findElementById("password").sendKeys("crmsfa");
	return this;
}
public HomePage clickLogin()
{
	
	driver.findElementByClassName("decorativeSubmit").click();
	return new HomePage();
}



}
