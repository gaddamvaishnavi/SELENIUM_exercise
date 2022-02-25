package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");//to launch the chrome browser
		WebDriver  driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize(); //maximize the webpage
		
		//locating by id
		WebElement search=driver.findElement(By.id("search_query_top")); //locating the element
		search.sendKeys("T-shirts");//sending input to the field we've searched for
		
		
		
		//locating by name
	     driver.findElement(By.name("submit_search")).click(); //locating the element 
		//btn.click();// here btn is a button so to hit btn we use click().
		
		//locating by link text
	     driver.findElement(By.linkText("Printed Chiffon Dress")).click();
	     
	     //locating by partial link text 
	     //driver.findElement(By.partialLinkText("Chiffon Dress")).click();
	     
	     //locating using class --- this is used to find multiple elements
	        //fingElements()---used to find multiple webElements
	       int sliders=driver.findElements(By.className("homeslider-container")).size();//this will find the multiple webelements with homeslider class name  
	       System.out.println(sliders);                           // size() method is used to get the number of elements with that class name.
		
		//locating using TagName
	       // example: to find the number of links used in the webpage 
	       
           int links= driver.findElements(By.tagName("a")).size();
           System.out.println(links);
           
           
            
	} 

}
