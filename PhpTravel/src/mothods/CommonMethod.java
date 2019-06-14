package mothods;

import locators.BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CommonMethod extends BaseClass {
	
	public void findbyid(String str)
	{
		driver.findElement(By.id(str));
	}
	
	public void findbyxPath(String str)
	{
		driver.findElement(By.xpath(str));
	}
	
	
	public WebElement findbyidreturns(String str)
	{
		WebElement element = driver.findElement(By.id(str));
		return element;
	}
	public WebElement findbyxPathreturn(String str)
	{
		WebElement element = driver.findElement(By.xpath(str));
		return element;
		
	}
	
	public WebElement findbyCssSelecotr(String str)
	{
		WebElement element = driver.findElement(By.cssSelector(str));
		
		return element;
		
	}
	
	
	public WebElement findbyclassreturns(String str)
	{
		WebElement element = driver.findElement(By.className(str));
		return element;
	}
	
	
	public void clickusingAction(WebElement str)
	
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(str);
		actions.click();
		actions.sendKeys("Ahmedabad");
		actions.build().perform();
	}
	
	
	
	
	
}
