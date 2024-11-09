# Programming Hero Assignment (Windows Setup Guide) 🚀

A comprehensive guide to setting up and running this Appium-based project on Windows, complete with Android and IntelliJ configurations.

---

## 📋 Prerequisites
Before getting started, ensure you have the following installed:

- **Java (JDK)**: Required for development. [Download JDK](https://www.oracle.com/java/technologies/javase-downloads.html)
- **IntelliJ IDEA**: Recommended IDE for coding. [Download IntelliJ](https://www.jetbrains.com/idea/download/)
- **Maven**: Manages project dependencies. [Download Maven](https://maven.apache.org/download.cgi)

*Did you know?* 🎓 Maven automates dependency management, which reduces setup errors and helps create a more reproducible build environment.

## 📲 Android Tools
- **Node.js**: Necessary for specific Android tools. [Download Node.js](https://nodejs.org/)
- **Android Studio**:
  - Includes IDE and SDK packages.
  - Generates an Android Virtual Device (AVD) for testing.

---

## 📱 Android Device Setup
**Device Configuration**:
```properties
deviceName: "Android"
platformName: "Android"
automationName: "uiautomator2"
platformVersion: "14"



📥 Appium Setup
Appium Version: v1.17.0
Additional Apps:
Install APK Info to examine APK details.
Download and install ApiDemo-debug.apk to obtain appPackage and appActivity information.
Curious Fact! 🚀 Appium uses a JSON Wire Protocol for communication between the device and the script, making it adaptable for multiple platforms.




🔌 Appium Inspector Configuration
Configure Appium Inspector to connect to the Android device using the setup below:

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
git clone https://github.com/mohammad0076/pHeroAssignment.git

2️⃣ Run Tests
Navigate to the project directory and execute tests with:
mvn clean test -X

3️⃣ Set Up Base Capabilities
Specify the following capabilities in your code to configure the APK and device:
cap.setCapability("deviceName", "Android");
cap.setCapability("platformName", "Android");
cap.setCapability("automationName", "uiautomator2");
cap.setCapability("platformVersion", "14");
cap.setCapability("appPackage", "io.appium.android.apis");
cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");


4️⃣ Resolve Dependency Conflicts
Open pom.xml in IntelliJ.
Verify and resolve any conflicts or missing dependencies.
Use the Maven sidebar to install dependencies as needed.

🧩 Project Structure Overview
Feature Files: Located in src/test/java/features. These define the test scenarios.
Step Definitions: Implement step logic for feature files.
PageObjectManager: Manages page objects and actions.
TestingApp: Configures and sets up initial test parameters.


5️⃣ Run Test Suite
Execute the test suite by running testing.xml:
mvn test -Dsurefire.suiteXmlFiles=src/test/resources/testing.xml
