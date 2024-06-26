package Step_Difinition;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base_class.dominos_base;
import Pom_CLASS.dominos_pom;
import Runner_class.dominos_runner;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class dominos_step_difinition extends dominos_base  {
WebDriver driver=  dominos_runner.driver;
	dominos_pom pm=new dominos_pom(driver);
	
	
@Given("Launch the URL and maximize")
public void launch_the_url_and_maximize() {
	url(driver, "https://www.dominos.co.in/");
	maximize(driver);
	
   
}
@When("Click order online button")
public void click_order_online_button() {
 
toClick(pm.getClickorderonline());	
	
	
}
@SuppressWarnings("deprecation")
@Then("Locate the delivery address")
public void locate_the_delivery_address() throws InterruptedException {
  
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	toClick(pm.getEnterdeliveryaddress());
	WebElement Notallow = driver.findElement(By.xpath("(//button[normalize-space()='Allow'])[1]"));
	Notallow.click();
	tosendvalues(pm.getEnterarea(), "600112");
	Thread.sleep(3000);
	toClick(pm.getLocate());
}
@Then("select vegpizza and add require quantity")
public void select_vegpizza_and_add_require_quantity() throws InterruptedException {
	
	Thread.sleep(3000);
   toClick(pm.getVegpizza());

   Thread.sleep(3000);
   
  toScroll(driver, pm.getChickenpizza());
	
   toClick(pm.getMargherita());
   WebElement NotAllow = driver.findElement(By.xpath("//*[@id=\"mn-lft\"]/div[6]/div/div[1]/div/div/div[2]/div[3]/div[1]/button/span"));
	NotAllow.click();
   for(int i=0;i<=1;i++){
	   toClick(pm.getMargherita2());
   }
   
   toClick(pm.getPeppypanner());
  for(int i=0;i<=1;i++) {
	   toClick(pm.getPeppypanner2());
   }
    Thread.sleep(3000);
   toClick(pm.getPannernchess());
	//   for(int i=0;i<=1;i++) {
	//	   toClick(pm.getPannernchess2());
		   
  // }  
	   
}
@SuppressWarnings("deprecation")
@And("select beverages and add require quantity")
public void select_beverages_and_add_require_quantity() throws InterruptedException {
	 //Thread.sleep(10000);
//	JClick(pm.getBeverages()); 
    toClick(pm.getBeverages());
    Thread.sleep(3000);
    toClick(pm.getPepsi());
   
   /* driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	for (int j = 0; j < 6; j++) {

		Thread.sleep(1000);
		toClick(pm.getPepsiqty());
	}  	*/
    
	
	
}
@Then("Remove quantity")
public void remove_quantity() throws InterruptedException {
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	driver.manage().deleteAllCookies();


	
		Thread.sleep(3000);

	
	
		toClick(pm.getPepsiremove());
	
    
}
@Then("click checkout")
public void click_checkout() {

driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/button")).click();
	
	driver.close();
}


}
