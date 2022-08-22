import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class FacebookLoginPage extends BaseClass {

    private String emailInputId = "email";

    private String passwordInputId = "pass";

    private String loginButtonName = "login";

    private String previouslyLoggedInImageXpath = "//img[@role='img']";

    private String addNewImageId = "u_0_7_4X";

    public FacebookLoginPage(WebDriver driver) {
        this.driver = driver;

    }

    public void loginToFacebook(){
        Credentials credentials = new Credentials();
        this.findElementById(this.emailInputId).sendKeys(credentials.getJavaEmail());
        this.findElementById(this.passwordInputId).sendKeys(credentials.getJavaPass());
        this.findElementByName(this.loginButtonName).click();
    }

    public void loginWithProfileImage() throws InterruptedException {
        Credentials credentials = new Credentials();
        this.waitClickable(this.findElementByXpath(previouslyLoggedInImageXpath));
        this.findElementByXpath(this.previouslyLoggedInImageXpath).click();
        this.waitClickable(this.findElementsByName(loginButtonName).get(1));
        this.findElementsById(this.passwordInputId).get(1).sendKeys(credentials.getJavaPass());
        this.findElementsByName(this.loginButtonName).get(1).click();
        Thread.sleep(5000);
    }

}
