import org.openqa.selenium.WebDriver;

public class NavbarComponent extends BaseClass{

    public NavbarComponent(WebDriver driver) {
        this.driver = driver;
    }

    private String facebookIconCss  = "a[aria-label='Facebook']";

    private String searchInputCss = "input[aria-label='Search Facebook']";

    private String completeSearchXpath = "//li[@id='jsc_c_90']//div//a";

    private String homeIconCss  = "a[aria-label='Home']";

    private String friendsIconCss = "a[aria-label='Friends']";

    private String watchIconCss  = "a[aria-label='Watch']";

    private String communitiesIconCss  = "a[aria-label='Communities']";

    private String gamingIconCss  = "a[aria-label='Gaming']";

    public String profileButtonCss = "svg[aria-label='Your profile']";

    public String logoutOptionXpath = "//span[text()='Log Out']";

    public void logout() throws InterruptedException {
        this.wait(this.findElementByCss(profileButtonCss));
        this.findElementByCss(profileButtonCss).click();
        Thread.sleep(1000);
        this.waitClickable(this.findElementByXpath(logoutOptionXpath));
        this.findElementByXpath(logoutOptionXpath).click();
        Thread.sleep(1000);
    }

    public void searchForFriends() throws InterruptedException {
        this.findElementByCss(this.searchInputCss).sendKeys("Marjan Karafiloski Negotino");
        Thread.sleep(2000);
        this.findElementByXpath(this.completeSearchXpath);
    }
}
