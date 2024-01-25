package Crm_Project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class Crm_UserProfile {
	public static WebDriver driver;

	@Test
	public void UserProfile() throws InterruptedException {
		// Click to profile
		Thread.sleep(2000);
		WebElement Profile = driver.findElement(By.xpath("//button[@class='btn dropdown-toggle border-0']"));
		Profile.click();
		Thread.sleep(2000);
		WebElement ProfileClick = driver.findElement(By.xpath("//a[@class='dropdown-item sidebar-dropdown']"));
		ProfileClick.click();
		// click to User section
		Thread.sleep(3000);
		WebElement User = driver.findElement(By.xpath("(//a[@class='text-decoration-none'])[2]"));
		User.click();
		//click to create button
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement CreateUser = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		CreateUser.click();
		//Enter the first name
		WebElement name1 = driver.findElement(By.xpath("//input[@name='first_name']"));
		name1.sendKeys("Vasanth");
		//Enter the last name
		WebElement name2 = driver.findElement(By.xpath("//input[@name='last_name']"));
		name2.sendKeys("Tester");
		//Enter the Email
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement Email1 = driver.findElement(By.xpath("//input[@name='email']"));
		Email1.sendKeys("medadel625@bikedid.com");
		//Enter the phone no
		WebElement phone1 = driver.findElement(By.xpath("//input[@id='phone_number1']"));
		phone1.sendKeys("9988776655");
		//Select reporting user
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Select objSelect5 = new Select(driver.findElement(By.xpath("//select[@id='reporting_to_select']")));
		objSelect5.selectByIndex(1);
		//Select team
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Select objSelect6 = new Select(driver.findElement(By.xpath("//select[@id='user_team_select']")));
		objSelect6.selectByIndex(1);
		//Click to auto generate password
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement pass = driver.findElement(By.xpath("//span[@id='generatePassword']"));
		pass.click();
		//Click to submit
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement submit = driver.findElement(By.xpath("//button[@class='btn border-0 bg5 text-white rounded-pill submit-loader']"));
		submit.click();
		//Close popup
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement popup3 = driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']"));
		popup3.click();
		
	}
	@BeforeClass
	public void Login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vasanthakumar\\eclipse-workspace\\Crm_TestProject\\driver\\chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(ops);
		// Enter the url
		driver.get("https://crmdigitalmarketing.com/");
		driver.manage().window().maximize();
		// Enter the crm admin email
		WebElement Email = driver.findElement(By.id("email"));
		Email.sendKeys("saravanaprasad@theinfinityhub.com");
		// Enter the crm admin password
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Sksking96@");
		// Enter the login submit
		Thread.sleep(3000);
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
	}

	@AfterClass
	public void Close() {
	}

}
