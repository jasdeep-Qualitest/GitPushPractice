package com.herokuapp.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	@Test()
	public void loginTest() {
//		Create driver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jasdeep.singh\\TestngPracticeWorkSpace\\selenium-for-beginners\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		sleep(3000);


//		open test page
		driver.get("https://the-internet.herokuapp.com/login");
		sleep(3000);
//		enter username
	    driver.findElement(By.xpath("//input[@name='username']")).isDisplayed();
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tomsmith");
//		enter password
	    
	    driver.findElement(By.xpath("//input[@name='password']")).isDisplayed();
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("SuperSecretPassword!"); 
//		click login button
	    driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    sleep(3000);
//		verifications:
//		 new url
//		 logout button is visible
	    
//		 successful login message
	    WebElement loginElement=driver.findElement(By.xpath("//div[@id='flash-messages']//div"));
	    System.out.println(loginElement.equals("You logged into a secure area"));
	    Assert.assertTrue(loginElement.getText().contains("You logged into a secure area"));
	    System.out.println(" user logged in to secure area successfully ");

	    Assert.assertEquals(loginElement.getText(),"You logged into a secure area","Assertion Failed equals");
	    System.out.println(" user logged in to secure area successfully ");

	    Assert.assertEquals(loginElement.getText(),"You logged into a secure area","Assertion Failed equals");

	    System.out.println(" Assert.assertEquals passed");
         driver.quit();
	}

	private void sleep(long m) {
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}