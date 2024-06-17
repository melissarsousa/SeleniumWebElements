package seleniumjs;

import java.time.Duration;
import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {
    @Test
    public void window() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)).pageLoadTimeout(Duration.ofSeconds(10));

        String janelaPrincipal = driver.getWindowHandle();

        driver.findElement(By.xpath("/html/body/div[2]/div/div/a")).click();

        Set<String> todasJanelas = driver.getWindowHandles();

        for (String janela : todasJanelas) {
            /*if (janela.equals(janelaPrincipal)) {
                driver.switchTo().window(janela);
            } */
            if (!janela.equals(janelaPrincipal)) {
                driver.switchTo().window(janela);
            }

        }
    }
}
