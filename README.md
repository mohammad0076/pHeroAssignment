# Programming Hero (Windows Setup Guide)

## Prerequisites
- **Java (JDK)**: Download and install.
- **IntelliJ IDEA**: Install for code development.
- **Maven**: Install to manage dependencies.

## Android Tools
- **Node.js**: Download and install.
- **Android Studio**: Install for:
  - IDE and SDK packages.
  - Generating a virtual device.

## Android Device Setup
- **Device Details**:
  - `deviceName`: "Android"
  - `platformName`: "Android"
  - `automationName`: "uiautomator2"
  - `platformVersion`: "14"

## Appium
- **Version**: v1.17.0
- **Additional Apps**:
  - Install `APK Info` to view APK details.
  - Download & install `ApiDemo-debug.apk` to obtain the app’s package and activity details.

## Appium Inspector Connection
Use the following configuration for connecting to the Android device with Appium Inspector:
```json
{
  "platformName": "Android",
  "appium:automationName": "uiautomator2",
  "appium:deviceName": "Pixel 2 API UpsideDownCakePrivacySandbox",
  "appPackage": "io.appium.android.apis",
  "appActivity": "io.appium.android.apis.ApiDemos"
}


1.##Clone Repository
Clone the repository to your local machine: git clone https://github.com/mohammad0076/pHeroAssignment.git



2.##Run Tests:-
mvn clean test -X
Set Up Base Capabilities (Specify APK and device configurations):

cap.setCapability("deviceName", "Android");
cap.setCapability("platformName", "Android");
cap.setCapability("automationName", "uiautomator2");
cap.setCapability("platformVersion", "14");
cap.setCapability("appPackage", "io.appium.android.apis");
cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");


3.##Resolve Dependency Conflicts:
Open pom.xml.
Verify dependencies, and install missing ones by using the Maven sidebar on the right.

4.## Test Structure Overview
Feature Files: Located in src/test/java/features.
Run individual feature files as needed.
Step Definitions: Define steps linked to feature files.
PageObjectManager: Manages page interactions and objects for testing.
TestingApp: Includes configurations and test setup.

5##Run Test Suite
Execute the test suite by running testing.xml in XML\testing.xml.

6 ##My suit run video:-https://www.awesomescreenshot.com/video/33435100?key=b0b9b9119914af02568be0f05b6e56e9
