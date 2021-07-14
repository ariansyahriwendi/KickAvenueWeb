package TestStep;

import BaseClass.BaseSetUp;
import BaseClass.BaseStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class LoginStep extends BaseStep {

    @Given("I am user")
    public void iAmUser() throws IOException {
        BaseSetUp.getDriver();
        BaseSetUp.openWebsite(BaseSetUp.getUrl());
        BaseSetUp.maximizeWebsite();

    }

    @When("I want to login")
    public void IWantToLogin() {
    }

    @And("I click login")
    public void IClickLogin() {
        login.clickButtonLogin();
    }

    @And("I input email {string}")
    public void IInputEmail(String email) {
        login.inputEmail(email);
    }

    @And("I input password {string}")
    public void IInputPassword(String password) {
        login.inputPassword(password);
    }

    @And("I click submit login")
    public void IClickSubmitLogin() throws InterruptedException {
        login.clickButtonSubmitLogin();
        Thread.sleep(5000);
    }

    @Then("I login successfully")
    public void ILoginSuccessfully() throws InterruptedException {
        BaseSetUp.closeWebsite();
        Thread.sleep(3000);
    }

    @And("I click profile")
    public void IClickProfile() {
        login.clickButtonProfile();
    }

    @And("I click logout")
    public void IClickLogout() {
        login.clickButtonLogout();
    }

    @Then("I logout successfully")
    public void ILogoutSuccessfully() throws InterruptedException {
        BaseSetUp.closeWebsite();
        Thread.sleep(3000);
    }

    @And("I click facebook button")
    public void IClickFacebookButton() {
        login.clickButtonFacebook();
    }

    @And("I click apple button")
    public void IClickAppleButton() {
        login.clickButtonApple();
    }

    @And("I click google button")
    public void IClickGoogleButton() {
        login.clickButtonGoogle();
    }

}
