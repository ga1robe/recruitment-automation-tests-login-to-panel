package pl.nazwa.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {

    @FindBy(xpath = "//*/input[@id=\"clientLogin\"]")
    private WebElement clientLoginInput;

    @FindBy(xpath = "//*/input[@id=\"clientPass\"]")
    private WebElement clientPassInput;

    @FindBy(xpath = "//*/input[@id=\"__submit_PK_M0118\"]")
    private WebElement submitBtn;

    @FindBy(xpath = "//*/div[@id=\"PK_M0118\"]/div/table/tbody/tr[1]/td[@class = \"sub_info_new_msg\"]/div[@class = \"message-text\"]")
    private WebElement subInfoNew;

    /*
        GETTERS to login, pass, button inputs.
     */

    public WebElement getClientLoginInput() {
        return clientLoginInput;
    }

    public WebElement getClientPassInput() {
        return clientPassInput;
    }

    public WebElement getSubmitBtn() {
        return submitBtn;
    }

    public WebElement getSubInfoNew() {
        return subInfoNew;
    }
}
