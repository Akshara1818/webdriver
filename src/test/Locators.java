package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "/home/aksharaappannat/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
		
		WebElement lnkLogin = driver.findElement(By.xpath("//input[@id='email']"));
		
		lnkLogin.sendKeys("abc@xyz.com");
		
		WebElement pwd = driver.findElement(By.xpath("//input[@name='pass']"));
		
		pwd.sendKeys("abc");
		
		WebElement btn_login = driver.findElement(By.xpath("//button[@name='login']"));
		
		btn_login.click();

	}

}
