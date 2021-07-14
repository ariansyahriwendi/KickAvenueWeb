package TestStep;

import BaseClass.BaseStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStep extends BaseStep {

    @When("I want to register")
    public void IWantToRegister() {

    }

    @And("I click register")
    public void IClickRegister() {
        register.clickButtonRegister();
    }

    @And("I click sign up here")
    public void IClickSignUpHere() {
        register.clickButtonSignUp();
    }

    @And("I input email register {string}")
    public void IInputEmailRegister(String email) {
        register.inputEmail(email);
    }

    @And("I select country")
    public void ISelectCountry() throws InterruptedException {
        register.clickCountry();
        register.clickIndonesia();
    }

    @And("I select province")
    public void ISelectProvince() {
        register.clickProvince();
        register.clickBanten();

    }

    @And("I input password register {string}")
    public void IInputPasswordRegister(String password) {
        register.inputPassword(password);
    }

    @And("I input confirm password register {string}")
    public void IInputConfirmPasswordRegister(String confirmPassword) {
        register.inputConfirmPassword(confirmPassword);
    }

    @And("I click submit register")
    public void IClickSubmitRegister() {
        register.clickSubmitRegister();
    }

    @Then("I register successfully")
    public void IRegisterSuccessfully() throws InterruptedException {
        Thread.sleep(5000);
    }

}
