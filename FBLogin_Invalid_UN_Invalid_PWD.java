package test_Cases.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class FBLogin_Invalid_UN_Invalid_PWD {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("facebook login");
		
		Robot R = new Robot();
		R.keyPress(KeyEvent.VK_ENTER);
		R.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//h3[contains(text(),'Facebook - log in or sign up')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("email")).sendKeys("hashjik@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("hi");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File SRC = ts.getScreenshotAs(OutputType.FILE);
		File DES = new File("C:\\Users\\inbaraj\\eclipse-workspace\\Selenium_Demo\\src\\test_Cases\\com\\FBlogin_Both_Invalid.png");
		FileUtils.copyFile(SRC, DES);
	}
}
