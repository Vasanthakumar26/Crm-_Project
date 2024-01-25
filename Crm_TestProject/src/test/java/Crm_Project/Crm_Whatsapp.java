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

public class Crm_Whatsapp {
	public static WebDriver driver;
	//public static JavascriptExecutor ex=(JavascriptExecutor)driver;

	@Test
	public void WhatsApp() throws InterruptedException {
		// Click to WhatsApp
		WebElement WhasappClick = driver.findElement(By.xpath("//i[@class='bi bi-whatsapp border-0 p-2']"));
		WhasappClick.click();
		// Click to create button
		Thread.sleep(2000);
		WebElement Create = driver.findElement(By.xpath("//button[@class='btn bg1 rounded-2 text-white add-create']"));
		Create.click();
		Thread.sleep(2000);
		//choose the image template
		WebElement imageTemp = driver
				.findElement(By.xpath("(//button[@class='nav-link rounded-pill ms-lg-2 mb-2'])[1]"));
		imageTemp.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		JavascriptExecutor ex=(JavascriptExecutor)driver;
		WebElement TemSelect = driver.findElement(By.xpath("(//button[text()='Select'])[9]"));
		ex.executeScript("arguments[0].click();", TemSelect);
		//Click to Select Contact
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement SelectContact = driver.findElement(By.xpath("//button[@class='btn border-0 bg7 py-2 rounded-1 select-contacts']"));
		SelectContact.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement Search1 = driver.findElement(By.xpath("(//input[@id='dataTableSearch1'])[1]"));
		Search1.sendKeys("vasanth");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement ContactClick = driver.findElement(By.xpath("//input[@name='code_id[]']"));
		ContactClick.click();
		WebElement SubmitClick = driver.findElement(By.xpath("(//button[@class='btn  rounded-pill px-4 bg1 text-white ms-2 submit-contacts'])[1]"));
		SubmitClick.click();
		//Enter the message
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement Message = driver.findElement(By.xpath("//div[@class='note-editable']"));
		Message.sendKeys("hELLO");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//Upload file
		WebElement File = driver.findElement(By.xpath("//input[@class='position-absolute top-0 end-0 opacity-0 w-100 h-100 message-file']"));
		File.sendKeys("C:\\Users\\Vasanthakumar\\Downloads\\download.png");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//Click to send button
		WebElement send = driver.findElement(By.xpath("//button[@class='btn border-0 bg5 text-white next-imp-2 rounded-pill ms-3 px-4 send-message']"));
		ex.executeScript("arguments[0].click();", send);
		

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
		//driver.quit();
	}

}
