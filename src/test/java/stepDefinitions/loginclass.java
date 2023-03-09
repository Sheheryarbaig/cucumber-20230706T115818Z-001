package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import Pageobject.Login;


public class loginclass {

     WebDriver driver;
    ChromeOptions options;
    @Given("I launch Chrome browser")
    public void i_launch_Chrome_browser() {
        driver=Login.initialize(driver,options);



    }

    @When("I open Salesflo page")
    public void i_open_Salesflo_page() throws InterruptedException {
    driver=Login.link(driver);

       }

    @Then("Login is successful")
    public void login_is_successful() throws InterruptedException {

        System.out.println("Hello");
        JavascriptExecutor js = (JavascriptExecutor) driver;
 js.executeScript("window.scrollBy(0,350)", "");

        Login.alert_test(driver).click();
        Login.alert_test_example(driver).click();

    }

    @And("Close Browser")
    public void close_Browser() {
        Login.closedriver(driver);

    }





}
