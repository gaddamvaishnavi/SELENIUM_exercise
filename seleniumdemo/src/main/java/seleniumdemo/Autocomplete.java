package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete {

	public static void main(String[] args) throws InterruptedException {
	  
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");//to launch the chrome browser
        WebDriver  driver=new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/autocomplete");
		
		 WebElement auto=driver.findElement(By.id("autocomplete"));
	        auto.sendKeys("1-2-3-4 vijayawada");
	        Thread.sleep(1000);
	        
	        WebElement autoresult=driver.findElement(By.className("pac-item"));
	        autoresult.click();
	        
	        driver.quit();
	        

	}

}
