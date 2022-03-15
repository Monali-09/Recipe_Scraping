package test;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import objectRepository.RecipePageObjects;
import objectRepository.Search_HealthyBF;
import objectRepository.Search_HealthySalad;
import objectRepository.Search_IndianStarter;
import objectRepository.Search_MaharashtrianRecipes;
import utils.ExcelUtils;

public class ReceipeScrappingOne 
{
	WebDriver driver=null;	
	@Test	
	public void Healthy() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","C:\\SElenuimDriver\\chromedriver.exe");
		//driver = new ChromeDriver();

		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.managed_default_content_settings.images", 2);
		ChromeOptions op = new ChromeOptions();
		op.setExperimentalOption("prefs", prefs);
		driver= new ChromeDriver(op);
		
		driver.get("https://www.tarladalal.com/");
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		driver.manage().window().maximize();		
		
	//	from excle utils constructor gets called
		ExcelUtils xlUtils =  new ExcelUtils(".\\RecipeData\\RecipeData.xlsx") ;
		
		 xlUtils.setCellData("Sheet1", 0, 0, "Title");
		 xlUtils.setCellData("Sheet1", 0, 1, "Category");
		 xlUtils.setCellData("Sheet1", 0, 2, "Ingredients");
		 xlUtils.setCellData("Sheet1", 0, 3, "Method/Recipe Steps");
		 xlUtils.setCellData("Sheet1", 0, 4, "Nutrient Values ");
		 xlUtils.setCellData("Sheet1", 0, 5, "Recipe image link");
		 xlUtils.setCellData("Sheet1", 0, 6, "Link to the recipe");	
		 
		Thread.sleep(1000);
		RecipePageObjects recipePageObj = new RecipePageObjects(driver);
		Search_HealthyBF BFObj = new Search_HealthyBF(driver);
		
		BFObj.textbox("Healthy Indian Breakfast Recipes");
		BFObj.search();
		BFObj.linkclick();	
		
		
		for (int i=1; i<7;i++)
       { 			
			recipePageObj.selectLinkInRecipeListPage(i);			
			
			String title = recipePageObj.getTitle();
			xlUtils.setCellData("Sheet1", i, 0, title);
			
			String category = recipePageObj.getCategoryName();
			xlUtils.setCellData("Sheet1", i, 1, category); 
			
			String ingredients = recipePageObj.getIngredients();
			xlUtils.setCellData("Sheet1", i, 2, ingredients);
			
			String recipeSteps = recipePageObj.getRecipeSteps();
			xlUtils.setCellData("Sheet1", i, 3, recipeSteps);
			
			String nutriotionVal =recipePageObj.getNutritionValues();
			xlUtils.setCellData("Sheet1", i, 4, nutriotionVal);
			
			//capture img link
			String imageLink =recipePageObj.getImageLink();
     	  	xlUtils.setCellData("Sheet1", i, 5, imageLink);
     	  	
     	  	//capture recipe link
     	  	String recipeLink= recipePageObj.getRecipeLink();
     	  	xlUtils.setCellData("Sheet1", i, 6, recipeLink);
     	  
     	  	driver.navigate().back();			
       }	
		
		
		 xlUtils.setCellData("Sheet2", 0, 0, "Title");
		 xlUtils.setCellData("Sheet2", 0, 1, "Category");
		 xlUtils.setCellData("Sheet2", 0, 2, "Ingredients");
		 xlUtils.setCellData("Sheet2", 0, 3, "Method/Recipe Steps");
		 xlUtils.setCellData("Sheet2", 0, 4, "Nutrient Values ");
		 xlUtils.setCellData("Sheet2", 0, 5, "Recipe image link");
		 xlUtils.setCellData("Sheet2", 0, 6, "Link to the recipe");	
		 
		Thread.sleep(2000);
		Search_HealthySalad SalObj = new Search_HealthySalad(driver);
		
		SalObj.textbox("Healthy salad Recipes");
		SalObj.search();
		SalObj.linkclick();		
		
		for (int i=1; i<20;i++)
       { 			
			recipePageObj.selectLinkInRecipeListPage(i);			
			
			String title = recipePageObj.getTitle();
			xlUtils.setCellData("Sheet2", i, 0, title);
			
			String category = recipePageObj.getCategoryName();
			xlUtils.setCellData("Sheet2", i, 1, category); 
			
			String ingredients = recipePageObj.getIngredients();
			xlUtils.setCellData("Sheet2", i, 2, ingredients);
			
			String recipeSteps = recipePageObj.getRecipeSteps();
			xlUtils.setCellData("Sheet2", i, 3, recipeSteps);
			
			String nutriotionVal =recipePageObj.getNutritionValues();
			xlUtils.setCellData("Sheet2", i, 4, nutriotionVal);
			
			//capture img link
			String imageLink =recipePageObj.getImageLink();
     	  	xlUtils.setCellData("Sheet2", i, 5, imageLink);
     	  	
     	  	//capture recipe link
     	  	String recipeLink= recipePageObj.getRecipeLink();
     	  	xlUtils.setCellData("Sheet2", i, 6, recipeLink);
     	  
     	  	driver.navigate().back();			
       }	
		
		//Search_MaharashtrianRecipes
			
		 xlUtils.setCellData("Sheet3", 0, 0, "Title");
		 xlUtils.setCellData("Sheet3", 0, 1, "Category");
		 xlUtils.setCellData("Sheet3", 0, 2, "Ingredients");
		 xlUtils.setCellData("Sheet3", 0, 3, "Method/Recipe Steps");
		 xlUtils.setCellData("Sheet3", 0, 4, "Nutrient Values ");
		 xlUtils.setCellData("Sheet3", 0, 5, "Recipe image link");
		 xlUtils.setCellData("Sheet3", 0, 6, "Link to the recipe");	
		 
		Thread.sleep(1000);
		Search_MaharashtrianRecipes MahaObj = new Search_MaharashtrianRecipes(driver);
		
		MahaObj.textbox("Maharashtrian Recipes");
		MahaObj.search();
		MahaObj.linkclick();		
		
		for (int i=1; i<10;i++)
      { 			
			recipePageObj.selectLinkInRecipeListPage(i);			
			
			String title = recipePageObj.getTitle();
			xlUtils.setCellData("Sheet3", i, 0, title);
			
			String category = recipePageObj.getCategoryName();
			xlUtils.setCellData("Sheet3", i, 1, category); 
			
			String ingredients = recipePageObj.getIngredients();
			xlUtils.setCellData("Sheet3", i, 2, ingredients);
			
			String recipeSteps = recipePageObj.getRecipeSteps();
			xlUtils.setCellData("Sheet3", i, 3, recipeSteps);
			
			String nutriotionVal =recipePageObj.getNutritionValues();
			xlUtils.setCellData("Sheet3", i, 4, nutriotionVal);
			
			//capture img link
			String imageLink =recipePageObj.getImageLink();
    	  	xlUtils.setCellData("Sheet3", i, 5, imageLink);
    	  	
    	  	//capture recipe link
    	  	String recipeLink= recipePageObj.getRecipeLink();
    	  	xlUtils.setCellData("Sheet3", i, 6, recipeLink);
    	  
    	  	driver.navigate().back();			
      }	
		// Indian starters 
		
		 xlUtils.setCellData("Sheet4", 0, 0, "Title");
		 xlUtils.setCellData("Sheet4", 0, 1, "Category");
		 xlUtils.setCellData("Sheet4", 0, 2, "Ingredients");
		 xlUtils.setCellData("Sheet4", 0, 3, "Method/Recipe Steps");
		 xlUtils.setCellData("Sheet4", 0, 4, "Nutrient Values ");
		 xlUtils.setCellData("Sheet4", 0, 5, "Recipe image link");
		 xlUtils.setCellData("Sheet4", 0, 6, "Link to the recipe");	
		 
		Thread.sleep(2000);
		Search_IndianStarter IndianObj = new Search_IndianStarter(driver);
		
		IndianObj.textbox("Indian starters Recipes");
		IndianObj.search();
		IndianObj.linkclick();		
		
		for (int i=1; i<18;i++)
      { 			
			recipePageObj.selectLinkInRecipeListPage(i);			
			
			String title = recipePageObj.getTitle();
			xlUtils.setCellData("Sheet4", i, 0, title);
			
			String category = recipePageObj.getCategoryName();
			xlUtils.setCellData("Sheet4", i, 1, category); 
			
			String ingredients = recipePageObj.getIngredients();
			xlUtils.setCellData("Sheet4", i, 2, ingredients);
			
			String recipeSteps = recipePageObj.getRecipeSteps();
			xlUtils.setCellData("Sheet4", i, 3, recipeSteps);
			
			String nutriotionVal =recipePageObj.getNutritionValues();
			xlUtils.setCellData("Sheet4", i, 4, nutriotionVal);
			
			//capture img link
			String imageLink =recipePageObj.getImageLink();
    	  	xlUtils.setCellData("Sheet4", i, 5, imageLink);
    	  	
    	  	//capture recipe link
    	  	String recipeLink= recipePageObj.getRecipeLink();
    	  	xlUtils.setCellData("Sheet4", i, 6, recipeLink);
    	  
    	  	driver.navigate().back();			
      }	
			
		driver.close();		
		
	}

}
