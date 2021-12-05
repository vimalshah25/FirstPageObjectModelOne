package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowsersManager extends BasePage{
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver","src/test/java/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        // Open the Browser
        driver.manage().window().maximize();
        // Type Url
        driver.get("https://demo.nopcommerce.com/");

    }
    public void closeBrowser(){

         driver.close();
    }

}
