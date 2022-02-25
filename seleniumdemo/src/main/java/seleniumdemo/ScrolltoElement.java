package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrolltoElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");//to launch the chrome browser
        WebDriver  driver=new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/scroll");
        
        WebElement name=driver.findElement(By.id("name"));
        Actions actions=new Actions(driver);
        actions.moveToElement(name);
        name.sendKeys("vaish");
        
        
        driver.quit();
        

	}

}
