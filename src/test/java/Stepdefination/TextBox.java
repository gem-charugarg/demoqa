package Stepdefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

//import PgeObject.Loginpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TextBox extends BaseClass 
{

@Given("I launch Chrome Browser")
public void i_launch_chrome_browser() 
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Charu.garg\\Downloads\\chromedriver_win32 (1)\\chromedriver_updated.exe");
	 driver= new ChromeDriver();
	 
}

@Then("Open website demoqa.com")
public void open_website_demoqa_com() 
{
	driver.get("https://demoqa.com/text-box");
	driver.manage().window().maximize();
}

@Then("Enter the value in {string} Full Name")
public void enter_the_value_in_full_name(String value) {
	driver.findElement(By.xpath("//input[@id=\"userName\"]")).sendKeys(value);
    
}

@Then("Enter the value in {string} Email")
public void enter_the_value_in_email(String value) {
	driver.findElement(By.xpath("//input[@id=\"userEmail\"]")).sendKeys(value);
}

@Then("Enter the value in {string} Current Address")
public void enter_the_value_in_current_address(String value) {
	driver.findElement(By.xpath("//textarea[@id=\"currentAddress\"]")).sendKeys(value);
}

@Then("Enter the value in {string} Permanent Address")
public void enter_the_value_in_permanent_address(String value) {
	driver.findElement(By.xpath("//textarea[@id=\"permanentAddress\"]")).sendKeys(value);
}

@Then("Click on submit button.")
public void click_on_submit_button() throws InterruptedException
{
	WebElement element = driver.findElement(By.xpath("//button[@id='submit']"));
	Actions actions = new Actions(driver);
	actions.moveToElement(element).click().build().perform();
	actions.moveToElement(element).click().build().perform();
}

@Then("Close the browser.")
public void close_the_browser() {
    driver.close();
}


@Then("Verify the details of users")
public void verify_the_details_of_users() 
{
	String name=driver.findElement(By.xpath("//p[@id='name']")).getText();
	String[] username = name.split(":");
	name=username[1];
	Assert.assertEquals(name,"abc");
	String email=driver.findElement(By.xpath("//p[@id='email']")).getText();
	String[] useremail = email.split(":");
	email=useremail[1];
	Assert.assertEquals(email,"abc@gmail.com");
	String add=driver.findElement(By.xpath("//p[@id='currentAddress']")).getText();
	String[] useradd = add.split(":");
	add=useradd[1];
	Assert.assertEquals(add,"Krishna Colony");
	String padd=driver.findElement(By.xpath("//p[@id='permanentAddress']")).getText();
	String[] userpadd = padd.split(":");
	padd=userpadd[1];
	Assert.assertEquals(padd,"Krishna Colony");
}




}
