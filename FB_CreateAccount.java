package test_Cases.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FB_CreateAccount {

	public static void main(String[] args) throws AWTException, InterruptedException {

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
		
		driver.findElement(By.xpath("//a[@rel='async']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Vasanthi");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("SI");
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("6369920818");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("harish12345");
		
		WebElement birth_day = driver.findElement(By.name("birthday_day"));
		Select BD = new Select(birth_day);
		BD.selectByVisibleText("13");
		Thread.sleep(1000);
		
		WebElement birth_month = driver.findElement(By.name("birthday_month"));
		Select BM = new Select(birth_month);
		BM.selectByVisibleText("Nov");
		Thread.sleep(1000);
		
		WebElement birth_year = driver.findElement(By.name("birthday_year"));
		Select BY = new Select(birth_year);
		BY.selectByVisibleText("1988");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(3000);
		
		
		Actions act = new Actions(driver);
		WebElement mouseact = driver.findElement(By.xpath("//a[text()='Yes, Find My Account']"));
		act.click(mouseact).build().perform();
		
		//incomplete
		
		
//		WebElement clickwebelement = driver.findElement(By.xpath("//a[.='Become a Seller']"));
//		act.click(clickwebelement).build().perform();
		
//		Robot R1 = new Robot();
//		R1.keyPress(KeyEvent.VK_ENTER);
//		R1.keyRelease(KeyEvent.VK_ENTER);
		
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
		
//		driver.findElement(By.xpath("(//a[text()='No, Create New Account'])[1]")).click();
	}
}