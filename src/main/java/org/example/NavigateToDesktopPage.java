package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class NavigateToDesktopPage extends HomePage{
public void navigateToADesktop(){
    String actualNavigateToDesktopPage = getTextFromElement(By.xpath("//div[@class=\"center-2\"]/div/div/h1"));
    String expectedNavigateToDesktopPage = "Desktops";
    // Assert.assertEquals(actualRegisterSuccessMessage, "expectedRegisterSuccessMessage");
    Assert.assertTrue(actualNavigateToDesktopPage.equals(expectedNavigateToDesktopPage),"Desktops");


}
}
