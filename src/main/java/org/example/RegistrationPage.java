package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage extends HomePage {
    By _firstName=By.id("FirstName");
    By _LastName=By.id("LastName");
    By _email=By.id("Email");
    By _password=By.id("Password");
    By _confirmPassword=By.id("ConfirmPassword");
    By _registrationButton= By.name("register-button");

    public void enterRegistrationDetails(){

        // verify user is on register page
        // Assert.assertTrue(driver.getCurrentUrl().contains(("register")));
        typeText(_firstName, "Vimal");

        typeText(_LastName, "Shah");
        //select day from dropdown
        Select selectDay = new Select(driver.findElement(By.name("DateOfBirthDay")));
        selectDay.selectByVisibleText("18");


        //select month from dropdown
        Select selectMonth = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        selectMonth.selectByValue("4");
        Select selectYear = new Select(driver.findElement(By.name("DateOfBirthYear")));
        selectYear.selectByValue("1999");
        typeText(_email,"vimalshah007+"+currentTimeSTamp()+"@gmail.com");



        typeText(_password, "12345678");
        typeText(_confirmPassword, "12345678");


        clickOnElement(_registrationButton);
    }
}
