package bs_practical_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationTest {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		Thread.sleep(5000);

		driver.findElementByXPath("//a[@class=\"login\"]").click();
		driver.findElementByXPath("//input[@id=\"email_create\"]").sendKeys("tarikul9@gmail.com");
		driver.findElementByXPath("//button[@id=\"SubmitCreate\"]").click();
		
		Thread.sleep(5000);
		
		driver.findElementByXPath("//label[@for=\"id_gender1\"]").click();
		driver.findElementByXPath("//input[@id=\"customer_firstname\"]").sendKeys("Tarikul");
		driver.findElementByXPath("//input[@id=\"customer_lastname\"]").sendKeys("Islam");
		driver.findElementByXPath("//input[@id=\"email\"]").click();
		driver.findElementByXPath("//input[@id=\"passwd\"]").sendKeys("123456");
		
		WebElement dateDown = driver.findElementByXPath("//select[@name=\"days\"]");;
		Select dateSelect= new Select(dateDown);
		dateSelect.selectByValue("10");
		
		WebElement monthDown = driver.findElementByXPath("//select[@name=\"months\"]");;
		Select monthSelect= new Select(monthDown);
		monthSelect.selectByValue("8");
		
		WebElement yearDown = driver.findElementByXPath("//select[@name=\"years\"]");;
		Select yearSelect= new Select(yearDown);
		yearSelect.selectByValue("1985");
		
		driver.findElementByXPath("//input[@name=\"newsletter\"]").click();
		
		Thread.sleep(5000);

		driver.findElementByXPath("//input[@id=\"firstname\"]").click();
		driver.findElementByXPath("//input[@id=\"lastname\"]").click();
		driver.findElementByXPath("//input[@id=\"company\"]").sendKeys("N/A");
		driver.findElementByXPath("//input[@name=\"address1\"]").sendKeys("Mohakhali");
		driver.findElementByXPath("//input[@name=\"address2\"]").sendKeys("Dhaka");
		driver.findElementByXPath("//input[@name=\"city\"]").sendKeys("Dhaka");

		WebElement stateDown = driver.findElementByXPath("//select[@name=\"id_state\"]");;
		Select stateSelect= new Select(stateDown);
		stateSelect.selectByValue("3");
		
		driver.findElementByXPath("//input[@name=\"postcode\"]").sendKeys("12010");
		driver.findElementByXPath("//textarea[@name=\"other\"]").sendKeys("Dhaka");
		driver.findElementByXPath("//input[@name=\"phone\"]").sendKeys("01735096282");
		driver.findElementByXPath("//input[@name=\"phone_mobile\"]").sendKeys("01735096282");
		driver.findElementByXPath("//input[@name=\"alias\"]").sendKeys(": Jamalpur");
		
		Thread.sleep(5000);

		driver.findElementByXPath("//button[@name=\"submitAccount\"]").click();

		Thread.sleep(10000);
		
		driver.findElementByXPath("//a[@class=\"logout\"]").click();
		
		Thread.sleep(5000);

		driver.findElementByXPath("//input[@id='email']").sendKeys("tarikul9@gmail.com");
		driver.findElementByXPath("//input[@id=\"passwd\"]").sendKeys("123456");
		driver.findElementByXPath("//button[@id=\"SubmitLogin\"]").click();
		
		Thread.sleep(5000);

		driver.close();

		
	}

}
