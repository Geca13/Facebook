

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class FacebookTest extends BaseClass {

    @Test
    @Order(1)
    public void loginAndMakePost() throws InterruptedException {

        FacebookLoginPage login = new FacebookLoginPage(this.driver);
        login.loginToFacebook();
        HomePage home = new HomePage(this.driver);
        home.createMessagePost();

    }

    @Test
    @Order(2)
    public void loginAndDeletePost() throws InterruptedException {

        FacebookLoginPage login = new FacebookLoginPage(this.driver);
        login.loginToFacebook();
        HomePage home = new HomePage(this.driver);
        home.deleteLatestPost();
    }

    @Test
    @Order(3)
    public void loginLogoutAndLoginWithSavedBrowserProfile() throws InterruptedException {

        FacebookLoginPage login = new FacebookLoginPage(this.driver);
        login.loginToFacebook();
        NavbarComponent navbar = new NavbarComponent(this.driver);
        navbar.logout();
        login.loginWithProfileImage();
    }

    @Test
    @Order(4)
    public void loginAndMakePostWithImage() throws InterruptedException {

        FacebookLoginPage login = new FacebookLoginPage(this.driver);
        login.loginToFacebook();
        HomePage home = new HomePage(this.driver);
        home.uploadPhotoVideoAndPost();
    }

}
