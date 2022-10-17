package Stepdefination;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Then;

public class Widgets extends BaseClass  
{

@Then("Opening of Chrome Browser")
public void opening_of_chrome_browser() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Charu.garg\\Downloads\\chromedriver_win32 (1)\\chromedriver_updated.exe");
	 driver= new ChromeDriver();
}

@Then("Navigate to Accordian link")
public void navigate_to_accordian_link() {
	driver.get("https://demoqa.com/accordian");
	driver.manage().window().maximize();
}

@Then("Open the Accordian Tab")
public void open_the_accordian_tab() 
{

	List<WebElement> allinks=(List<WebElement>) driver.switchTo().frame(driver.findElement(By.cssSelector("card-header")));
			//frame(driver.findElements(By.cssSelector("card-header")));

	for(WebElement w:allinks){
	    new Actions(driver).click().build().perform();
	    try {
	        Thread.sleep(3000);
	    } catch (InterruptedException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
		}
}

@Then("Navigate to AutoComplete Page")
public void navigate_to_auto_complete_page() {
    driver.get("https://demoqa.com/auto-complete");
    driver.manage().window().maximize();
}

@Then("Fill the text1")
public void fill_the_text1() {
	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
	WebElement ele=driver.findElement(By.xpath("(//div[@class='auto-complete__control css-yk16xz-control'])[1]"));
	ele.click();
	ele.click();
	//WebDriverWait wait = new WebDriverWait(new ChromeDriver(),Duration.ofSeconds(10));
	//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[@class='auto-complete__value-container auto-complete__value-container--is-multi auto-complete__value-container--has-value css-1hwfws3])")));
	ele.sendKeys("r");
	ele.sendKeys("r");
	List<WebElement> optionsToSelect = driver.findElements(By.xpath("(//div[@class='css-12jo7m5 auto-complete__multi-value__label'])"));
	for(WebElement option : optionsToSelect){
        if(option.getText().equals("Red")) {
        	System.out.println("Red selected");
            option.click();
            break;
        }
    }
	//ele.findElement(By.xpath("//div[text()='Red']")).click();
}

}
