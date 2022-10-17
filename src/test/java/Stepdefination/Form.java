package Stepdefination;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
public class Form extends BaseClass  
{

@Then("Launching the browser")
public void launching_the_browser() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Charu.garg\\Downloads\\chromedriver_win32 (1)\\chromedriver_updated.exe");
	 driver= new ChromeDriver();
}

@Then("Naviagate to form page")
public void naviagate_to_form_page() {
	driver.get("https://demoqa.com/automation-practice-form");
	driver.manage().window().maximize();
}

@Then("Enter the {string} in Mobile Number")
public void enter_the_in_mobile_number(String val) 
{
	driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys(val);
}

@Then("Select the value from Calendar")
public void select_the_value_from_calendar() {
    
}

@Then("Enter the {string} in subjects")
public void enter_the_in_subjects(String val) 
{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
	wait.until(ExpectedConditions.elementToBeClickable(By.id("subjectsInput"))).sendKeys("m");
	WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".subjects-auto-complete__menu")));
	ele.getAttribute("outerHTML");
	ele.findElement(By.xpath("//div[text()='Maths']")).click();
	
}

@Then("Enter the {string} in First Name in Practice form.")
public void enter_the_in_first_name_in_practice_form(String val) {
    driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(val);
}
@Then("Enter the {string} in Last Name in Practice form.")
public void enter_the_in_last_name_in_practice_form(String val) {
	driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(val);
}
@Then("Enter the {string} in Email in Practice form.")
public void enter_the_in_email_in_practice_form(String val) {
	driver.findElement(By.xpath("//input[@placeholder='name@example.com']")).sendKeys(val);
}
@Then("Choose the Gender from  Practice form")
public void choose_the_gender_from_practice_form() 
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,400)");
	WebElement element = driver.findElement(By.xpath("//input[@id='gender-radio-1']"));
	Actions actions = new Actions(driver);
	actions.moveToElement(element).click().build().perform();
}
@Then("Choose the Hobbies from Practice form")
public void choose_the_hobbies_from_practice_form() 
{
    driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']")).click();
    driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']")).click();
}

@Then("Select the photo to upload")
public void select_the_photo_to_upload() {
	WebElement upload_file = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
	upload_file.sendKeys("C:\\Users\\Charu.garg\\Downloads\\IMG-20220814-WA0006.jpg");
}

@Then("Enter the {string} for address")
public void enter_the_for_address(String val) 
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,700)");
	driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys(val);
}

@Then("Select the State from Dropdown")
public void select_the_state_from_dropdown() {
    Select select=new Select(driver.findElement(By.id("state")));
    select.selectByVisibleText("NCR");
}

@Then("Select the City from Dropdown")
public void select_the_city_from_dropdown() {
	Select select=new Select(driver.findElement(By.id("city")));
    select.selectByVisibleText("Gurgaon");
}

@Then("Click on Submit button")
public void click_on_submit_button() {
    driver.findElement(By.xpath("//button[@id='submit']")).click();
}



}
