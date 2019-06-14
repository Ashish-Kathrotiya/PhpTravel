package testScripts;

import java.util.List;

import locators.BaseClass;
import locators.LocatorForHotelBooking;
import mothods.CommonMethod;
import mothods.HotelBooking;

import org.apache.xerces.impl.dtd.models.CMAny;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class HotelBook extends BaseClass {
	
	LocatorForHotelBooking hotel = new LocatorForHotelBooking();
	CommonMethod Cmethod = new CommonMethod();
	HotelBooking HBook = new HotelBooking();
	
	WebElement element;
	String result,myresult = "babu ka restaurant";
  
 @BeforeMethod
  public void beforeMethod() {
	 driver.get(hotel.URL);
	driver.manage().window().maximize();
	Cmethod.findbyxPathreturn(hotel.Hotel).click();
	 
}
	
  @Test
  public void f() throws InterruptedException 
  {
	// To enter City name
	  element = Cmethod.findbyidreturns(hotel.City);
	   Cmethod.clickusingAction(element);
	  //element.click();
	  //element.sendKeys("Ahmedabad");
	//  driver.wait(20);
	  Thread.sleep(5000);
	  // To Select City name
	  Cmethod.findbyxPathreturn(hotel.Suggestion).click();
	  
	  
	 
	// To enter checkin & checkout date
	  
	 Cmethod.findbyCssSelecotr(hotel.Checkindate).click();
	 
	 Cmethod.findbyCssSelecotr(hotel.checkingtext).sendKeys("09/04/2019");
	 
	 Cmethod.findbyCssSelecotr(hotel.Checkoutdate).sendKeys("10/04/2019");
	 
	 Cmethod.findbyidreturns(hotel.Passanger).click();
	 
	 Cmethod.findbyidreturns("adultMinusBtn").click();
	 
	 Cmethod.findbyidreturns("childPlusBtn").click();
	 
	 Cmethod.findbyxPathreturn("//*[@class = 'btn btn-lg btn-block btn-primary pfb0 loader']").click();
	  
	//result = Cmethod.findbyCssSelecotr(hotel.Search_Result).getText();
	
//	System.out.println(result);
	 
	 List<WebElement> results = driver.findElements(By.cssSelector(hotel.Search_Result));
	 
	 for (int i = 0; i < results.size(); i++) {
	        Assert.assertTrue(results.get(i).getText().contains(myresult), "Search result validation failed at instance [ + i + ].");
	        ((WebElement) driver.findElements(By.cssSelector(myresult))).click();
	    }
	 
	 
	
	 
	 Thread.sleep(5000);
	  
  }
 
  @AfterMethod
  public void afterMethod() {
	  
	  
	//  driver.close();
  }

}
