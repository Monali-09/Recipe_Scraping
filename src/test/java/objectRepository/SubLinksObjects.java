package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SubLinksObjects {
	WebDriver driver = null;
	public	SubLinksObjects(WebDriver driver){
		this.driver = driver;
	}
	//By health_in_menu = new By.ByXPath(("//a[text()='Health']"));
	By health_in_menu =new  By.ByCssSelector("a[href='RecipeCategories.aspx?focus=health']");
	By blood_pressure_in_health = new By.ByXPath("//a[text()='High Blood Pressure']");
	
	//****Monali******
	By CuisineStart = new By.ByCssSelector("a[href='RecipeCategories.aspx?focus=cuisine']");	    
    By MahaStart =new By.ByCssSelector("a[href='recipes-for-maharashtrian-52']");
    By Kids = new By.ByCssSelector("a[href='RecipeCategories.aspx?focus=kids']");
	By Rec_7_9Months  = new By.ByCssSelector("a[href='recipes-for-kids-corner-recipes-for-weaning-7-to-9-months-621']");
	By Rec_10_12Months = new By.ByCssSelector("a[href='recipes-for-kids-corner-recipes-for-baby-10-to-12-months-622']");
	
	
//	 By.ByXPath//*[@id="nav"]/li[1]/ul/li[3]/ul/li[4]/a
//	 By.ByCssSelector href=
	public WebElement getHealthInMenu() 
	{		
		return driver.findElement(health_in_menu);
	}
	
	public WebElement getBloodPressureInHealth() 
	{		
		return driver.findElement(blood_pressure_in_health);
	}

	//****Monali*****
	public WebElement getCuisineMenu() 
	{		
		return driver.findElement(CuisineStart);
	}
	
	public WebElement getMahaInCuisine() 
	{		
		return driver.findElement(MahaStart);
	}
	
	public WebElement getKidsMenu() 
	{		
		return driver.findElement(Kids);
	}
	
	public WebElement getRecipeInKids() 
	{		
		return driver.findElement(Rec_7_9Months);
	}
	
	public WebElement getRecipesBabies() 
	{		
		return driver.findElement(Rec_10_12Months);
	}
	
	
	
}
