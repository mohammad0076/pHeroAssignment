Programming Hero Assignment (Windows Setup Guide) 🚀
Follow this guide to set up and run the project on Windows, leveraging Appium and Android for a seamless testing environment.

📋 Prerequisites
Ensure the following software is installed on your system:

Java (JDK): Required for development. Download JDK
IntelliJ IDEA: Recommended IDE for code development. Download IntelliJ
Maven: Used for managing project dependencies. Download Maven
📲 Android Tools
Node.js: Required for some Android tools. Download Node.js
Android Studio:
Includes IDE, SDK packages, and emulator capabilities.
Generate an Android Virtual Device (AVD) for testing.
📱 Android Device Setup
Device Configuration:

properties
Copy code
deviceName: "Android"
platformName: "Android"
automationName: "uiautomator2"
platformVersion: "14"
📥 Appium Setup
Version: Appium v1.17.0
Additional Apps:
Install APK Info for viewing APK details.
Download and install ApiDemo-debug.apk to acquire appPackage and appActivity details.
🔌 Appium Inspector Configuration
Use the configuration below to connect to the Android device with Appium Inspector:

json
Copy code
{
  "platformName": "Android",
  "appium:automationName": "uiautomator2",
  "appium:deviceName": "Pixel 2 API UpsideDownCakePrivacySandbox",
  "appPackage": "io.appium.android.apis",
  "appActivity": "io.appium.android.apis.ApiDemos"
}
🛠️ Project Setup & Execution
1️⃣ Clone the Repository
Clone the project repository to your local machine:

bash
Copy code
git clone https://github.com/mohammad0076/pHeroAssignment.git
2️⃣ Run Tests
Navigate to the project directory and run tests with:

bash
Copy code
mvn clean test -X
3️⃣ Set Up Base Capabilities
In your code, specify the following capabilities to configure the APK and device:

java
Copy code
cap.setCapability("deviceName", "Android");
cap.setCapability("platformName", "Android");
cap.setCapability("automationName", "uiautomator2");
cap.setCapability("platformVersion", "14");
cap.setCapability("appPackage", "io.appium.android.apis");
cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
4️⃣ Resolve Dependency Conflicts
Open pom.xml in IntelliJ.
Check for any conflicts or missing dependencies.
Use the Maven sidebar to install necessary dependencies.
🧩 Project Structure Overview
Feature Files: Located in src/test/java/features. These files define test scenarios.
Step Definitions: Implement steps linked to feature files.
PageObjectManager: Manages page objects for test actions.
TestingApp: Contains configurations and initial test setup.
5️⃣ Run Test Suite
To execute the test suite, run testing.xml:

bash
Copy code
mvn test -Dsurefire.suiteXmlFiles=src/test/resources/testing.xml
🎥 Demonstration Video
👉 Watch Test Suite Execution Video

This guide should help you seamlessly set up and run the project on your Windows machine. Happy Testing! 🚀
