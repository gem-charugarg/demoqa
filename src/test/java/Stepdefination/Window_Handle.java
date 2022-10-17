package Stepdefination;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Then;

public class Window_Handle extends BaseClass   
{

@Then("Launch the Chrome")
public void launch_the_chrome() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Charu.garg\\Downloads\\chromedriver_win32 (1)\\chromedriver_updated.exe");
	 driver= new ChromeDriver();
}

@Then("Navigate to WindowHandling link")
public void navigate_to_window_handling_link() {
	driver.get("https://demoqa.com/browser-windows");
	driver.manage().window().maximize();
}

@Then("Handling New Tab")
public void handling_new_tab() {
    driver.findElement(By.id("tabButton")).click();
    String mainWindow=driver.getWindowHandle();
    Set<String> allWindows=driver.getWindowHandles();
    Iterator<String> iterator=allWindows.iterator();
    while(iterator.hasNext())
    {
    	String ChildWindow=iterator.next();
    	if(!mainWindow.equalsIgnoreCase(ChildWindow))
    	{
    		driver.switchTo().window(ChildWindow);
    		WebElement text = driver.findElement(By.id("sampleHeading"));
            System.out.println("Heading of child window is " + text.getText());
    	}
    }
}

@Then("Handling New Window")
public void handling_new_window() {
    driver.findElement(By.id("windowButton")).click();
    String mainWindow=driver.getWindowHandle();
    Set<String> allWindows=driver.getWindowHandles();
    Iterator<String> itr=allWindows.iterator();
    while(itr.hasNext())
    {
    	String ChildWindow=itr.next();
    	if(!ChildWindow.equalsIgnoreCase(ChildWindow))
    	{
    		driver.switchTo().window(ChildWindow);
    		WebElement text=driver.findElement(By.id("sampleHeading"));
    		System.out.println(text);
    	}
    }
}

@Then("Handling New Window Message")
public void handling_new_window_message() 
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,400)");
	driver.findElement(By.id("messageWindowButton")).click();
	String mainWindow=driver.getWindowHandle();
    Set<String> allWindows=driver.getWindowHandles();
    Iterator<String> itr=allWindows.iterator();
    while(itr.hasNext())
    {
    	String ChildWindow=itr.next();
    	if(!ChildWindow.equalsIgnoreCase(ChildWindow))
    	{
    		driver.switchTo().window(ChildWindow);
    		driver.close();
            System.out.println("Child window closed");
    	}
    }
}

}
