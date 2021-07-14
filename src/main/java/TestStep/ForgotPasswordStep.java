package TestStep;

import BaseClass.BaseStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ForgotPasswordStep extends BaseStep {

    @When("I want to use forgot password")
    public void IWantToUseForgotPassword() {

    }

    @And("I click forgot password")
    public void IClickForgotPassword() {
        forgotPassword.clickButtonForgotPassword();
    }

    @And("I input email forgot password {string}")
    public void IInputEmailForgotPassword(String email) {
        forgotPassword.inputFieldEmailForgotPassword(email);
    }

    @And("I click send reset link")
    public void IClickSendResetLink() {
        forgotPassword.clickButtonSendResetLink();
    }

    @Then("I use forgot password successfully")
    public void IUseForgotPasswordSuccessfully() throws InterruptedException {
        Thread.sleep(3000);
    }

}
