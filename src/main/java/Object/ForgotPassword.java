package Object;

import BaseClass.BaseSetUp;
import org.openqa.selenium.By;

public class ForgotPassword extends BaseSetUp {

    private final By buttonForgotPassword = new By.ByClassName("forgot-password");
    public void clickButtonForgotPassword() {
        clickButton(buttonForgotPassword);
    }

    private final By buttonSendResetLink = new By.ByXPath("//*[@id=\"main\"]/div[1]/div/div[4]/div[2]/div[3]/input[2]");
    public void clickButtonSendResetLink() {
        clickButton(buttonSendResetLink);
    }

    private final By fieldEmailForgotPassword = new By.ByXPath("//*[@id=\"main\"]/div[1]/div/div[4]/div[2]/div[3]/input[1]");
    public void inputFieldEmailForgotPassword(String email) {
        inputText(fieldEmailForgotPassword, email);
    }




}
