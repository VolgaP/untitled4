package org.example.folder3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;

public class Test3AV {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://av.by");

        try {
            driver.findElement(By.xpath(".//span[contains(.,'Шины и диски')]")).click();
            driver.findElement(By.xpath(".//a[contains(@href,'/tires/car')]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath(".//div[@id='p-10-0-5-car_width']/div/div/button/span/span[2]")).click();
            driver.findElement(By.xpath(".//div[@id='p-10-0-5-car_width']/div/div/ul/li[13]/button")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath(".//div[2]/div/div/div/button/span/span[2]")).click();
            driver.findElement(By.cssSelector(".dropdown-list--opened > .dropdown__listitem:nth-child(10) > .dropdown__listbutton")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath(".//div[3]/div/div/div/button/span")).click();
            driver.findElement(By.cssSelector(".dropdown-list--opened > .dropdown__listitem:nth-child(4) > .dropdown__listbutton")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath(".//div[3]/div/div/div/div/div/div/button/span/span[2]")).click();
            driver.findElement(By.xpath(".//span[contains(.,'летние')]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath(".//div[2]/a/span")).click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
