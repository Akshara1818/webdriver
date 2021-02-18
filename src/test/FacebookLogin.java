package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "/home/aksharaappannat/Downloads/chromedriver");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
			
			//WebElement lnkLogin = driver.findElement(By.xpath("//a[@class='login']"));
			
			//lnkLogin.click();
			
			//WebElement Username = driver.findElement(By.xpath("//input[@name='user_login']"));
			
			//Username.sendKeys("abc@xyz.com");
			
			WebElement CreateAcc = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a"));
			
			CreateAcc.click();
			
			WebElement FirstName = driver.findElement(By.xpath("//input[@name='firstname']"));
			
			FirstName.sendKeys("abc");
			
			WebElement LastName = driver.findElement(By.xpath("//input[@name='lastname']"));
			
			LastName.sendKeys("xyz");
			
			WebElement MobNum = driver.findElement(By.xpath("//input[@name='reg_email__']"));
			
			MobNum.sendKeys("9999999");
			
			WebElement pwd = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
			
			pwd.sendKeys("abc");
			
			WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
			
			Select ddmonth = new Select(month);
			
			ddmonth.selectByVisibleText("Feb");
			
			WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
			
			Select Day = new Select(day);
			
			Day.selectByVisibleText("18");
			
			WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
			
			Select Year = new Select(year);
			
			Year.selectByVisibleText("1998");
			
			WebElement Gender = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[1]/label"));
			
			Gender.click();
			
			WebElement SignUp = driver.findElement(By.xpath("//button[@name='websubmit']"));
			
			SignUp.click();
			

	}

}
