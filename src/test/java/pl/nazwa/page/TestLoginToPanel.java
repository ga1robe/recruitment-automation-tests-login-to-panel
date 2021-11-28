package pl.nazwa.page;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pl.nazwa.supports.FileMethod;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestLogintoPanel {

    private WebDriver driver;

    @Before
    public void setUp(){
//        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.nazwa.pl/panel/zaloguj-sie.html");
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
        FileMethod.createFile();
    }

    @Test
    public void shouldTryToLoginTests() {
        // Given
        // Arrange
        LoginPage loginPage = new LoginPage(driver);
        // When
        // Act
        loginPage.fillInLoginField("test.name");
        loginPage.fillInPassField("password");
        // When
        // Act
        loginPage.clickSubmitButton();
        String failMessage = loginPage.getSubInfoNewText();
        System.out.println("failMessage: " + failMessage);
        // Then
        // Assert
        assertThat("It does not contain " + "\'Nieprawidłowy login lub hasło\'", failMessage, containsString("Nieprawidłowy login lub hasło"));
        // When
        // Act
//        exercise1Page.pressSolutionButton();
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        String trialText2 = exercise1Page.getTrialText();
//        System.out.println("[trialText] = " + trialText2);
        // Then
        // Assert
//        assertThat("Is does not contain " + "\'OK. Good answer\'", trialText2, containsString("OK. Good answer"));
        // Write to file
//        FileMethod.writeToFile("TestExercise1: " + "ShouldThreeButtonsAction: " + "\n" +
//                "trial : \'" + trialText + "\'\n" +
//                "after press button 'Check Solution' trial: \'" + trialText2 + "\'" +
//                ""
//        );
    }

    @After
    public void tearDown(){

        driver.quit();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        FileMethod.closeWriter();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
