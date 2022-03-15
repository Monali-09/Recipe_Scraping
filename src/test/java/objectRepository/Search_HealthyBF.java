package objectRepository;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Search_HealthyBF		
{			
      WebDriver driver = null;
   
      public Search_HealthyBF(WebDriver driver)
      {
    	  this.driver = driver;
      }

      By search_textbox=By.id("ctl00_txtsearch");
      By search_btn=By.name("ctl00$imgsearch");
      By link_click=By.cssSelector("a[class='rcpsrch_suggest'][href='recipes-for-healthy-breakfast-489']");
        
      
    public void textbox(String searchText) 
    {
  		driver.findElement(search_textbox).sendKeys(searchText);
  	}
  	public void search() {
  		driver.findElement(search_btn).click();
  	}
  	public void linkclick() {
  		driver.findElement(link_click).click();
  	}
	
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		public	Search_Kids(WebDriver driver)
//		{
//			this.driver = driver;
//		}
//		
//		By search_textbox=By.id("ctl00_txtsearch");
//		By search_btn=By.name("ctl00$imgsearch");
//		By link_click=By.cssSelector("a[class='rcpsrch_suggest']");
//		
//		public void textbox() {
//			driver.findElement(search_textbox).sendKeys("Kids");
//		}
//		
//		public void search() {
//			driver.findElement(search_btn).click();
//		}
//		
//		public void linkclick() {
//			driver.findElement(link_click).click();
//		}
//		

	































































//Search_Kids SerKids =new Search_Kids(driver);
//SerKids.textbox();
//SerKids.search();
//SerKids.linkclick();

//
//MaharashtrianPageObject Serrec = new MaharashtrianPageObject(driver);
//            Serrec.EnterSearch("");
//            Serrec.ClickSearch();
//

