package Stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Then;

public class Menu  extends BaseClass{

	
	@Then("Open Chrome.")
	public void open_chrome() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Charu.garg\\Downloads\\chromedriver_win32 (1)\\chromedriver_updated.exe");
		 driver= new ChromeDriver();
	}
	
	@Then("Naviagate to Select Menu page.")
	public void naviagate_to_select_menu_page() {
		driver.get("https://demoqa.com/menu");
		driver.manage().window().maximize();
	}
	
	@Then("Explore Menu options.")
	public void explore_menu_options() {
	    WebElement e1=driver.findElement(By.xpath("//a[contains(text(),'Main Item 1')]"));
	    WebElement e2=driver.findElement(By.xpath("//a[contains(text(),'Main Item 2')]"));
	    WebElement e3=driver.findElement(By.xpath("//a[contains(text(),'SUB SUB LIST »')]"));
	    WebElement e4=driver.findElement(By.xpath("//a[contains(text(),'Sub Sub Item 1')]"));
	    Actions action=new Actions(driver);
	    action.moveToElement(e1).moveToElement(e2).moveToElement(e3).moveToElement(e4).click().build().perform();   
	}
	
	@Then("Naviagate to Tool Tips page.")
	public void naviagate_to_tool_tips_page() {
		driver.get("https://demoqa.com/tool-tips");
		driver.manage().window().maximize();
	}
	@Then("Explore Tool Tips Page")
	public void explore_tool_tips_page() 
	{
	   Actions action=new Actions(driver); 
	   WebElement ele=driver.findElement(By.id("toolTipButton"));
	   action.moveToElement(ele).perform();
	   WebElement toolTip = driver.findElement(By.xpath("//div[@class='tooltip-inner']"));
	   String toolTipText=toolTip.getText();
	
		System.out.println("toolTipText-->"+toolTipText); 
		if(toolTipText.equalsIgnoreCase("You hovered over the Button"))
			System.out.println("Text matches");
	}
	
	@Then("Naviagate to Tabs page.")
	public void naviagate_to_tabs_page() {
		driver.get("https://demoqa.com/tabs");
		driver.manage().window().maximize();
	}

	@Then("Explore Tabs")
	public void explore_tabs() {
	    driver.findElement(By.xpath("//a[@id='demo-tab-origin']")).click();
	    driver.findElement(By.xpath("//a[@id='demo-tab-use']")).click();
	}
	
	@Then("Naviagate to Slider page.")
	public void naviagate_to_slider_page() {
		driver.get("https://demoqa.com/slider");
		driver.manage().window().maximize();
	}
	
	@Then("Explore Slider")
	public void explore_slider() {
		Actions dragger = new Actions(driver);
		WebElement draggablePartOfScrollbar = driver.findElement(By.xpath("//div[@id='sliderContainer']"));
		int numberOfPixelsToDragTheScrollbarDown = 100;
		dragger.moveToElement(draggablePartOfScrollbar).clickAndHold().moveByOffset(0,numberOfPixelsToDragTheScrollbarDown).release().perform();
	}
	
	@Then("Naviagate to DatePicker page.")
	public void naviagate_to_date_picker_page() {
		driver.get("https://demoqa.com/date-picker");
		driver.manage().window().maximize();
	}
	@Then("Explore DatePicker")
	public void explore_date_picker() 
	{
		driver.findElement(By.id("datePickerMonthYearInput")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
	    driver.findElement(By.xpath("//div[@class='react-datepicker__month-container']")).click();
	    driver.findElement(By.xpath("(//div[contains(text(),'22')])[2]")).click();
	}

}
