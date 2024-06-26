package Pom_CLASS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dominos_pom {

	public static WebDriver driver;
	@FindBy(xpath = "//button[normalize-space()='ORDER ONLINE NOW']")
		private WebElement clickorderonline;


	@FindBy(xpath = "//input[@placeholder='Enter your delivery address']")
	private WebElement enterdeliveryaddress;

	@FindBy(xpath = "(//input[@placeholder='Enter Area / Locality'])[1]")
	private WebElement enterarea;
	
	@FindBy(xpath = "(//li[@data-label='location_[object Object]'])[1]")
	private WebElement locate;
	
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div[1]/div[2]/div[2]/div[1]/div[4]/span")
	private WebElement vegpizza;
	
	@FindBy(xpath = "//*[@id=\"mn-lft\"]/div[4]/div/div[8]/div/div/div[2]/div[3]/div/button/span")
	
	private WebElement chickenpizza;
	
	public WebElement getChickenpizza() {
		return chickenpizza;
	}


	@FindBy(xpath = "//*[@id=\"mn-lft\"]/div[6]/div/div[2]/div/div/div[2]/div[3]/div/button")
	private WebElement margherita;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div/div/div/div[2]/div/div/div[2]/div")
	private WebElement margherita2;
	
	@FindBy(xpath = "//*[@id=\"mn-lft\"]/div[6]/div/div[5]/div/div/div[2]/div[3]/div/button/span")
	private WebElement peppypanner;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div/div/div[2]/div/div/div[2]/div")
	private WebElement peppypanner2;
	
	
	@FindBy(xpath = "//*[@id=\"mn-lft\"]/div[6]/div/div[13]/div/div/div[2]/div[3]/div/button")
	private WebElement pannernchess;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[3]/div/div/div[2]/div/div/div[2]/div")
	private WebElement pannernchess2;
	
	@FindBy(xpath = "(//span[normalize-space()='BEVERAGES'])[1]")
	private WebElement beverages;
	
	@FindBy(xpath = "//div[@data-label='Pepsi 475ml']//span[contains(text(),'ADD TO CART')]")
	private WebElement pepsi;
	
	
	@FindBy(xpath = "//*[@id=\\\"mn-lft\\\"]/div[12]/div/div[1]/div/div/div[2]/div[2]/div/div[2]/div")
	private WebElement pepsiqty;
	
	@FindBy(xpath = "//*[@id=\"mn-lft\"]/div[12]/div/div[1]/div/div/div[2]/div[2]/div/div[1]")
	private WebElement pepsiremove;
	
	@FindBy(xpath = "(//div[@data-label='decrease'])[7]")
	private WebElement decreasepeppypanner;
	

	@FindBy(xpath = "//*[@id=\"mn-lft\"]/div[4]/div/div[3]/div/div/div[2]/div[3]/div/button/span")
	private WebElement QuattroFormaggiGourmetPizza;


	


	public WebElement getQuattroFormaggiGourmetPizza() {
		return QuattroFormaggiGourmetPizza;
	}






	public WebElement getClickorderonline() {
		return clickorderonline;
	}



	public WebElement getEnterdeliveryaddress() {
		return enterdeliveryaddress;
	}



	public WebElement getEnterarea() {
		return enterarea;
	}



	public WebElement getLocate() {
		return locate;
	}



	



	public WebElement getVegpizza() {
		return vegpizza;
	}



	public WebElement getMargherita() {
		return margherita;
	}



	public WebElement getMargherita2() {
		return margherita2;
	}



	public WebElement getPeppypanner() {
		return peppypanner;
	}



	public WebElement getPeppypanner2() {
		return peppypanner2;
	}



	public WebElement getPannernchess() {
		return pannernchess;
	}



	public WebElement getPannernchess2() {
		return pannernchess2;
	}



	public WebElement getBeverages() {
		return beverages;
	}



	public WebElement getPepsi() {
		return pepsi;
	}



	public WebElement getPepsiqty() {
		return pepsiqty;
	}



	public WebElement getPepsiremove() {
		return pepsiremove;
	}



	public WebElement getDecreasepeppypanner() {
		return decreasepeppypanner;
	}





	public dominos_pom (WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}	
}
