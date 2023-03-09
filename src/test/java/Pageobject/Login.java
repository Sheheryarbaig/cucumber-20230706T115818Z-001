package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Login {

    static WebElement alert = null;
    static WebElement alertexample = null;
    static WebElement login = null;

    public static WebElement alert_test(WebDriver driver) {
        alert = driver.findElement(By.id("alerttest"));
        return alert;
    }

    public static WebElement alert_test_example(WebDriver driver) {
        alertexample = driver.findElement(By.id("alertexamples"));
        return alertexample;

    }

    public static void closedriver(WebDriver driver) {
        driver.switchTo().alert().accept();
        driver.quit();

    }

    public static WebDriver initialize(WebDriver driver,ChromeOptions options) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sheheryar.ali_ventur.SHEHERYAR-G8\\Downloads\\chromedriver.exe");
        options = new ChromeOptions();
        options.addArguments("--kiosk");
        driver=new ChromeDriver(options);
        return driver;
    }
    public static WebDriver link(WebDriver driver) {
        driver.get("https://testpages.herokuapp.com/styled/index.html");
return driver;
    }







}
