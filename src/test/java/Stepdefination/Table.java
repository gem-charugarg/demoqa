package Stepdefination;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Table extends BaseClass 
{

	@Given("Launch the Chrome.")
	public void launch_the_chrome() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Charu.garg\\Downloads\\chromedriver_win32 (1)\\chromedriver_updated.exe");
		 driver= new ChromeDriver();
	}

	@Then("Navigate to the Webtable link")
	public void navigate_to_the_webtable_link() {
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
	}

	@Then("Verify the Column header names.")
	public void verify_the_column_header_names() {
	    List<WebElement> list=driver.findElements(By.xpath("//div[@class='rt-resizable-header-content']"));
	    ArrayList<String> values = new ArrayList<String>();
	    for(int i=0;i<list.size();i++)
	    {
	    	values.add(list.get(i).getText());
	    }
	    if(values.contains("First Name") || values.contains("Last Name") || values.contains("Age") ||
	    		values.contains("Email") || values.contains("Salary") || values.contains("Department") 
	    		|| values.contains("Action"))
	    {
	    	System.out.println("Check the headers");
	    }
	}
	@Then("Close browser.")
	public void close_browser() {
	    driver.close();
	}
	
	@Then("Click on Add button")
	public void click_on_add_button() {
	    driver.findElement(By.xpath("//button[@id='addNewRecordButton']")).click();
	}
	
	@Then("Enter {string} in First Name")
	public void enter_in_first_name(String value1) {
	    driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(value1);
	}
	
	@Then("Enter {string} in Last Name")
	public void enter_in_last_name(String value2) {
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(value2);
	}
	
	@Then("Enter {string} in Email")
	public void enter_in_email(String value3) {
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys(value3);
	}
	
	@Then("Enter {string} in Age")
	public void enter_in_age(String value4) {
		driver.findElement(By.xpath("//input[@id='age']")).sendKeys(value4);
	}
	
	@Then("Enter {string} in Salary")
	public void enter_in_salary(String value5) {
		driver.findElement(By.xpath("//input[@id='salary']")).sendKeys(value5);
	}
	
	@Then("Enter {string} in Department")
	public void enter_in_department(String value6) {
		driver.findElement(By.xpath("//input[@id='department']")).sendKeys(value6);

	}
	@Then("Click on the submit button.")
	public void click_on_the_submit_button() 
	{
	    driver.findElement(By.xpath("//button[@id='submit']")).click();
	}

}
