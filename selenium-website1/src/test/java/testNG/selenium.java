package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class selenium{
	FirefoxDriver driver;	
  
  @BeforeTest
  public void launch(){
		System.setProperty("webdriver.gecko.driver", "/home/bala/eclipse-workspace/url-test/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:3001");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
  
  @Test
  public void verifyLogin() {
	
	  
	  driver.manage().window().maximize();
	  driver.findElement(By.name("login")).sendKeys("edureka");
	  driver.findElement(By.name("password")).sendKeys("edureka");
	  driver.findElement(By.name("click")).click();
  }

  
  @AfterTest
  public void logout() {
	  driver.close();
  }
  
}
