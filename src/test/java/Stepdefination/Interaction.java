package Stepdefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Interaction extends BaseClass 
{
	
	
	@Given("Launching the Chrome.")
	public void launching_the_chrome() {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\Charu.garg\\Downloads\\chromedriver_win32 (1)\\chromedriver_updated.exe");
		 driver= new ChromeDriver();
	}

	@Given("Naviagate to Resizable page")
	public void naviagate_to_resizable_page() {
		driver.get("https://demoqa.com/resizable");
		driver.manage().window().maximize();
	}
	
	@Then("Resize the box")
	public void resize_the_box() throws InterruptedException 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
	  // driver.switchTo().frame(0);
	   Thread.sleep(2000);
	   WebElement ele=driver.findElement(By.xpath("(//span[@class='react-resizable-handle react-resizable-handle-se'])[2]"));
	   Actions action =new Actions(driver);
	   
	 new Actions(driver).dragAndDropBy(ele,200,200).build().perform();
	 //action.clickAndHold(ele).moveByOffset(300,300);   
	 System.out.println("Resizing of element Completed");
	}

	
	@Given("Naviagate to Draggable page")
	public void naviagate_to_draggable_page() {
		driver.get("https://demoqa.com/dragabble");
		driver.manage().window().maximize();
	}
	@Then("Perform Drag")
	public void perform_drag() 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)");
		WebElement el=driver.findElement(By.id("dragBox"));
	    Actions action=new Actions(driver);
	    int xOffset = el.getLocation().getX();
		
		int yOffset =  el.getLocation().getY();
		System.out.println("xOffset--->"+xOffset+" yOffset--->"+yOffset);
		
		//Find the xOffset and yOffset difference to find x and y offset needed in which from object required to dragged and dropped
		xOffset =xOffset+10;
		yOffset=yOffset+10;
	    action.dragAndDropBy(el, 400, 400).perform();
	}
	
	@Then("Perform Axis Restricted Drag")
	public void perform_axis_restricted_drag() {
	    driver.findElement(By.id("draggableExample-tab-axisRestriction")).click();
	    WebElement ele=driver.findElement(By.id("restrictedX"));
	    Actions action=new Actions(driver);
	    int xOffset = ele.getLocation().getX();
		int yOffset =  ele.getLocation().getY();
		System.out.println("xOffset--->"+xOffset+" yOffset--->"+yOffset);
		xOffset =xOffset+5;
		action.dragAndDropBy(ele, xOffset,0);
	}

	@Given("Naviagate to dragDrop  page")
	public void naviagate_to_drag_drop_page() {
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
	}
	@Then("Explore dragDrop")
	public void explore_drag_drop() 
	{
		Actions action=new Actions(driver);
	   WebElement source= driver.findElement(By.id("draggable"));
	   WebElement target= driver.findElement(By.id("droppable"));
	   action.dragAndDrop(source, target).build().perform();
	}

	@Then("Perform Container Restricted Drag")
	public void perform_container_restricted_drag() {
		driver.findElement(By.id("draggableExample-tab-containerRestriction")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		WebElement ele=driver.findElement(By.xpath("//div[@class='draggable ui-widget-content ui-draggable ui-draggable-handle']"));
		Actions action=new Actions(driver);
	    int xOffset = ele.getLocation().getX();
		int yOffset =  ele.getLocation().getY();
		System.out.println("xOffset--->"+xOffset+" yOffset--->"+yOffset);
		//xOffset=xOffset+1;
		//yOffset=yOffset+1;
		action.dragAndDropBy(ele, xOffset,yOffset).perform();
		
	}

}
