package Object;

import BaseClass.BaseSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Checkout extends BaseSetUp {

    private final By buttonSneakers = new By.ByClassName("kickave-3__sneakers");
    public void clickButtonSneakers() {
        clickButton(buttonSneakers);
    }

    private final By buttonBrowseAll = new By.ByClassName("navbar-sub__browseAll");
    public void clickButtonBrowseAll() {
        clickButton(buttonBrowseAll);
    }

    private final By productSneakers = new By.ByXPath("//*[@id=\"ModalNavbar\"]/div[2]/div[2]/div[2]/div[1]/div");
    public void clickProductSneakers() {
        clickButton(productSneakers);
    }

    private final By buttonSearch = new By.ByClassName("kickave-3__search");
    public void clickButtonSearch() {
        clickButton(buttonSearch);
    }

    private final By fieldInputSearch = new By.ByXPath("//*[@id=\"ModalNavbar\"]/div[2]/div[1]/input");
    public void InputSearch(String product) {
        inputText(fieldInputSearch, product);
    }

    private final By buttonBrandNew = new By.ByXPath("//*[@id=\"new-product-detail-container\"]/div[1]/div[1]/div[1]/div[2]/div[2]/div/div/div[4]/div/div[1]/p");
    public void clickButtonBrandNew() {
        clickButton(buttonBrandNew);
    }

    private final By selectSizeSneakers = new By.ByXPath("//*[@id=\"size-parent\"]/table/tbody/div/tr[1]");
    public void clickButtonSelectSizeSneakers() {
        clickButton(selectSizeSneakers);
    }

    private final By buttonContinue = new By.ByXPath("//*[@id=\"new-product-detail-container\"]/div[1]/div[1]/div[1]/div[2]/div[2]/div/div/div[4]/div/div[2]");
    public void clickButtonContinue() {
        clickButton(buttonContinue);
    }

    private final By buttonChoosePayment = new By.ByClassName("right-bag-content-summary-button");
    public void clickButtonChoosePayment() {
        clickButton(buttonChoosePayment);
    }

    private final By BCAInstallments = new By.ByXPath("//*[@id=\"choose-payment-wrapper\"]/div/div[5]/div[2]/div[2]/p");
    public void clickBCAInstallments() throws InterruptedException {
        clickButton(BCAInstallments);
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,100)");
    }

    private final By buttonContinuePayment = new By.ById("button-2");
    public void clickButtonContinuePayment() {
        clickButton(buttonContinuePayment);
    }

}