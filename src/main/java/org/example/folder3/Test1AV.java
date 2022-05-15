package org.example.folder3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test1AV {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://av.by");

        try {
            driver.findElement(By.xpath(".//span[contains(.,'Войти')]")).click();
            driver.findElement(By.xpath(".//button[contains(.,'почте или логину')]")).click();
            driver.findElement(By.xpath(".//input[@id='authLogin']")).sendKeys("ole4ka2403@gmail.com");
            driver.findElement(By.id("loginPassword")).sendKeys("gjldfh;ty20");
            driver.findElement(By.xpath(".//input[@id='loginPassword']")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath(".//button[@type='submit']")).click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
          //  driver.quit();
        }
    }


