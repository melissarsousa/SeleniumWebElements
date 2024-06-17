package seleniumjs;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
        @Test		
    public void DragnDrop()					
    {		
         //System.setProperty("webdriver.chrome.driver"," E://Selenium//Selenium_Jars//chromedriver.exe ");					
         //driver= new ChromeDriver();
         WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)).pageLoadTimeout(Duration.ofSeconds(10));
			
         driver.get("https://the-internet.herokuapp.com/drag_and_drop");					
         
         WebElement elementoA = driver.findElement(By.id("column-a"));
         WebElement elementoB = driver.findElement(By.id("column-b"));

         new Actions(driver)
         .dragAndDrop(elementoA, elementoB)
         .perform();					

         new Actions(driver)
         .dragAndDrop(elementoB, elementoA)
         .perform();					
	}		

}
