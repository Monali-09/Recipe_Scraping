package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MaharashtrianPageObject
{
	WebDriver driver = null ;
	
	By RecipeStart = new By.ByCssSelector(".menucontainer_div");
	By Kids = new By.ByXPath("//*[@id=\"nav\"]/li[1]/ul/li[3]/a");
	By Rec_7_9Months  = new By.ByXPath("//*[@id=\"nav\"]/li[1]/ul/li[3]/ul/li[3]/a");
	
//	By Search_menu =new  By.ByXPath("//*[@id='ctl00_txtsearch']"); //*[@id="ctl00_txtsearch"]
//	By SearchButton = new By.ByXPath("//*[@id='ctl00_imgsearch']");	
	
//	public void EnterSearch(String username)
//    {
//	   driver.findElement(Search_menu).sendKeys("Kids");
//    }
//		
//	public void ClickSearch(String username)
//    {
//	  driver.findElement(SearchButton).click();
//    }
	
	
}
