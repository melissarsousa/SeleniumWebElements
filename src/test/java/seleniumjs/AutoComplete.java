package seleniumjs;

import java.time.Duration;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete {

    @Test
    public void selecionarCidade() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://cidades.ibge.gov.br/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)).pageLoadTimeout(Duration.ofSeconds(10));

        String cidade = "Fortaleza";

        WebElement autoOptions = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/div/div/busca/div/input"));
        autoOptions.sendKeys("Fortal");

        List<WebElement> optionsToSelect = driver
                .findElements(By.xpath("//*[@id=\"wrapper\"]/div[1]/div/div/busca/div/div[2]/div/div[2]/a"));

        for (WebElement option : optionsToSelect) {
            if (option.getText().contains(cidade)) {
                System.out.println("Trying to select: " + cidade);
                option.click();
                break;
            }
        }
    }

}
