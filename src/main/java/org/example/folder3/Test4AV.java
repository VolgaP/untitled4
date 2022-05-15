package org.example.folder3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test4AV {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://av.by");

        try {
            Thread.sleep(2000);
            driver.findElement(By.xpath(".//span[contains(.,'Запчасти')]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath(".//span[contains(.,'Nissan')]")).click();
            driver.findElement(By.xpath(".//span[contains(.,'X-Trail')]")).click();
            driver.findElement(By.cssSelector(".brandsitem:nth-child(2) span")).click();
            driver.findElement(By.cssSelector(".#category_id_chosen b")).click();
            driver.findElement(By.cssSelector(".#category_id_chosen input")).click();
            driver.findElement(By.xpath(".//span[contains(.,'II (T31), 2007—2011')]")).click();
            driver.findElement(By.xpath(".//em[contains(.,'Карданный вал')]")).click();
            driver.findElement(By.xpath(".//div[4]/a")).click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
