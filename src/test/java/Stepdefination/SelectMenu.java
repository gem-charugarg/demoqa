package Stepdefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SelectMenu extends BaseClass 
{
	
	@Then("Launch Chrome.")
	public void launch_chrome() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Charu.garg\\Downloads\\chromedriver_win32 (1)\\chromedriver_updated.exe");
		 driver= new ChromeDriver();
	}
	
	@Then("Naviagate to Select Menu page")
	public void naviagate_to_select_menu_page() {
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
	}

	@Given("Select Old Style Select Menu from the Dropdown")
	public void select_old_style_select_menu_from_the_dropdown() 
	{
	    Select select=new Select(driver.findElement(By.id("oldSelectMenu")));
	    List<WebElement> lst = select.getOptions();
	    System.out.println("The dropdown options are:");
        for(WebElement options: lst)
            System.out.println(options.getText());
        System.out.println("Select the Option by Index 4");
        select.selectByIndex(4);
        System.out.println("Select value is: " + select.getFirstSelectedOption().getText());

        //Step#6- Selecting the option as 'Magenta'-- selectByVisibleText
        System.out.println("Select the Option by Text Magenta");
        select.selectByVisibleText("Magenta");
        System.out.println("Select value is: " + select.getFirstSelectedOption().getText());

        //Step#7- Selecting an option by its value
        System.out.println("Select the Option by value 6");
        select.selectByValue("6");
        System.out.println("Select value is: " + select.getFirstSelectedOption().getText());

        driver.quit();
	}
	
	
	@Then("Select multi-select values")
	public void select_multi_select_values() {
	    Select select=new Select(driver.findElement(By.id("cars")));
	    List<WebElement> val=select.getOptions();
	    System.out.println("The dropdown options are:");
	    for(int i=0;i<val.size();i++)
	    	System.out.println(val.get(i).getText());
	    if(select.isMultiple()){

            //Selecting option as 'Opel'-- ByIndex
            System.out.println("Select option Opel by Index");
            select.selectByIndex(2);

            //Selecting the option as 'Saab'-- ByValue
            System.out.println("Select option saab by Value");
            select.selectByValue("saab");

            // Selecting the option by text
            System.out.println("Select option Audi by Text");
            select.selectByVisibleText("Audi");

            //Get the list of selected options
            System.out.println("The selected values in the dropdown options are -");

            List<WebElement> selectedOptions = select.getAllSelectedOptions();
            
            	
            for(WebElement selectedOption: selectedOptions)
                System.out.println(selectedOption.getText());


            // Deselect the value "Audi" by Index
            System.out.println("DeSelect option Audi by Index");
            select.deselectByIndex(3);

            //Deselect the value "Opel" by visible text
            System.out.println("Select option Opel by Text");
            select.deselectByVisibleText("Opel");

            //Validate that both the values are deselected
            System.out.println("The selected values after deselect in the dropdown options are -");
            List<WebElement> selectedOptionsAfterDeselect = select.getAllSelectedOptions();

            for(WebElement selectedOptionAfterDeselect: selectedOptionsAfterDeselect)
                System.out.println(selectedOptionAfterDeselect.getText());

            //Step#8- Deselect all values
            select.deselectAll();
        }

        driver.quit();

	}

	@Then("Select Multiselect drop down values")
	public void select_multiselect_drop_down_values() throws InterruptedException  
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
	    driver.findElement(By.xpath(("(//div[@class=' css-1wy0on6'])[3]"))).click();
	    driver.findElement(By.xpath("//div[contains(text(),'Green')]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[contains(text(),'Red')]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[contains(text(),'Blue')]")).click();
	    Thread.sleep(5000);
	    System.out.println("its done");  
	}
	

	@Then("Select a avlue")
	public void select_a_avlue() throws InterruptedException{
		driver.findElement(By.xpath(("//div[@id='selectOne']"))).click();
	    driver.findElement(By.xpath("//div[contains(text(),'Mr.')]")).click();
	    Thread.sleep(2000); 
	}






}
