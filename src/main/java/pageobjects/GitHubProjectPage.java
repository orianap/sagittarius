package pageobjects;

import static org.junit.Assert.*;

import com.sagittarius.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GitHubProjectPage extends BasePage
{
    private static final String projectURL = "/orianap/sagittarius/";
    private final String pageURL = getBaseURL() + projectURL;

    private final String gitHubError = "page is not displayed";

    private By cloneOrDownloadButtonBy = By.xpath("//*[@id=\"js-repo-pjax-container\"]/div[2]/div[1]/div[4]/details");
    @FindBy(how = How.XPATH, using = "//*[@id=\"js-repo-pjax-container\"]/div[2]/div[1]/div[4]/details")
    private WebElement cloneOrDownloadButton;

    private By findFileButtonBy = By.xpath("//*[@class= \"BtnGroup\"]//*[contains(@href, \"/find/\")]");
    @FindBy(how = How.XPATH, using = "//*[@class= \"BtnGroup\"]//*[contains(@href, \"/find/\")]")
    private WebElement findFileButton;

    private By readMeFileBy = By.xpath("//table//span/*[contains(@title,\"README.md\")]");
    @FindBy(how = How.XPATH, using = "//table//span/*[contains(@title,\"README.md\")]")
    private WebElement readMeFile;

    private By createNewFileButtonBy = By.xpath("//form[contains(@action, \"/new/\")]/button[contains(@type, \"submit\")]");
    @FindBy(how = How.XPATH, using = "//form[contains(@action, \"/new/\")]/button[contains(@type, \"submit\")]")
    private WebElement createNewFileButton;

    private By uploadFileButtonBy = By.xpath("//*[@class= \"BtnGroup\"]//*[contains(@href, \"/upload/\")]");
    @FindBy(how = How.XPATH, using = "//*[@class= \"BtnGroup\"]//*[contains(@href, \"/upload/\")]")
    private WebElement uploadFileButton;

    public GitHubProjectPage(WebDriver driver)
    {
        super(driver);

    }

    public String getUrl() {
        return pageURL;
    }

    public GitHubProjectPage open()
    {
        driver.get(pageURL);

        return this;
    }

    public GitHubProjectPage checkCloneOrDownloadButton()
    {
        assertTrue(isElementPresent(cloneOrDownloadButtonBy));
        return this;
    }

    public GitHubProjectPage checkFindFileButton()
    {
        assertTrue(isElementPresent(findFileButtonBy));
        return this;
    }

    public GitHubProjectPage checkReadMeFile()
    {
        assertTrue(isElementPresent(readMeFileBy));
        return this;
    }

    public GitHubProjectPage checkCreateNewFileButton()
    {
        assertTrue(!isElementPresent(createNewFileButtonBy));
        return this;
    }

    public GitHubProjectPage checkUploadFileButton()
    {
        assertTrue(!isElementPresent(uploadFileButtonBy));
        return this;
    }


}
