package Crm_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Crm_Login {

	public static WebDriver driver;

	@Test
	public void CrmTest() throws InterruptedException {
		// Enter the crm admin email
		WebElement Email = driver.findElement(By.id("email"));
		Email.sendKeys("saravanaprasad@theinfinityhub.com");
		// Enter the crm admin password
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Sksking96@");
		// Enter the login submit
		Thread.sleep(2000);
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		Thread.sleep(2000);
		WebElement leads = driver.findElement(By.xpath("//a[@class='btn rounded-0 fs-3 border-0'][1]"));
		leads.click();
		// quick add click
		Thread.sleep(2000);
		WebElement quickAdd = driver.findElement(By.xpath(
				"//span[@class='fit-content bg9 rounded-2 fs-2 main-color-3 material-symbols-outlined p-2'][1]"));
		quickAdd.click();
		// Enter the first name
		Thread.sleep(2000);
		WebElement FirstName = driver.findElement(By.xpath("(//input[@name='first_name'])[2]"));
		FirstName.sendKeys("Vasanth");
		// Enter the last name
		WebElement LastName = driver.findElement(By.xpath("(//input[@name='last_name'])[2]"));
		LastName.sendKeys("N");
		// Enter the phone no
		Thread.sleep(2000);
		WebElement phoneNum = driver.findElement(By.xpath("//input[@name='phone_no']"));
		phoneNum.sendKeys("9080468174");
		WebElement cmyNum = driver.findElement(By.xpath("(//input[@name='cmp_mobile'])[2]"));
		cmyNum.sendKeys("9988776655");
		// Enter the Email
		Thread.sleep(2000);
		WebElement LeadEmail = driver.findElement(By.id("email_id"));
		LeadEmail.sendKeys("vasanth26va@gmail.com");
		// Enter the cmy name
		WebElement cmyName = driver.findElement(By.id("companyname"));
		cmyName.sendKeys("Wibro");
		// Click to save
		Thread.sleep(2000);
		WebElement leadSave = driver.findElement(By.xpath("//button[@id='quicksubmitBtn']"));
		leadSave.click();
		// Click the create lead
		Thread.sleep(3000);
		WebElement CreateLead = driver.findElement(By.xpath(
				"(//span[@class='fit-content bg9 rounded-2 fs-2 main-color-3 material-symbols-outlined p-2'])[2]"));
		CreateLead.click();
		Thread.sleep(2000);
		WebElement FirstName1 = driver.findElement(By.xpath("(//input[@name='first_name'])[1]"));
		FirstName1.sendKeys("Dinesh");
		WebElement LastName1 = driver.findElement(By.xpath("(//input[@name='last_name'])[1]"));
		LastName1.sendKeys("K");
		WebElement LeadEmail1 = driver.findElement(By.xpath("(//input[@name='person_emailid'])[1]"));
		LeadEmail1.sendKeys("dinesh.krishnan@roundrockabaschool.onmicrosoft.com");
		Thread.sleep(2000);
		WebElement phoneNum1 = driver.findElement(By.xpath("(//input[@name='person_mobile'])[1]"));
		phoneNum1.sendKeys("6379732890");
		WebElement cmyNum1 = driver.findElement(By.xpath("(//input[@name='cmp_mobile'])[1]"));
		cmyNum1.sendKeys("9876543210");
		// Click to next
		Thread.sleep(2000);
		WebElement Next1 = driver.findElement(By.xpath("//button[@id='btn_submit_one']"));
		Next1.click();
		Thread.sleep(2000);
		WebElement cmyName1 = driver.findElement(By.xpath("(//input[@name='company_name'])[1]"));
		cmyName1.sendKeys("TCS");
		// Enter the Email
		Thread.sleep(2000);
		WebElement Email1 = driver.findElement(By.xpath("(//input[@name='company_email'])[1]"));
		Email1.sendKeys("vasan@gmail.com");
		WebElement Next2 = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		Next2.click();
		// Click to next
		Thread.sleep(2000);
		WebElement Next3 = driver.findElement(By.xpath("//button[@id='btn_submit_three']"));
		Next3.click();
		// Click to next
		Thread.sleep(2000);
		WebElement Next4 = driver.findElement(By.xpath("//button[@id='btn_submit_four']"));
		Next4.click();
		// Enter the maker email id
		Thread.sleep(2000);
		WebElement MakerEmail = driver.findElement(By.xpath("//input[@name='maker_email']"));
		MakerEmail.sendKeys("dinesh@gmail.com");
		// Click to Submit
		Thread.sleep(2000);
		WebElement Submit = driver.findElement(By.xpath("//button[@id='leadsubmitBtn']"));
		Submit.click();
		// Click to import
		Thread.sleep(2000);
		WebElement import1 = driver.findElement(By.xpath(
				"(//span[@class='fit-content bg9 rounded-2 fs-2 main-color-3 material-symbols-outlined p-2'])[3]"));
		import1.click();
		// upload file
		Thread.sleep(2000);
		WebElement FileAttachment = driver.findElement(By.xpath("//input[@id='fileimport']"));
		FileAttachment.sendKeys("C:\\Users\\Vasanthakumar\\Downloads\\sample.xlsx");
		// click to next
		Thread.sleep(3000);
		WebElement importNext1 = driver.findElement(By.xpath("//button[@id='page-imp-1-btn']"));
		importNext1.click();
		// Click map to CRM fields
		Thread.sleep(4000);
		Select objSelect1 = new Select(driver.findElement(
				By.xpath("(//select[@class='fw-light main-color-3 py-1 rounded-5 text-center w-100 yourid'])[2]")));
		objSelect1.selectByIndex(1);
		Thread.sleep(1000);
		Select objSelect2 = new Select(driver.findElement(
				By.xpath("(//select[@class='fw-light main-color-3 py-1 rounded-5 text-center w-100 yourid'])[3]")));
		objSelect2.selectByIndex(2);
		Thread.sleep(1000);
		Select objSelect3 = new Select(driver.findElement(
				By.xpath("(//select[@class='fw-light main-color-3 py-1 rounded-5 text-center w-100 yourid'])[4]")));
		objSelect3.selectByIndex(3);
		Thread.sleep(1000);
		Select objSelect4 = new Select(driver.findElement(
				By.xpath("(//select[@class='fw-light main-color-3 py-1 rounded-5 text-center w-100 yourid'])[5]")));
		objSelect4.selectByIndex(4);
		Thread.sleep(1000);
		Select objSelect5 = new Select(driver.findElement(
				By.xpath("(//select[@class='fw-light main-color-3 py-1 rounded-5 text-center w-100 yourid'])[6]")));
		objSelect5.selectByIndex(5);
		Thread.sleep(1000);
		Select objSelect6 = new Select(driver.findElement(
				By.xpath("(//select[@class='fw-light main-color-3 py-1 rounded-5 text-center w-100 yourid'])[7]")));
		objSelect6.selectByIndex(6);
		Thread.sleep(1000);
		WebElement importNext2 = driver.findElement(By.xpath("//button[@id='page-imp-2-btn']"));
		importNext2.click();
		WebElement importName = driver.findElement(By.xpath("//input[@name='import_users_name']"));
		importName.sendKeys("Test");
		Thread.sleep(2000);
		WebElement importNext3 = driver
				.findElement(By.xpath("//button[@class='btn border-0 bg5 text-white next-imp-3 rounded-pill']"));
		importNext3.click();
		// Click to import close
		Thread.sleep(1000);
		WebElement importClose = driver.findElement(By.xpath("(//button[@class='btn border-0 btn-close'])[9]"));
		importClose.click();
		// Click to download
		Thread.sleep(2000);
		WebElement download = driver.findElement(By.xpath(
				"(//span[@class='fit-content bg9 rounded-2 fs-2 main-color-3 material-symbols-outlined p-2'])[4]"));
		download.click();
		// click to download close button
		Thread.sleep(1000);
		WebElement downloadClose = driver.findElement(By.xpath("(//button[@class='btn border-0 btn-close'])[7]"));
		downloadClose.click();
	}

	@BeforeClass
	public void login() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vasanthakumar\\eclipse-workspace\\Crm_TestProject\\driver\\chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(ops);
		// Enter the url
		driver.get("https://app.crmdigitalmarketing.com/");
		driver.manage().window().maximize();
	}

	@AfterClass
	public void close() {

	}

}