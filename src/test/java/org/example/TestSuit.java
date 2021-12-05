package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest {
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationSuccessPage registrationSuccessPage = new RegistrationSuccessPage();
    ComputerPage computerPage = new ComputerPage();
    NavigateToDesktopPage navigateToDesktopPage = new NavigateToDesktopPage();
    NewsCommentPage newsCommentPage = new NewsCommentPage();
    NewsComentAddSuccessfullyPage newsComentAddSuccessfullyPage = new NewsComentAddSuccessfullyPage();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    EMailAFriend eMailAFriend = new EMailAFriend();
    EmailAFriendResult emailAFriendResult = new EmailAFriendResult();




    @Test
    public void UserShouldBeAbleToRegisterSuccessfully() {
        homePage.ClickOnRegisterButton();
        registrationPage.enterRegistrationDetails();
        registrationSuccessPage.registrationSuccessful();

    }

    @Test
    public void UserIsAbleToNavigateToDesktopPage() {
        homePage.clickOnComputerButton();
        computerPage.clickOnTheDesktop();
        navigateToDesktopPage.navigateToADesktop();


    }
    @Test
    public void UserShouldBeAbleToNewsCommentsSuccessfully(){
        homePage.clickOnNewsCommentsDetails();
        newsCommentPage.enternewscommentsdetails();
        newsComentAddSuccessfullyPage.newsCommentAddSuccessfully();
    }
    @Test
    public void UserShouldBeAbleToReferAProductToAFriend(){
        UserShouldBeAbleToRegisterSuccessfully();
        registrationSuccessPage.clickOnContinueOnRegistrationSuccessfulPage();
        homePage.clickOnBuildYourOwnComputer();
        buildYourOwnComputerPage.emailAFriend();
        eMailAFriend.emailAFriendVimal();
        emailAFriendResult.emailAFriendResultSuccessful();


    }

}