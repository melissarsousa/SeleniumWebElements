package seleniumjs;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrollToElement {
     
    @Test
    public void rolagemParaElemento() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/infinite_scroll");

        // Define the locator for the target element
        By targetLocator = By.xpath("/html/body/div[2]/div/div/div/div/div/div[9]"); // Replace with the appropriate
                                                                                    // locator for the target element
 
        // Initialize the JavaScript Executor
        JavascriptExecutor js = (JavascriptExecutor) driver;
 
        // Initialize the WebDriverWait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2)); // Timeout set to 5 seconds
 
        // Loop to scroll down the page until the element is visible
        while (true) {
            try {
                // Check if the element is visible
                WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(targetLocator));
                if (element.isDisplayed()) {
                    System.out.println("Element is visible!");
                    break;
                }
            } catch (Exception e) {
                // Scroll down by one screen height
                js.executeScript("window.scrollBy(0, window.innerHeight);");
                Thread.sleep(2000); // Adjust sleep time as necessary
            }
        }
    }

}
