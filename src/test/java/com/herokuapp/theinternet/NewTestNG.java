package com.herokuapp.theinternet;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NewTestNG {

  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before  first class");
  }
  WebDriver driver ;
	@Test(priority = 1)
	public void f() throws InterruptedException {
	  
	    String baseUrl = "https://www.toolsqa.com/";
	    
	      
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\jasdeep.singh\\Downloads\\chromedriver_win32\\chromedriver.exe");
	        System.out.println("Launching Google Chrome browser"); 
	        driver = new ChromeDriver();
	       
	        driver.get(baseUrl);
	        String testTitle = "Just a moment...";
	        Thread.sleep(5000);
	        String originalTitle = driver.getTitle();
	        Assert.assertEquals(originalTitle, testTitle);
	        String expectedURL=driver.getCurrentUrl();
	        Assert.assertEquals(baseUrl,expectedURL,expectedURL);
	        logMessage(expectedURL);
	        
}
  private void logMessage(String expectedURL) {
		// TODO Auto-generated method stub\
	  System.out.println(expectedURL);
		
	}
@AfterMethod
  public void afterMethod() {
	  driver.close();
	  System.out.println("after first class");
  }

}
