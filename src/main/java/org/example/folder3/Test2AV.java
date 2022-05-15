package org.example.folder3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;

public class Test2AV {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://av.by");

        try {
            driver.findElement(By.xpath(".//span[contains(.,'Транспорт')]")).click();
            driver.findElement(By.xpath(".//span[contains(.,'Nissan')]")).click();
            driver.findElement(By.xpath(".//span[contains(.,'X-Trail')]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath(".//div[@id='p-6-0-4-generation']/div/div/button/span")).click();
            driver.findElement(By.xpath(".//div[2]/label/span")).click();
            driver.findElement(By.xpath(".//span[contains(.,'Показать 13 объявлений')]")).click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
