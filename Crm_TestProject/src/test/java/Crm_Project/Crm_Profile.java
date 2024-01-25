package Crm_Project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;

public class Crm_Profile {

	public static WebDriver driver;{
	}
	@Test
	public void Profile() throws InterruptedException {
		// Click to profile
		Thread.sleep(2000);
		WebElement Profile = driver.findElement(By.xpath("//button[@class='btn dropdown-toggle border-0']"));
		Profile.click();
		Thread.sleep(2000);
		WebElement ProfileClick = driver.findElement(By.xpath("//a[@class='dropdown-item sidebar-dropdown']"));
		ProfileClick.click();
		// Click to edit
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		JavascriptExecutor ex = (JavascriptExecutor) driver;
		WebElement Edit = driver.findElement(By.xpath("(//i[@class='bi bi-pencil-fill'])[1]"));
		ex.executeScript("arguments[0].click();", Edit);
		Thread.sleep(2000);
		// Click to submit button
		WebElement Submit1 = driver
				.findElement(By.xpath("//button[@class='btn border-0 bg5 text-white rounded-pill submit-loader']"));
		ex.executeScript("arguments[0].click();", Submit1);
		// Click to popup button
		WebElement popup1 = driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']"));
		popup1.click();
		// Click to Organization details
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement details = driver.findElement(By.xpath("//button[@id='pills-profile-tab']"));
		details.click();
		// Click to Organization edit
		WebElement Edit1 = driver.findElement(By.xpath("(//i[@class='bi bi-pencil-fill'])[2]"));
		ex.executeScript("arguments[0].click();", Edit1);
		// Click to submit button
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement Submit2 = driver
				.findElement(By.xpath("//button[@class='btn border-0 bg5 text-white rounded-pill submit-loader']"));
		ex.executeScript("arguments[0].click();", Submit2);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement popup2 = driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']"));
		popup2.click();
		// click to User section
		Thread.sleep(3000);
		WebElement User = driver.findElement(By.xpath("(//a[@class='text-decoration-none'])[2]"));
		User.click();
		// Click to leads section
		Thread.sleep(3000);
		WebElement leads = driver.findElement(By.xpath("(//a[@class='text-decoration-none'])[3]"));
		leads.click();
		// Click to support section
		Thread.sleep(3000);
		WebElement support = driver.findElement(By.xpath("(//a[@class='text-decoration-none'])[4]"));
		support.click();
		// Click to password section
		Thread.sleep(3000);
		WebElement password1 = driver.findElement(By.xpath("(//a[@class='text-decoration-none'])[5]"));
		password1.click();
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
