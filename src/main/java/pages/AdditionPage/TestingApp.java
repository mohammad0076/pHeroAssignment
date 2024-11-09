package pages.AdditionPage;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static java.time.Duration.ofMillis;

public class TestingApp {

    public AppiumDriver driver;


    By views = By.xpath("//android.widget.TextView[@content-desc=\"Views\"]");
    By expandable = By.xpath("//android.widget.TextView[@content-desc=\"Expandable Lists\"]");
    By customAdapter = By.xpath("//android.widget.TextView[@content-desc=\"1. Custom Adapter\"]");
    By people = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ExpandableListView/android.widget.TextView[1]");
    By simple = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.FrameLayout/android.widget.TextView");
    By com = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView");






    public TestingApp(AppiumDriver driver) {
        this.driver = driver;
    }


    public WebElement views() {
        return driver.findElement(views);
    }

    public WebElement com() {
        return driver.findElement(com);
    }

    public WebElement customAdapter() {
        return driver.findElement(customAdapter);
    }

    public WebElement exp() {
        return driver.findElement(expandable);
    }

    public WebElement People() {
        return driver.findElement(people);
    }

    public WebElement simple() {
        return driver.findElement(simple);
    }

    public WebElement waitForExpandableToBeVisible(int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(expandable));
    }

    public WebElement drag() {
        return waitForExpandableToBeVisible(10); //
    }

    public WebElement expandable() {
        return waitForExpandableToBeVisible(10); // Example with a 10-second timeout
    }


    public boolean scrollToAndClickElement(By locator) {
        while (true) {
            try {
                // Attempt to locate the element
                WebElement element = driver.findElement(locator);

                // Check if the element is displayed, then click and return true
                if (element.isDisplayed()) {
                    element.click();
                    System.out.println("Element found and clicked.");
                    return true;
                }
            } catch (Exception e) {
                // Scroll down if the element is not found in view
                ((AndroidDriver) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
                        "direction", "up",
                        "percent", 0.8
                ));
            }
        }
    }





    public void scrollToAndClickExpandableLists() {
        // Define the locator for the "Expandable Lists" element
        By expandable = By.xpath("//android.widget.TextView[@content-desc='Expandable Lists']");

        // Define an explicit wait with a timeout
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Loop to keep scrolling until the element is found and clicked
        while (true) {
            try {
                // Wait until the "Expandable Lists" element is visible
                WebElement expandableElement = wait.until(ExpectedConditions.visibilityOfElementLocated(expandable));

                // Click the element if it's visible
                expandableElement.click();
                System.out.println("Found and clicked 'Expandable Lists'.");
                break; // Exit the loop once clicked

            } catch (Exception e) {
                // Scroll down if the element is not visible
                scrollDownS();
            }
        }
    }

    private void scrollDownS() {
        // Calculate swipe positions for scrolling
        int startX = driver.manage().window().getSize().width / 2;
        int startY = (int) (driver.manage().window().getSize().height * 0.8);
        int endY = (int) (driver.manage().window().getSize().height * 0.3);

        // Perform swipe action for scrolling down
        new TouchAction<>((PerformsTouchActions) driver)
                .press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500))) // Shortened wait for faster scrolls
                .moveTo(PointOption.point(startX, endY))
                .release()
                .perform();
    }


    public boolean scrollAndClick(By locator) {
        return scrollToAndClickElement(locator);
    }


    public WebElement longPressElement() {
        // Find the element using the locator (assuming 'people' is your XPath or other locator string)
        WebElement element = driver.findElement(people);  // Replace 'people' with your correct locator

        // Perform long press action
        new Actions(driver)
                .clickAndHold(element)   // Click and hold the element (long press)
                .pause(Duration.ofSeconds(2))  // Hold for 2 seconds
                .release()                // Release the element
                .perform();               // Execute the action

        // Return the element after the long press action
        return element;
    }

    public void scrollToExpandableAndClick() {
        while (true) {
            try {
                // Check if the expandable element is visible and clickable
                WebElement expandableElement = waitForExpandableToBeVisible(3); // Short timeout for quicker looping
                if (expandableElement.isDisplayed()) {
                    expandableElement.click();
                    System.out.println("Expandable Lists option found and clicked.");
                    break;
                }
            } catch (Exception e) {
                // Scroll down if element is not yet visible
                scrollDown();
            }
        }
    }
    private void scrollDown() {
        if (driver instanceof AndroidDriver) {
            ((AndroidDriver) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
                    "direction", "up",
                    "percent", 0.8
            ));
        }
    }

    public boolean clickBackButton() {
        driver.navigate().back();
        return true;
    }

    public boolean isElementVisible(By locator) {
        try {
            WebElement element = driver.findElement(locator);
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }



    // Method for drag and drop with hold
    public void dragAndDropExample() {
        // Safe cast to AndroidDriver
        if (driver instanceof AndroidDriver androidDriver) {

            By dragLocator = By.id("io.appium.android.apis:id/drag_dot_1");
            By dropLocator = By.id("io.appium.android.apis:id/drag_dot_2");

            if (isElementVisible(dragLocator) && isElementVisible(dropLocator)) {
                WebElement dragElement = androidDriver.findElement(dragLocator);
                WebElement dropElement = androidDriver.findElement(dropLocator);

                // Perform drag and hold for 3 seconds
                new TouchAction(androidDriver)
                        .longPress(PointOption.point(dragElement.getLocation().getX(), dragElement.getLocation().getY()))
                        .waitAction(waitOptions(ofMillis(300)))  // Hold for 3 seconds
                        .moveTo(PointOption.point(dropElement.getLocation().getX(), dropElement.getLocation().getY()))
                        .release()
                        .perform();
            } else {
                System.out.println("Either drag or drop element is not visible.");
            }
        } else {
            System.out.println("Driver is not an instance of AndroidDriver.");
        }
    }

    }



