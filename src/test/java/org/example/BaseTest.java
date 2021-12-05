package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils {

    BrowsersManager browserManager = new BrowsersManager();

    @BeforeMethod
    public void setUpBrowser(){
        browserManager.openBrowser();
    }
    @AfterMethod
    public void tearDownBrowser(){
        browserManager.closeBrowser();
    }



}
