package Stepdefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class RadioButton extends BaseClass 
{

	@Given("Launch the Chrome Browser")
	public void launch_the_chrome_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Charu.garg\\Downloads\\chromedriver_win32 (1)\\chromedriver_updated.exe");
		 driver= new ChromeDriver();
	}
	
	@Then("Navigate to RadioButton link")
	public void navigate_to_radio_button_link() {
		driver.get("https://demoqa.com/radio-button");
		driver.manage().window().maximize();
	}
	
	@Then("Click on the Radio button")
	public void click_on_the_radio_button() 
	{
		WebElement element = driver.findElement(By.xpath("//input[@id='yesRadio']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='yesRadio']"))).click();
	    //driver.findElement(By.xpath("//input[@id='yesRadio']")).click();
	}
	@Then("Verify the Success message")
	public void verify_the_success_message() 
	{
	    String val=driver.findElement(By.xpath("//span[@class='text-success']")).getText();
	    if(val.equalsIgnoreCase("Yes"));
	}

	@Then("Click on the No Radio button")
	public void click_on_the_no_radio_button() 
	{
		try {
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='noRadio']")).isEnabled(), "OK button is disabled.");
		}
		catch(Exception e)
		{
			System.out.println("Radio Button is Enabled");
		}
	}



}
