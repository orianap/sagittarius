package com.sagittarius.testpages;

import com.sagittarius.basetest.BaseTest;
import org.junit.*;
import pageobjects.GitHubProjectPage;

public class GitHubProjectPageTest extends BaseTest
{
    private static GitHubProjectPage gitHubPage;

    @Before
    public void beforeTest()
    {
        gitHubPage = new GitHubProjectPage(getDriver());
        gitHubPage.open();
    }

    @After
    public void afterTest()
    {
        gitHubPage.close();
    }

    @AfterClass
    public static void afterClass()
    {
        gitHubPage.quit();
    }

    @Test
    public void cloneOrDownloadButtonShouldBePresent()
    {
        gitHubPage.checkCloneOrDownloadButton();
    }

    @Test
    public void findFileButtonShouldBePresent()
    {
        gitHubPage.checkFindFileButton();
    }

    @Test
    public void projectPageShouldContainReadMeFile()
    {
        gitHubPage.checkReadMeFile();
    }

    @Test
    public void createNewFileButtonShouldNotBePresent()
    {
        gitHubPage.checkCreateNewFileButton();
    }

    @Test
    public void uploadFileButtonShouldNotBePresent()
    {
        gitHubPage.checkUploadFileButton();
    }
}
