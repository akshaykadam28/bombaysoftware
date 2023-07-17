package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {
	public static void main(String[]args) throws InterruptedException {
		   //WebDriverManager.edgedriver().setup();
		   //WebDriver driver = new EdgeDriver();
		
		
		   WebDriverManager.chromedriver().setup();
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://amazon.in");
		   Thread.sleep(2000);
		   
		   //search
		   driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Wrist Watches");
		   driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		   
		   //select analog
		   driver.findElement(By.xpath("//li[@id='p_n_feature_seven_browse-bin/1480900031']//i[@class='a-icon a-icon-checkbox']")).click();
		   
		   //select band
		   driver.findElement(By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()='Leather']")).click();
		   
		   
		   //select brand
		   driver.findElement(By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()='Titan']")).click();
		   Thread.sleep(2000);
		   //select discount
		   driver.findElement(By.xpath("//span[contains(text(),'25% Off or more')]")).click();
		   
		   Thread.sleep(2000);
		   //select 5th search
		   driver.findElement(By.xpath("(//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'])[5]")).click();
		   
		   
				   
	}

}
