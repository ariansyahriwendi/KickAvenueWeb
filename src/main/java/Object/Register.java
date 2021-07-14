package Object;

import BaseClass.BaseSetUp;
import org.openqa.selenium.By;

public class Register extends BaseSetUp {

    private final By buttonRegister = new By.ByXPath("//*[@id=\"navbar__v3__wrapper\"]/div[1]/div[2]/div[1]/a[1]");
    public void clickButtonRegister() {
        clickButton(buttonRegister);
    }

    private final By buttonSignUp = new By.ByXPath("//*[@id=\"main\"]/div[1]/div/div[4]/div[2]/div[1]/h5/span");
    public void clickButtonSignUp() {
        clickButton(buttonSignUp);
    }

    private final By fieldEmail = new By.ByXPath("//*[@id=\"main\"]/div[1]/div/div[4]/div[2]/div[2]/input[1]");
    public void inputEmail(String email) {
        inputText(fieldEmail, email);
    }

    private final By fieldCountry = new By.ByXPath("//*[@id=\"main\"]/div[1]/div/div[4]/div[2]/div[2]/select[1]");
    public void clickCountry() {
        clickButton(fieldCountry);
    }

    private final By selectIndonesia = new By.ByXPath("//*[@id=\"main\"]/div[1]/div/div[4]/div[2]/div[2]/select[1]/option[2]");
    public void clickIndonesia() {
        clickButton(selectIndonesia);
    }

    private final By fieldProvince = new By.ByXPath("//*[@id=\"main\"]/div[1]/div/div[4]/div[2]/div[2]/select[2]");
    public void clickProvince() {
        clickButton(fieldProvince);
    }

    private final By selectBanten = new By.ByXPath("//*[@id=\"main\"]/div[1]/div/div[4]/div[2]/div[2]/select[2]/option[2]");
    public void clickBanten() {
        clickButton(selectBanten);
    }

    private final By fieldPassword = new By.ByXPath("//*[@id=\"main\"]/div[1]/div/div[4]/div[2]/div[2]/input[2]");
    public void inputPassword(String password) {
        inputText(fieldPassword, password);
    }

    private final By fieldConfirmPassword = new By.ByXPath("//*[@id=\"main\"]/div[1]/div/div[4]/div[2]/div[2]/input[3]");
    public void inputConfirmPassword(String confirmPassword) {
        inputText(fieldConfirmPassword, confirmPassword);
    }

    private final By buttonSubmitRegister = new By.ByClassName("btn-register");
    public void clickSubmitRegister() {
        clickButton(buttonSubmitRegister);
    }

}
