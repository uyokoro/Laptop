package TestNGTestCases;

import org.testng.annotations.Test;
import PageObject.LaptopPageObjects;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeTest;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class LaptopTestNG {
	static WebDriver driver;
	
	static LaptopPageObjects amazonPageObjects;

  @Test
  public void f() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		amazonPageObjects = new  LaptopPageObjects (driver);
		amazonPageObjects.AcceptButton();
		amazonPageObjects.SearchforItem.sendKeys("Laptop");
		amazonPageObjects.ClickOnSearchButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		amazonPageObjects.ClickOnSecondItem();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		amazonPageObjects.AddItemToCart();
		amazonPageObjects.NoThankYouButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		amazonPageObjects.ClickOnCart();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver ();
		driver.get("https://www.amazon.co.uk/");
		driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.quit();
  }

}
