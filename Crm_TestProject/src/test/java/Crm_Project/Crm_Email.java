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
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class Crm_Email {
	public static WebDriver driver;

	@Test
	public void Email() throws InterruptedException {
		Thread.sleep(2000);
		WebElement EmailClick = driver.findElement(By.xpath("//i[@class='bi bi-envelope-check border-0 p-2']"));
		EmailClick.click();
		Thread.sleep(2000);
		WebElement Create = driver.findElement(By.xpath("//button[@class='btn bg1 rounded-2 text-white email-add-create']"));
        Create.click();
        Thread.sleep(3000);
        WebElement Signature = driver.findElement(By.xpath("(//button[@class='bg7 btn mb-0 main-color-3'])[1]"));
        Signature.click();
        Thread.sleep(3000);
        Select objSelect1 = new Select(driver.findElement(By.xpath("//select[@class='form-select border-0 border-bottom w-100 main-color-3 text-center']")));
        objSelect1.selectByIndex(1);
        Thread.sleep(2000);
        WebElement SignSubmit = driver.findElement(By.xpath("//button[@class='btn border-0 bg5 text-white next-imp-2 rounded-pill new_signature_submit']"));
        SignSubmit.click();
        Thread.sleep(3000);
        WebElement SelectContact = driver.findElement(By.xpath("//button[@id='selectContactsButton']"));
        SelectContact.click();
        Thread.sleep(2000);
        WebElement Search = driver.findElement(By.xpath("//input[@class='form-control border bg9 rounded-pill ps-5']"));
        Search.sendKeys("vasanth26");
        Thread.sleep(2000);
        WebElement checkbox = driver.findElement(By.xpath("//input[@name='code_id[]']"));
        checkbox.click();
        Thread.sleep(2000);
        WebElement submit = driver.findElement(By.xpath("//button[@id='submitButton']"));
        submit.click();
        Thread.sleep(2000);
        WebElement Popup = driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']"));
        Popup.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        try {
        	 WebElement Cc = driver.findElement(By.xpath("//div[@id='recipientCC']"));
             Cc.sendKeys("vasanthakumar.n@roundrockabaschool.onmicrosoft.com");
			
		} catch (Exception e) {
			System.out.println("Cc not working");
		}
        finally {
        Thread.sleep(3000);
        WebElement Subject = driver.findElement(By.xpath("//input[@id='subject']"));
        Subject.sendKeys("Test");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        WebElement Message = driver.findElement(By.xpath("(//div[@class='note-editable'])[1]"));
        Message.sendKeys("Demo Testing for Email marketing");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        JavascriptExecutor ex=(JavascriptExecutor)driver;
        WebElement Send = driver.findElement(By.xpath("//button[@class='btn border-0 bg5 text-white next-imp-2 rounded-pill image-w-110']"));
        ex.executeScript("arguments[0].click();", Send);
        
	}
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
