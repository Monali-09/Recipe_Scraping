package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search_IndianStarter
{
	
		
	    WebDriver driver = null;
	 
	    public Search_IndianStarter(WebDriver driver)
	    {
	  	  this.driver = driver;
	    }

	    By search_textbox=By.id("ctl00_txtsearch");
	    By search_btn=By.name("ctl00$imgsearch");
	    By link_click=By.cssSelector("a[class='rcpsrch_suggest'][href='recipes-for-iron-rich-starters-snacks-541']");                 

	  public void textbox(String searchText) 
	  {
			driver.findElement(search_textbox).sendKeys(searchText);
		}
		public void search() 
         {
			driver.findElement(search_btn).click();
		 }
		public void linkclick() {
			driver.findElement(link_click).click();
		}
		
	}	
			

