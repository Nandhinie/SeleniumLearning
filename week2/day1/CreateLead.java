package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Collaber");
		driver.findElementById("createLeadForm_firstName").sendKeys("Nandhini");
		driver.findElementById("createLeadForm_lastName").sendKeys("Ravi");

		//Drop down Source
		WebElement source=driver.findElementById("createLeadForm_dataSourceId");
		Select dropDown1=new Select(source);
		dropDown1.selectByVisibleText("Employee");

		//Drop down MarketingCampaignId 
		WebElement source1=driver.findElementById("createLeadForm_marketingCampaignId");
		Select dropDown2=new Select(source1);
		dropDown2.selectByVisibleText("Pay Per Click Advertising");


		//Drop Down Industry 
		WebElement source2=driver.findElementById("createLeadForm_industryEnumId");
		Select dropDown3=new Select(source2);
		List<WebElement> options=dropDown3.getOptions();

		int size= options.size();
		dropDown3.selectByIndex(size-2);


		//Drop Down Ownership 
		WebElement source3=driver.findElementById("createLeadForm_ownershipEnumId");
		Select dropDown4=new Select(source3);
		dropDown4.selectByIndex(5);

		//Drop Down Country 
		WebElement source4=driver.findElementById("createLeadForm_generalCountryGeoId");
		Select dropDown5=new Select(source4);
		dropDown5.selectByVisibleText("India");

		driver.findElementByName("submitButton").click();

		String title=driver.getTitle();
		System.out.println(title);

		//Thread.sleep(10000);


		//driver.close();
	}

}
