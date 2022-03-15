package test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import objectRepository.InitialiseDriver;
import objectRepository.MaharashtrianPageObject;
import objectRepository.RecipePageObjects;

import objectRepository.SubLinksObjects;
import utils.ExcelUtils;

public class RecipeScrappingTest 
{
	WebDriver driver=null;
	@Test
	public void recipeScrapping() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\SElenuimDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.tarladalal.com/");
		//driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		
		//Monali						
		ExcelUtils xlUtils =  new ExcelUtils(".\\RecipeData\\RecipeData.xlsx") ;
		
		 xlUtils.setCellData("Sheet2", 0, 0, "Title");
		 xlUtils.setCellData("Sheet2", 0, 1, "Category");
		 xlUtils.setCellData("Sheet2", 0, 2, "Ingredients");
		 xlUtils.setCellData("Sheet2", 0, 3, "Method/Recipe Steps");
		 xlUtils.setCellData("Sheet2", 0, 4, "Nutrient Values ");
		 xlUtils.setCellData("Sheet2", 0, 5, "Recipe image link");
		 xlUtils.setCellData("Sheet2", 0, 6, "Link to the recipe");	
		
		Thread.sleep(1000);
		
		RecipePageObjects recipePageObj = new RecipePageObjects(driver);
		SubLinksObjects sublinksObj = new SubLinksObjects(driver);
		Actions actions = new Actions(driver);	
			
		WebElement mainRecMenu = recipePageObj.hoverMainMenu();
		actions.moveToElement(mainRecMenu).perform();

		WebElement subCuisMenu = sublinksObj.getCuisineMenu();
		actions.moveToElement(subCuisMenu).perform();

		WebElement secondItaSubMenu = sublinksObj.getMahaInCuisine();
		secondItaSubMenu.click();	
  
		for (int i=1; i<14;i++)
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
		
			
		 xlUtils.setCellData("Sheet3", 0, 0, "Title");
		 xlUtils.setCellData("Sheet3", 0, 1, "Category");
		 xlUtils.setCellData("Sheet3", 0, 2, "Ingredients");
		 xlUtils.setCellData("Sheet3", 0, 3, "Method/Recipe Steps");
		 xlUtils.setCellData("Sheet3", 0, 4, "Nutrient Values ");
		 xlUtils.setCellData("Sheet3", 0, 5, "Recipe image link");
		 xlUtils.setCellData("Sheet3", 0, 6, "Link to the recipe");	
		 
		Thread.sleep(1000);
		
		WebElement mainRecMenu2 = recipePageObj.hoverMainMenu();
		actions.moveToElement(mainRecMenu2).perform();

		WebElement subKidsMenu = sublinksObj.getKidsMenu();
		actions.moveToElement(subKidsMenu).perform();

		WebElement secondKidsSubMenu = sublinksObj.getRecipeInKids();
		secondKidsSubMenu.click();	
		
		for (int i=1; i<20;i++)
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
		
//		 xlUtils.setCellData("Sheet5", 0, 0, "Title");
//		 xlUtils.setCellData("Sheet5", 0, 1, "Category");
//		 xlUtils.setCellData("Sheet5", 0, 2, "Ingredients");
//		 xlUtils.setCellData("Sheet5", 0, 3, "Method/Recipe Steps");
//		 xlUtils.setCellData("Sheet5", 0, 4, "Nutrient Values ");
//		 xlUtils.setCellData("Sheet5", 0, 5, "Recipe image link");
//		 xlUtils.setCellData("Sheet5", 0, 6, "Link to the recipe");	
		 
		Thread.sleep(1000);
		
		WebElement BabiesMenu = recipePageObj.hoverMainMenu();
		actions.moveToElement(BabiesMenu).perform();

		WebElement subBabiesMenu = sublinksObj.getKidsMenu();
		actions.moveToElement(subBabiesMenu).perform();
		
		WebElement thirdKidsSubMenu = sublinksObj.getRecipesBabies();
		thirdKidsSubMenu.click();	
		
		for (int i=1; i<12;i++)
        { 			
			recipePageObj.selectLinkInRecipeListPage(i);			
			
			String title = recipePageObj.getTitle();
			xlUtils.setCellData("Sheet5", i, 0, title);
			
			String category = recipePageObj.getCategoryName();
			xlUtils.setCellData("Sheet5", i, 1, category); 
			
			String ingredients = recipePageObj.getIngredients();
			xlUtils.setCellData("Sheet5", i, 2, ingredients);
			
			String recipeSteps = recipePageObj.getRecipeSteps();
			xlUtils.setCellData("Sheet5", i, 3, recipeSteps);
			
			String nutriotionVal =recipePageObj.getNutritionValues();
			xlUtils.setCellData("Sheet5", i, 4, nutriotionVal);
			
			//capture img link
			String imageLink =recipePageObj.getImageLink();
      	  	xlUtils.setCellData("Sheet5", i, 5, imageLink);
      	  	
      	  	//capture recipe link
      	  	String recipeLink= recipePageObj.getRecipeLink();
      	  	xlUtils.setCellData("Sheet5", i, 6, recipeLink);
      	  
      	  	driver.navigate().back();			
        }		
		
		
	
		
	}
}

