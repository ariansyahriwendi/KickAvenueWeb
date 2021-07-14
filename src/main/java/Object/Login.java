package Object;

import BaseClass.BaseSetUp;
import org.openqa.selenium.By;

public class Login extends BaseSetUp {

    private final By buttonLogin = new By.ByXPath("//*[@id=\"navbar__v3__wrapper\"]/div[1]/div[2]/div[1]/a[2]");
    public void clickButtonLogin() {
        clickButton(buttonLogin);
    }

    private final By buttonProfile = new By.ByClassName("kickave-3__profile");
    public void clickButtonProfile() {
        clickButton(buttonProfile);
    }

    private final By fieldEmail = new By.ByXPath("//*[@id=\"main\"]/div[1]/div/div[4]/div[2]/div[2]/input[1]");
    public void inputEmail(String email) {
        inputText(fieldEmail, email);
    }

    private final By fieldPassword = new By.ByXPath("//*[@id=\"main\"]/div[1]/div/div[4]/div[2]/div[2]/input[2]");
    public void inputPassword(String password) {
        inputText(fieldPassword, password);
    }

    private final By buttonSubmitLogin = new By.ByXPath("//*[@id=\"main\"]/div[1]/div/div[4]/div[2]/div[2]/input[3]");
    public void clickButtonSubmitLogin() {
        clickButton(buttonSubmitLogin);
    }

    private final By buttonLogout = new By.ByClassName("menu-item-logout");
    public void clickButtonLogout() {
        clickButton(buttonLogout);
    }

    private final By buttonFacebook = new By.ByXPath("//*[@id=\"main\"]/div[1]/div/div[4]/div[2]/div[5]/div[1]");
    public void clickButtonFacebook() {
        clickButton(buttonFacebook);
    }

    private final By buttonApple = new By.ByXPath("//*[@id=\"main\"]/div[1]/div/div[4]/div[2]/div[5]/div[2]");
    public void clickButtonApple() {
        clickButton(buttonApple);
    }

    private final By buttonGoogle = new By.ByXPath("//*[@id=\"main\"]/div[1]/div/div[4]/div[2]/div[5]/button");
    public void clickButtonGoogle() {
        clickButton(buttonGoogle);
    }
}
