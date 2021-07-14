package TestStep;

import BaseClass.BaseStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutStep extends BaseStep {


    @When("I want to checkout")
    public void IWantToCheckout() {
    }

    @And("I click sneakers")
    public void IClickSneakers() {
        checkout.clickButtonSneakers();
    }

    @And("I click browse all")
    public void IClickBrowseAll() {
        checkout.clickButtonBrowseAll();
    }

    @And("I click search")
    public void IClickSearch() {
        checkout.clickButtonSearch();
    }

    @And("I search {string}")
    public void ISearch(String product) throws InterruptedException {
        checkout.InputSearch(product);
        Thread.sleep(3000);
    }

    @And("I click adidas nmd r1 black olive")
    public void IClickAdidasNmdR1BlackOlive() throws InterruptedException {
        checkout.clickProductSneakers();
        Thread.sleep(3000);
    }

    @And("I click brand new")
    public void IClickBrandNew() {
        checkout.clickButtonBrandNew();
    }

    @And("I select size")
    public void ISelectSize() {
        checkout.clickButtonSelectSizeSneakers();
    }

    @And("I click continue")
    public void IClickContinue() throws InterruptedException {
        checkout.clickButtonContinue();
        Thread.sleep(2000);
    }

    @And("I click choose payment")
    public void IClickChoosePayment() {
        checkout.clickButtonChoosePayment();
    }

    @And("I click bca installments")
    public void IClickBCAInstallments() throws InterruptedException {
        checkout.clickBCAInstallments();
        Thread.sleep(3000);
    }

    @And("I click continue payment")
    public void IClickContinuePayment() {
        checkout.clickButtonContinuePayment();
    }

    @Then("I checkout successfully")
    public void ICheckoutSuccessfully() throws InterruptedException {
        Thread.sleep(5000);
    }

}
