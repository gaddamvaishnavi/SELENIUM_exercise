package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseSelenium {
	
	public static void main(String[] args) {
	    
          System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");//to launch the chrome browser
          WebDriver  driver=new ChromeDriver();
          driver.get("https://formy-project.herokuapp.com/keypress");
          WebElement name=driver.findElement(By.id("name"));
          name.click();
          name.sendKeys("vaishnavi");
          
          WebElement button=driver.findElement(By.id("button"));
          button.click();
          
          
          driver.quit();
          
        
          
       
        
        
          
          
          
          
          
}
}