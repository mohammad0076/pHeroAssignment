package stepDefinitions;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.AdditionPage.TestingApp;
import utils.ContextSetup;


public class TestSteps {

    AppiumDriver driver;
    TestingApp testingApp;
    ContextSetup setup;


    public TestSteps(ContextSetup setup) {
        this.setup = setup;
        this.testingApp = setup.pageObjectManager.getAdditionPage();
    }

        @Given("Click on Get started as guest")
    public void Click_on_Get_started_as_guest() throws InterruptedException {
        Thread.sleep(1000);
        testingApp.Guest_started().click();
        Thread.sleep(1000);
    }

    @Then("Click ok button for home page")
    public void Click_ok_button_for_home_page() throws InterruptedException {
        Thread.sleep(1000);
        testingApp.Okay_Home().click();
        Thread.sleep(1000);
    }

    @When("Click on Account Button")
    public void Click_on_Account_Button() throws InterruptedException {
        Thread.sleep(1000);
        testingApp.Account_Button().click();
        Thread.sleep(1000);
    }
    @When("Click Account ok button for Setting")
    public void Click_Account_ok_button_for_Setting() throws InterruptedException {
        Thread.sleep(1000);
        testingApp.Account_Button().click();
        Thread.sleep(1000);
    }

    @Then("Click on Setting Button")
    public void Click_on_Setting_Button() throws InterruptedException {
        Thread.sleep(1000);
        testingApp.Setting().click();
        Thread.sleep(1000);
    }


    @Then("Click on Notifications")
    public void Click_on_Notifications() throws InterruptedException {
        Thread.sleep(1000);
        testingApp.Notification().click();
        Thread.sleep(1000);
    }
//    Then Click on High/Low Prices
//    Then Click on Price Alerts
//    Then Click on Earning Results

    @Then("Click on High_Low Prices")
    public void Click_on_High_Low_Prices() throws InterruptedException {
        Thread.sleep(1000);
        testingApp.High_Low().click();
        Thread.sleep(1000);
        testingApp.High_Low().click();
        Thread.sleep(1000);
    }

    @Then("Click on Price Alerts")
    public void Click_on_Price_Alerts() throws InterruptedException {
        Thread.sleep(1000);
        testingApp.Price_Alert().click();
        Thread.sleep(1000);
        testingApp.Price_Alert().click();
        Thread.sleep(1000);
    }

    @Then("Click on Earning Results")
    public void Click_on_Earning_Results() throws InterruptedException {

        Thread.sleep(1000);
        testingApp.Earning().click();
        Thread.sleep(1000);
        testingApp.Earning().click();
        Thread.sleep(1000);
    }


    @Then("Click on Security")
    public void Click_on_Security() throws InterruptedException {

        Thread.sleep(1000);
        testingApp.Security().click();
        Thread.sleep(1000);
    }
    @Then("Click on Autoplay videos")
    public void Click_on_Autoplay_videos() throws InterruptedException {

        Thread.sleep(1000);
        testingApp.Autoplay().click();
        Thread.sleep(1000);
    }

    @Then("Click on WIFI")
    public void Click_on_WIFI() throws InterruptedException {

        Thread.sleep(1000);
        testingApp.WIFI().click();
        Thread.sleep(1000);
    }

    @Then("Click on Audio with screen of")
    public void Click_on_Audio_with_screen_of() throws InterruptedException {

        Thread.sleep(1000);
        testingApp.Audio_with_Screen().click();
        Thread.sleep(1000);
    }

    @Then("Click on on_WIFI")
    public void Click_on_on_WIFI() throws InterruptedException {

        Thread.sleep(1000);
        testingApp.on_WIFI().click();
        Thread.sleep(1000);
    }

    @Then("Click on Audio chart")
    public void Click_on_Audio_chart() throws InterruptedException {

        Thread.sleep(1000);
        testingApp.Audio_Chart().click();
        Thread.sleep(1000);
    }

    @Then("Click on Off")
    public void Click_on_Off() throws InterruptedException {

        Thread.sleep(1000);
        testingApp.Off().click();
        Thread.sleep(1000);
    }

    @Then("Click on Dark Mode")
    public void Click_on_Dark_Mode() throws InterruptedException {

        Thread.sleep(1000);
        testingApp.Dark_Mode().click();
        Thread.sleep(1000);
    }

    @Then("Click on On_Button")
    public void Click_on_Button() throws InterruptedException {

        Thread.sleep(1000);
        testingApp.Dark_Mode_On().click();
        Thread.sleep(1000);
    }

    @Then("Click regions and currencies")
    public void Click_regions_and_currencies() throws InterruptedException {

        Thread.sleep(1000);
        testingApp.Regions_and_Curr().click();
        Thread.sleep(1000);
    }

    @Then("Click on Market Regions")
    public void Click_on_Market_Regions() throws InterruptedException {

        Thread.sleep(1000);
        testingApp.Market_Region().click();
        Thread.sleep(1000);
    }

    @Then("Click on Canada")
    public void Click_on_Canada() throws InterruptedException {

        Thread.sleep(1000);
        testingApp.Canada().click();
        Thread.sleep(1000);
    }

    @Then("Click on Set Market Region")
    public void Click_on_Set_Market_Region() throws InterruptedException {

        Thread.sleep(1000);
        testingApp.Set_Market_Region().click();
        Thread.sleep(1000);
    }

    @Then("Click on Feedback")
    public void Click_on_Feedback() throws InterruptedException {

        Thread.sleep(1000);
        testingApp.Feedback().click();
        Thread.sleep(1000);
    }

    @Then("Click on Beta Program")
    public void Click_on_Beta_Program() throws InterruptedException {

        Thread.sleep(1000);
        testingApp.Beta_Program().click();
        Thread.sleep(1000);
    }

    @Then("Click on No Thanks")
    public void Click_on_No_Thanks() throws InterruptedException {

        Thread.sleep(1000);
        testingApp.Cancel().click();
        Thread.sleep(1000);
    }

    @Then("Click on News")
    public void Click_on_News() throws InterruptedException {

        Thread.sleep(1000);
        testingApp.News().click();
        Thread.sleep(1000);
    }

    @Then("Click on First News")
    public void Click_on_First_News() throws InterruptedException {

        Thread.sleep(1000);
        testingApp.First_News().click();
        Thread.sleep(1000);
    }







//    @Given("Check Toady button is availablel")
//    public void checkToadyButtonIsAvailablel() throws InterruptedException {
//        Thread.sleep(1000);
//        testingApp.google_cencel().click();
//        Thread.sleep(1000);
//        testingApp.not_now().click();
//        Thread.sleep(1000);
//        testingApp.without_subscribtion().click();
//        Thread.sleep(1000);
//        testingApp.continue_button().click();
//        Thread.sleep(1000);
//        Assert.assertTrue(testingApp.today_button().isDisplayed());
//        Thread.sleep(10000);
//    }
//
//    @When("Click  home button")
//    public void clickHomeButton() {
//        testingApp.today_button().click();
//    }
//
//
//    @Given("Check Play  button is availablel")
//    public void checkPlayButtonIsAvailablel() throws InterruptedException {
//        Thread.sleep(1000);
//        testingApp.google_cencel().click();
//        Thread.sleep(1000);
//        testingApp.not_now().click();
//        Thread.sleep(1000);
//        testingApp.without_subscribtion().click();
//        Thread.sleep(1000);
//        testingApp.continue_button().click();
//        Thread.sleep(1000);
//        Assert.assertTrue(testingApp.play_button().isDisplayed());
//        Thread.sleep(10000);
//    }
//
//    @When("Click  Play  button")
//    public void clickPlayButton() {
//        testingApp.play_button().click();
//    }
//
//    @Given("Check  For you button is availablel")
//    public void checkForYouButtonIsAvailablel() throws InterruptedException {
//        Thread.sleep(2000);
//        testingApp.google_cencel().click();
//        Thread.sleep(2000);
//        testingApp.not_now().click();
//        Thread.sleep(2000);
//        testingApp.without_subscribtion().click();
//        Thread.sleep(1000);
//        testingApp.continue_button().click();
//        Thread.sleep(2000);
//        Assert.assertTrue(testingApp.for_you_button().isDisplayed());
//        Thread.sleep(10000);
//    }
//
//    @When("Click   For you button")
//    public void clickForYouButton() {
//        testingApp.for_you_button().click();
//    }
//
//    @Given("Check  sections button is availablel")
//    public void checkSectionsButtonIsAvailablel() throws InterruptedException {
//        Thread.sleep(2000);
//        testingApp.google_cencel().click();
//        Thread.sleep(2000);
//        testingApp.not_now().click();
//        Thread.sleep(2000);
//        testingApp.without_subscribtion().click();
//        Thread.sleep(2000);
//        testingApp.continue_button().click();
//        Thread.sleep(2000);
//        Assert.assertTrue(testingApp.section_button().isDisplayed());
//        Thread.sleep(10000);
//    }
//
//    @When("Click   sections button")
//    public void clickSectionsButton() {
//        testingApp.section_button().click();
//    }
//
//    @Given("Check Search Bar button is availablel")
//    public void checkSearchBarButtonIsAvailablel() throws InterruptedException {
//        Thread.sleep(2000);
//        testingApp.google_cencel().click();
//        Thread.sleep(2000);
//        testingApp.not_now().click();
//        Thread.sleep(2000);
//        testingApp.without_subscribtion().click();
//        Thread.sleep(2000);
//        testingApp.continue_button().click();
//        Thread.sleep(2000);
//        testingApp.popup_cont().click();
//        Thread.sleep(2000);
//        testingApp.section_button().click();
//        Thread.sleep(2000);
//        Assert.assertTrue(testingApp.search().isDisplayed());
//        Thread.sleep(10000);
//
//    }
//
//    @When("Click  Search Bar button")
//    public void clickSearchBarButton() {
//        testingApp.search().click();
//    }
//
//
//    @Given("Click Profile")
//    public void clickProfile() throws InterruptedException {
//        Thread.sleep(2000);
//        testingApp.google_cencel().click();
//        Thread.sleep(2000);
//        testingApp.not_now().click();
//        Thread.sleep(2000);
//        testingApp.without_subscribtion().click();
//        Thread.sleep(2000);
//        testingApp.continue_button().click();
//        Thread.sleep(2000);
//        testingApp.popup_cont().click();
//        Thread.sleep(2000);
//        Assert.assertTrue(testingApp.profile().isDisplayed());
//        Thread.sleep(10000);
//
//    }
//
//    @Then("Check new page is display")
//    public void checkNewPageIsDisplay() throws InterruptedException {
//        testingApp.profile().click();
//        Thread.sleep(2000);
//        Assert.assertTrue(testingApp.accout_page().isDisplayed());
//    }
//
}
