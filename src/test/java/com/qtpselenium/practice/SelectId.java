package com.qtpselenium.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectId {
	
	static WebDriver driver;

	public static void main(String[] args) throws Throwable 
	{

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		// pro.getProperty("chromedriver_exe")

		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		ops.addArguments("disable-infobars");
		ops.addArguments("--start-maximized");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY,
				System.getProperty("user.dir") + "\\DriverLog\\chrome.log");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		driver = new ChromeDriver(ops);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://portfolio.rediff.com/portfolio-login");
		driver.findElement(By.id("useremail")).sendKeys("miraalmamun");
		driver.findElement(By.xpath("//*[@id='emailsubmit']")).click();
		driver.findElement(By.id("userpass")).sendKeys("Mimo949658");
		driver.findElement(By.xpath("//*[@id='loginsubmit']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//a[@id='createPortfolio']")).click();
		//driver.findElement(By.id("createPortfolio")).click();
		driver.findElement(By.xpath("//input[@id='create']")).click();
		driver.findElement(By.xpath("//input[@id='create']")).clear();
		driver.findElement(By.xpath("//input[@id='create']")).sendKeys("Prot12345");
		driver.findElement(By.xpath("//input[@id='createPortfolioButton']")).click();
		Thread.sleep(8000);
		WebElement element = driver.findElement(By.xpath("//select[@id='portfolioid']"));
		Select select = new Select(element);
		select.selectByVisibleText("Prot12345");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//a[@id='deletePortfolio']")).click();
		Thread.sleep(10000);
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		
		driver.quit();
      
	}
	
	
	
	
	

}
