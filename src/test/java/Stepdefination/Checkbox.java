package Stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Checkbox extends BaseClass 
{

	@Given("Launch Chrome Browser")
	public void launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Charu.garg\\Downloads\\chromedriver_win32 (1)\\chromedriver_updated.exe");
		 driver= new ChromeDriver();
	}
	@Then("Navigate to the link")
	public void navigate_to_the_link() 
	{
		driver.get("https://demoqa.com/checkbox");
		driver.manage().window().maximize();
	}
		
	@Then("Expand the nodes by click on + button")
	public void expand_the_nodes_by_click_on_button() throws InterruptedException 
	{
		driver.findElement(By.xpath("//button[@class='rct-option rct-option-expand-all']")).click();
		Thread.sleep(5000);
	}

	@Then("Click the Notes checkbox")
	public void click_the_notes_checkbox() throws InterruptedException 
	{
        driver.findElement(By.xpath("(//span[@class=\"rct-checkbox\"])[3]")).click();
        Thread.sleep(50000);
	}
	
	@Then("Click the {string} checkbox")
	public void click_the_checkbox(String Notes) {
		driver.findElement(By.xpath("(//span[@class=\"rct-checkbox\"])[3]")).click();
	}

	@Then("Verify the success text.")
	public void verify_the_success_text() 
	{
	    WebElement ele=driver.findElement(By.xpath("//span[@class='text-success']"));
	    Assert.assertEquals(ele.getText(),"notes");
	    System.out.println(ele.getText());
	}
	@Then("Collapse the node by click on - button")
	public void collapse_the_node_by_click_on_button() 
	{
	    driver.findElement(By.xpath("//button[@class='rct-option rct-option-collapse-all']")).click();
	}

	@Then("Close the browser")
	public void close_the_browser() 
	{
	    driver.close();
	}



}
