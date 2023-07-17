package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignment1 {
	public static void main(String[]args) throws InterruptedException {
		   //WebDriverManager.edgedriver().setup();
		   //WebDriver driver = new EdgeDriver();
		
		
		   WebDriverManager.chromedriver().setup();
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://mail.google.com/mail/u/0/?pli=1#inbox");
		   Thread.sleep(2000);
		   
		   //enter mailid
		   driver.findElement(By.xpath("//input[@type='email']")).sendKeys("atrangi.awara123321@gmail.com");
		   driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		   Thread.sleep(1000);
		   //enter password
		   WebElement wait = new WebDriverWait(driver, Duration.ofSeconds(10))
			        .until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='password']")));
		   driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Awara@123");
		   
	  	   driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	  	   Thread.sleep(2000);
	  	   //compose mail
	  	   driver.findElement(By.xpath("//div[@class='T-I T-I-KE L3']")).click();
	  	    Thread.sleep(5000);
	  	    
	  	 // WebElement wait1 = new WebDriverWait(driver, Duration.ofSeconds(10))
			       // .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='wO nr l1']")));
	      driver.findElement(By.xpath("//*[@id=\":zu\"]")).sendKeys("atrangi.awara123321@gmail.com");
	  
	  	  	   
	  	    
	  	   //write subject
	  	   driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Test Mail");
	  	   Thread.sleep(2000);
	       //write body	
	  	   driver.findElement(By.xpath("//div[@class='Ar Au']//div")).sendKeys("Test Email Body");
	  	   //click on 3 dot
	  	   driver.findElement(By.xpath("(//div[@class='J-J5-Ji J-JN-M-I-JG'])[5]")).click();
	  	   //click on lable
	  	   driver.findElement(By.xpath("(//div[@class='J-N-Jz'])[9]")).click();
	  	   //click on social
	  	   driver.findElement(By.xpath("//div[@class='J-LC-Jz'][normalize-space()='Social']")).click();
	  	   Thread.sleep(2000);
	  	  
	  	   
		   driver.findElement(By.xpath("//div[text()='Send']")).click();
	  	   
		   
		   Thread.sleep(10000);
		   
		// Open the received email
	        driver.findElement(By.xpath("//span[text()='Test Mail']")).click();

}
}