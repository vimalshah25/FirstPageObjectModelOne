package org.example;

import org.openqa.selenium.By;

public class NewsCommentPage extends HomePage{
    By _newsCommentsTitles = By.id("AddNewComment_CommentTitle");
    By _newsCommentsText = By.id("AddNewComment_CommentText");
    By _clickOnTheNewsCommentsButton = By.xpath("//div[@class='page-body']/div[3]/form/div[2]/button[1]");

public void enternewscommentsdetails(){
    typeText(_newsCommentsTitles,"Very Nice Product");
    typeText(_newsCommentsText,"5 star Product");
    clickOnElement(_clickOnTheNewsCommentsButton);
}


}
