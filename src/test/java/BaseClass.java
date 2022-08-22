import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BaseClass {

    WebDriver driver;

    @BeforeAll
    public static void setup() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void start(){
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.get("https://www.facebook.com/");
    }

    @AfterEach
    public void tearDown() throws Exception {
        this.driver.quit();
    }

    public void pageIsLoaded(WebElement element){
        element.isDisplayed();
    }

    public WebElement findElementById(String id){
        WebElement element = this.driver.findElement(By.id(id));
        return element;
    }

    public WebElement findElementByXpath(String xpath){
        WebElement element = this.driver.findElement(By.xpath(xpath));
        return element;
    }

    public WebElement findElementByClassName(String className){
        WebElement element = this.driver.findElement(By.className(className));
        return element;
    }

    public WebElement findElementByTagName(String tagName){
        WebElement element = this.driver.findElement(By.tagName(tagName));
        return element;
    }

    public WebElement findElementByName(String name){
        WebElement element = this.driver.findElement(By.name(name));
        return element;
    }

    public WebElement findElementByLinkText(String linkText){
        WebElement element = this.driver.findElement(By.linkText(linkText));
        return element;
    }

    public WebElement findElementByCss(String css){
        WebElement element = this.driver.findElement(By.cssSelector(css));
        return element;
    }

    public List<WebElement> findElementsById(String id){
        List<WebElement> elements = this.driver.findElements(By.id(id));
        return elements;
    }

    public List<WebElement> findElementsByXpath(String xpath){
        List<WebElement> elements = this.driver.findElements(By.xpath(xpath));
        return elements;
    }

    public List<WebElement> findElementsByClassName(String className){
        List<WebElement> elements = this.driver.findElements(By.className(className));
        return elements;
    }

    public List<WebElement> findElementsByTagName(String tagName){
        List<WebElement> elements = this.driver.findElements(By.tagName(tagName));
        return elements;
    }

    public List<WebElement> findElementsByName(String name){
        List<WebElement> elements = this.driver.findElements(By.name(name));
        return elements;
    }

    public List<WebElement> findElementsByLinkText(String linkText){
        List<WebElement> elements = this.driver.findElements(By.linkText(linkText));
        return elements;
    }

    public List<WebElement> findElementsByCss(String css){
        List<WebElement> elements = this.driver.findElements(By.cssSelector(css));
        return elements;
    }

    public void wait(WebElement element){
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitClickable(WebElement element){
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }


}
