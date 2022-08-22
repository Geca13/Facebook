import org.openqa.selenium.WebDriver;

public class HomePage extends BaseClass{

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String clickToPostButtonXpath = "//div[contains(@class , 'rtxb060y')]//span";

    public String postTextBoxXpath = "//div[@role='textbox']";

    public String submitPostButtonXpath = "//span[text()='Post']";

    public String postMenuIconXpath = "//div[@aria-label='Actions for this post']";

    public String postMenuOptions = "//div[@role='menuitem']";

    public String moveToTrashButtonXpath = "//div[@aria-label='Move']";

    public String backgroundButton = "//div[@aria-label='Show Background Options']";

    public String moreBackgroundsButtonXpath = "//i[@style='background-image: url(\"https://static.xx.fbcdn.net/rsrc.php/v3/yd/r/uHcEiX9ZOWI.png\"); background-position: 0px -177px; background-size: auto; width: 16px; height: 16px; background-repeat: no-repeat; display: inline-block;']";

    public String setBackgroundButton = "//div[@class='ikduhi8d']//div//div[2]//div[1]//div//div[1]";

    public String uploadPhotoVideoXpath = "//span[text()='Photo/video']";

    public String uploadInputXpath = "//input[@type='file']";

    public void createMessagePost() throws InterruptedException {
        this.waitClickable(this.findElementByXpath(clickToPostButtonXpath));
        this.findElementByXpath(clickToPostButtonXpath).click();
        Thread.sleep(1000);
        this.waitClickable(this.findElementByXpath(backgroundButton));
        Thread.sleep(1000);
        this.findElementByXpath(backgroundButton).click();
        Thread.sleep(2000);
        this.findElementByXpath(moreBackgroundsButtonXpath).click();
        Thread.sleep(1000);
        this.findElementsByXpath(setBackgroundButton).get(1).click();
        Thread.sleep(1000);
        this.findElementsByXpath(postTextBoxXpath).get(1).sendKeys("Selenium sends simple Post");
        this.waitClickable(findElementByXpath(postTextBoxXpath));
        this.findElementByXpath(submitPostButtonXpath).click();

        Thread.sleep(10000);
    }

    public void deleteLatestPost() throws InterruptedException {
        this.wait(this.findElementByXpath(postMenuIconXpath));
        this.findElementByXpath(postMenuIconXpath).click();
        Thread.sleep(1000);
        this.wait(this.findElementsByXpath(postMenuOptions).get(7));
        this.findElementsByXpath(postMenuOptions).get(7).click();
        this.waitClickable(findElementByXpath(moveToTrashButtonXpath));
        this.findElementByXpath(moveToTrashButtonXpath).click();
        Thread.sleep(5000);
    }

    public void uploadPhotoVideoAndPost() throws InterruptedException {
        this.wait(this.findElementByXpath(uploadPhotoVideoXpath));
        this.findElementByXpath(uploadPhotoVideoXpath).click();
        Thread.sleep(1000);
        //this.wait(this.findElementsByXpath(uploadInputXpath).get(1));
        this.findElementsByXpath(uploadInputXpath).get(findElementsByXpath(uploadInputXpath).size() - 1).sendKeys("D:\\Java\\FacebookSelenium\\src\\test\\resources\\selenium-webdriver.webp");
        this.waitClickable(this.findElementByXpath(submitPostButtonXpath));
        Thread.sleep(1000);
        this.findElementByXpath(submitPostButtonXpath).click();
        Thread.sleep(5000);

    }


}
