package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator {

	public static void main(String[] args) {
	    
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");//to launch the chrome browser
		WebDriver  driver=new ChromeDriver();
		driver.get("https://moodle.kluniversity.in/login/index.php");//launch the given URL
		driver.manage().window().maximize(); //maximize the webpage
		driver.findElement(By.className("btn-label")).click();
		//absolute Xpath
	 
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]")).sendKeys("180040662");
	    
	    //relative path
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("180");
		
		

	}

}
