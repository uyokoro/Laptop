package PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LaptopPageObjects {
	
	WebDriver driver;
	
	@FindBy (id = "sp-cc-accept")
	public WebElement AcceptButton;
	
	@FindBy (id = "twotabsearchtextbox")
	public WebElement SearchforItem;
	
	@FindBy (id = "nav-search-submit-button")
	public WebElement ClickOnSearchButton;
	
	@FindBy (xpath = "(//img[@class='s-image'])[2]")
	public WebElement ClickOnSecondItem;
	
	@FindBy (id = "add-to-cart-button")
	public WebElement AddItemToCart;
	
	@FindBy (xpath = "//input[@aria-labelledby='attachSiNoCoverage-announce']")
	public WebElement NoThankYouButton;
	
	@FindBy (xpath = "//a[@href='/cart?ref_=sw_gtc']")
	public WebElement ClickOnCart;
	
	@FindBy (xpath = "(//span[text()='*'])[2]")
	public WebElement ProductPageTotal;
	
	@FindBy (xpath = "(//span[text()='*'])[1]")
	public WebElement ProductPageSubTotal;
	
	public LaptopPageObjects (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void AcceptButton () {
		
		AcceptButton.click();
	}
	
	public void SearchforItem (String item) {
		
		SearchforItem.sendKeys(item);
	}
	
	public void ClickOnSearchButton () {
		
		ClickOnSearchButton.click();
	}
	
	public void ClickOnSecondItem () {
		
		ClickOnSecondItem.click();
	}
	
	public void AddItemToCart () {
		
		AddItemToCart.click();
	}
	
	public void NoThankYouButton () {
		
		NoThankYouButton.click();
	}
	
	public void ClickOnCart () {
		
		ClickOnCart.sendKeys(Keys.ENTER);
	}
	
	public void ProductPageTotal () {
		
		ProductPageTotal.getText();
	}
	
	public void ProductPageSubTotal () {
		
		ProductPageSubTotal.getText();
	}
	
}