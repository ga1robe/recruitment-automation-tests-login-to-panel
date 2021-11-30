package pl.nazwa.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import pl.nazwa.locators.LoginPageLocators;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;
    LoginPageLocators loginPageLocators;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        loginPageLocators = new LoginPageLocators();
        PageFactory.initElements(driver, loginPageLocators);
        wait = new WebDriverWait(driver, 10);
    }

    public void fillInLoginField(String s) {
        loginPageLocators.getClientLoginInput().sendKeys(s);
    }

    public void fillInPassField(String p) {
        loginPageLocators.getClientPassInput().sendKeys(p);
    }

    public void clickSubmitButton() {
        loginPageLocators.getSubmitBtn().click();
    }

    public String getSubInfoNewText() {
        if(loginPageLocators.getSubInfoNew().isDisplayed())
            return loginPageLocators.getSubInfoNew().getText();
        return null;
    }
}
