package base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.ReadExcel;



public class ProjectSpecificMethods {

public static ChromeDriver driver;
public static String excelFile;

@Parameters({"url"})	
@BeforeMethod
	public void startApp(String url) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}	
	
	@AfterMethod
	public void closeApp() {

		driver.close();
}
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException
	{
	
		return ReadExcel.readexcel(excelFile);
}

}	


