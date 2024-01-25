package Crm_Project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class Crm_LeadsProfile {
	public static WebDriver driver;

	@Test
	public void leadsProfile() throws InterruptedException {
		//click to leads
		Thread.sleep(2000);
		WebElement leads = driver.findElement(By.xpath("//a[@class='btn rounded-0 fs-3 border-0'][1]"));
		leads.click();
		//Click to search field
		Thread.sleep(3000);
		WebElement Search = driver.findElement(By.xpath("//input[@name='search']"));
		Search.sendKeys("Vasanth");
		Search.sendKeys(Keys.ENTER);
		//Click to search name
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement NameClick = driver.findElement(By.xpath("//a[text()='Vasanth N']"));
		NameClick.click();
		//click to activity
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement Activity = driver.findElement(By.xpath("//button[@id='pills-activity-tab']"));
		Activity.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement ActivityClick = driver.findElement(By.xpath("(//button[@class='btn btn border-0 bg3 text-white fs-6 text-secondary px-3'])[1]"));
        ActivityClick.click();
        //Enter the activity type
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement ActivityType = driver.findElement(By.xpath("//input[@name='activity_type']"));
        ActivityType.sendKeys("Demo Test");
        //click to add button
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement add = driver.findElement(By.xpath("//button[@id='active_btn']"));
        add.click();
        //click to leads details
        driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement leadsDetails = driver.findElement(By.xpath("//button[@id='pills-details-tab']"));
        leadsDetails.click();
        //click to task section
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement Task = driver.findElement(By.xpath("//button[@id='pills-tasks-tab']"));
        Task.click();
        //click to create task button
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement CreateTask = driver.findElement(By.xpath("//button[@class='btn btn-secondary border-0 bg3 text-white fs-6 text-secondary px-3 dropdown-toggle']"));
        CreateTask.click();
        //click meeting 
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement meeting = driver.findElement(By.xpath("(//span[@class='dropdown-item px-3 py-2 main-color-3'])[1]"));
        meeting.click();
        //click to date
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement date = driver.findElement(By.xpath("(//input[@id='schedule_date'])[1]"));
        date.click();
        //click to hourse
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        try {
        	Select hourse = new Select(driver.findElement(By.xpath("(//select[@class='hourselect'])[1]")));
            hourse.selectByIndex(1);
		} 
        catch (Exception e) 
        {
			System.out.println("hourse not working");
		}
        finally {
        //click to minutes
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        try {
        	Select minutes = new Select(driver.findElement(By.xpath("(//select[@class='minuteselect'])[1]")));
            minutes.selectByIndex(5);
     		} 
        catch (Exception e)
          {
     			System.out.println("minutes not working");
     		}
     			
        finally {
        //click to apply button
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement apply = driver.findElement(By.xpath("(//button[@class='applyBtn btn btn-sm bg-slate-600'])[1]"));
        apply.click();
        //enter the subject
        WebElement subject = driver.findElement(By.xpath("(//input[@name='subject'])[1]"));
        subject.sendKeys("demo automation testing");
        //click to reminder checkbox
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement reminder = driver.findElement(By.xpath("(//input[@name='reminder'])[1]"));
        reminder.click();
        //click to save button
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement save = driver.findElement(By.xpath("(//button[@class='btn border-0 bg5 text-white rounded-pill task_btn'])[1]"));
        save.click();
        //click to notes section
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement notes = driver.findElement(By.xpath("//button[@id='pills-notes-tab']"));
        notes.click();
        //click to create note button
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement CreateNotes = driver.findElement(By.xpath("(//button[@class='btn btn border-0 bg3 text-white fs-6 text-secondary px-3'])[2]"));
        CreateNotes.click();
        //enter the subject
        WebElement subject1 = driver.findElement(By.xpath("(//input[@id='subject'])[4]"));
        subject1.sendKeys("Test");
        //enter the description
        WebElement description = driver.findElement(By.xpath("(//textarea[@id='description'])[4]"));
        description.sendKeys("Short description");
        //upload file
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement file = driver.findElement(By.xpath("//input[@name='file']"));
        file.sendKeys("C:\\Users\\Vasanthakumar\\Downloads\\Selenium Basics Certificate.pdf");
        //click to submit
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement submit2 = driver.findElement(By.xpath("//button[@id='notes_btn']"));
        submit2.click();
        //click to documents section
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement documents = driver.findElement(By.xpath("//button[@id='pills-documents-tab']"));
        documents.click();
        //click to checkbox
        WebElement checkbox = driver.findElement(By.xpath("//input[@class='form-check-input category-check-all']"));
        checkbox.click();
        //Click to download button
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement download = driver.findElement(By.xpath("//button[@id='notes_download']"));
        download.click();
        }
       }   
        
	}

	@BeforeClass
	public void login() throws InterruptedException {
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
	public void close() {
	}

}
