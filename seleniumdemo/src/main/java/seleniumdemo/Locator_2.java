package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_2 {
	

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");//to launch the chrome browser
		WebDriver  driver=new ChromeDriver();
		driver.get("https://moodle.kluniversity.in/login/index.php");
		driver.manage().window().maximize(); //maximize the webpage
	    
         
         
         //Tag & ID
         WebElement username= driver.findElement(By.cssSelector("input#username"));
          username.sendKeys("180040662");
        
        
        
        //tag and class
          //input is tag & form-control is class name
         driver.findElement(By.cssSelector("input.form-control")).sendKeys("180040662");
         
         
         //Tag and attribute
         driver.findElement(By.cssSelector("input[name=username]")).sendKeys("180040662");
         
         //Tag class and attribute
         
         driver.findElement(By.cssSelector("input.form-control[name=username")).sendKeys("john");
         
         
         
         
}
}