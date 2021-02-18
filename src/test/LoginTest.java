package test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/aksharaappannat/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.simplilearn.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
		
		WebElement lnkLogin = driver.findElement(By.linkText("Log in"));
		
		lnkLogin.click();
		
		WebElement editUsername = driver.findElement(By.name("user_login"));
		
		editUsername.sendKeys("abc@xyz.com");
		
		WebElement editPwd = driver.findElement(By.name("user_pwd"));
		
		editPwd.sendKeys("124");
		
		WebElement chkBox = driver.findElement(By.className("rememberMe"));
		
		chkBox.click();
		
		WebElement btnPwd = driver.findElement(By.name("btn login"));
		
		btnPwd.click();
		
		
		driver.quit();
		

	}

}
