package Stepdefination;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.*;
import io.cucumber.java.en.Then;

public class Alert extends BaseClass  
{
	String val;

@Then("Launch the Browser")
public void launch_the_browser() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Charu.garg\\Downloads\\chromedriver_win32 (1)\\chromedriver_updated.exe");
	 driver= new ChromeDriver();
}

@Then("Navigate to Alert link")
public void navigate_to_alert_link() {
	driver.get("https://demoqa.com/alerts");
	driver.manage().window().maximize();
}

@Then("Click on Alert button")
public void click_on_alert_button() 
{
    WebElement ele=driver.findElement(By.xpath("//button[@id='alertButton']"));
    ele.click();
}

@Then("Click on ok")
public void click_on_ok() 
{
    driver.switchTo().alert().accept();  
}

@Then("Click on waiting Alert button and accept it.")
public void click_on_waiting_alert_button_and_accept_it() 
{
	try
	{
    WebElement ele=driver.findElement(By.id("timerAlertButton"));
    ele.click();
    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
    wait.until(ExpectedConditions.alertIsPresent());
    driver.switchTo().alert().accept();
	}
	catch (Exception e) {
        System.out.println("unexpected alert not present");
    } 
}

@Then("Click On button, confirm box will appear")
public void click_on_button_confirm_box_will_appear() 
{
	WebElement element = driver.findElement(By.id("confirmButton"));
	  ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
	  driver.switchTo().alert();
	  val=driver.switchTo().alert().getText();
	  System.out.print(val);
	  driver.switchTo().alert().accept();
}


@Then("On button click, prompt box will appear")
public void on_button_click_prompt_box_will_appear() 
{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		WebElement element = driver.findElement(By.id("promtButton"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
	   driver.switchTo().alert();
	   val=driver.switchTo().alert().getText();
	   System.out.print(val);
	   driver.switchTo().alert().sendKeys("In QA");
	   driver.switchTo().alert().accept();
	   
}
@Then("Verify Success message when confirm box will appear.")
public void verify_success_message_when_confirm_box_will_appear() {
	WebElement element = driver.findElement(By.id("confirmButton"));
	  ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
	  driver.switchTo().alert();
	  val=driver.switchTo().alert().getText();
	  System.out.print(val);
	  driver.switchTo().alert().accept();
	  WebElement ele=driver.findElement(By.xpath("//span[@class='text-success']"));
	   if(ele.getText().equalsIgnoreCase("You selected Ok"))
		   System.out.print("Success message");
}

@Then("Verify Success message when prompt box will appear.")
public void verify_success_message_when_prompt_box_will_appear() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,400)");
		WebElement element = driver.findElement(By.id("promtButton"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
	   driver.switchTo().alert();
	   val=driver.switchTo().alert().getText();
	   System.out.print(val);
	   driver.switchTo().alert().sendKeys("In QA");
	   driver.switchTo().alert().accept();
	   WebElement ele=driver.findElement(By.xpath("//span[@class='text-success']"));
	   if(ele.getText().equalsIgnoreCase("You entered In QA"))
		   System.out.print("Success message");
	   
}

}
