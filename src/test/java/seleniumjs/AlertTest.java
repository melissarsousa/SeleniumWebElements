package seleniumjs;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import org.junit.Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// https://www.selenium.dev/documentation/webdriver/interactions/alerts/

public class AlertTest {

    @Test
    public void Test (){

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts"); 
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)).pageLoadTimeout(Duration.ofSeconds(10));
      /* 
        driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[1]/button")).click();

        Alert alert = driver.switchTo().alert();

        String textoDoAlerta = alert.getText();
        System.out.println("Texto do alerta: " + textoDoAlerta);
    
        alert.accept();
  
        driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[2]/button")).click();
        Alert alert = driver.switchTo().alert();

        String textoDoAlerta = alert.getText();
        System.out.println("Texto do alerta: " + textoDoAlerta);
        
        alert.dismiss();
   */

        driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[3]/button")).click();

        Alert alert = driver.switchTo().alert();

        String textoDoAlerta = alert.getText();
        System.out.println("Texto do alerta: " + textoDoAlerta);

        alert.sendKeys("Teste Alerta");
        alert.accept();




}
}
