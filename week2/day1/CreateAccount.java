package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Accounts").click();
		driver.findElementByLinkText("Create Account").click();
		driver.findElementById("accountName").sendKeys("Debit Limited Account");
		driver.findElementByName("description").sendKeys("Selenium Automation Tester");
		driver.findElementById("groupNameLocal").sendKeys("CB");
		driver.findElementById("officeSiteName").sendKeys("SYD");
		driver.findElementById("annualRevenue").sendKeys("50000");

		//Drop down industry
		WebElement industry=driver.findElementByName("industryEnumId");
		Select dropDown1=new Select(industry);
		dropDown1.selectByVisibleText("Computer Software");

		//Drop down OwnerShip 
		WebElement ownerShip=driver.findElementByName("ownershipEnumId");
		Select dropDown2=new Select(ownerShip);
		dropDown2.selectByVisibleText("S-Corporation");


		//Drop down Source 
		WebElement source=driver.findElementByName("dataSourceId");
		Select dropDown3=new Select(source);
		dropDown3.selectByValue("LEAD_EMPLOYEE");
		//dropDown2.selectByVisibleText("S-Corporation");

		//Drop Down MarketingCampaign
		WebElement marktCampaign=driver.findElementById("marketingCampaignId");
		Select dropDown4=new Select(marktCampaign);

		List<WebElement> options2 = dropDown4.getOptions();
		int size=options2.size();
		dropDown4.selectByIndex(size-3);


		WebElement state =driver.findElementById("generalStateProvinceGeoId");
		Select dropDown5=new Select(state);
		dropDown5.selectByValue("TX");

		driver.findElementByClassName("smallSubmit").click();

		Thread.sleep(5000);
		driver.findElementByClassName("buttonDangerous").click();
		
	


	}

}
