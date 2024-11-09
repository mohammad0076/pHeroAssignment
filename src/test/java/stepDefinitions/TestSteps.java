package stepDefinitions;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.xml.sax.Locator;
import pages.AdditionPage.TestingApp;
import utils.ContextSetup;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;


public class TestSteps {

    AppiumDriver driver;
    TestingApp testingApp;
    ContextSetup setup;


    public TestSteps(ContextSetup setup) {
        this.setup = setup;
        this.testingApp = setup.pageObjectManager.getAdditionPage();
    }


    @Given("Check that Views button is visible & Click on Views button")
    public void checkThatViewsButtonIsVisibleClickOnViewsButton() {
        WebElement viewsButton = testingApp.views();

        // Assert that the 'Views' button is visible
        Assertions.assertTrue(viewsButton.isDisplayed(), "The 'Views' button is not visible");

        // Click on the 'Views' button if it's visible
        viewsButton.click();
    }

    @Then("Scroll dynamically until Expandable Lists option is visible and select it")
    public void scrollDynamicallyUntilOptionIsVisibleAndSelectIt() {
        testingApp.scrollToAndClickExpandableLists();

    }

    @Then("Click on Custom Adapter from Expandable Lists")
    public void clickOnCustomAdapterFromExpandableLists() {
        WebElement adapter = testingApp.customAdapter();
        adapter.click();
    }

    @Then("Long Press on People Names")
    public void longPressOnPeopleNames() {
        testingApp.longPressElement();
    }

    @Then("Check that the Simple Action is visible")
    public void clickOnTheSimpleMenu() {
        WebElement simple = testingApp.simple();

        if (simple.isDisplayed()) {
            Assertions.assertTrue(simple.isDisplayed(), "The 'Simple action' button is not visible");

        } else {
            System.out.println("Not visible");
        }
        WebElement com= testingApp.com();
        com.click();

    }

    @Then("Click on Back button")
    public void clickOnBackButton() {
        testingApp.clickBackButton();
        testingApp.clickBackButton();
    }



    @And("Scroll & click on the Drag & Drop")
    public void scrollClickOnTheDragDrop() {
        By dragLocator = By.xpath("//android.widget.TextView[@content-desc='Drag and Drop']");

        boolean clicked = testingApp.scrollAndClick(dragLocator);

        if (clicked) {
            System.out.println("Element clicked successfully.");
        } else {
            System.out.println("Failed to click the element.");
        }
    }

    @And("Drag the first circle onto the second circle.")
    public void dragTheFirstCircleOntoTheSecondCircle() {
        testingApp.dragAndDropExample();


    }

}


