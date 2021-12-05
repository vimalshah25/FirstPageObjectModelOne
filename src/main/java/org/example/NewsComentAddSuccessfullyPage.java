package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class NewsComentAddSuccessfullyPage extends NewsCommentPage{
    public void newsCommentAddSuccessfully(){
        String actualNewscomments = getTextFromElement(By.xpath("//div[@class=\"result\"]"));
        String expectedNewscomments = "News comment is successfully added.";
        Assert.assertTrue(actualNewscomments.equals(expectedNewscomments),"News comment is successfully added.");
    }
}
