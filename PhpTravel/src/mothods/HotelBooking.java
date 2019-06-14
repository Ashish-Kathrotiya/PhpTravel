package mothods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import locators.BaseClass;

public class HotelBooking extends BaseClass {
	
	public void CheckinToday()
	
	{
		WebElement element = driver.findElement(By.className("datepicker-days"));
		 
	        //This are the rows of the from date picker table
	        //List<WebElement> rows = dateWidgetFrom.findElements(By.tagName("tr"));
	 
	        //This are the columns of the from date picker table
	        List<WebElement> columns = driver.findElements(By.tagName("td"));
	 
	        //DatePicker is a table. Thus we can navigate to each cell
	        //and if a cell matches with the current date then we will click it.
	        for (WebElement cell: columns) {
	            
	            //If you want to click 18th Date
	            if (cell.getText().equals("6")) {
	           
	            //Select Today's Date
	           /* if (cell.getText().equals("day active")) {
	                cell.click();
	                break;
	                */
	            }
	        }
	 
	}
			

}
