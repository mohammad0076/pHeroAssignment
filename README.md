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









# Automation Strategy with Cucumber & POM

## Core Approach
This strategy utilizes the **Page Object Model (POM)** and **Cucumber BDD** framework to enhance test readability, reusability, and maintainability. POM encapsulates page elements and actions, while Cucumber allows for natural language test scenarios that improve collaboration and clarity for non-technical stakeholders.

## Key Components

### Page Object Model (POM) Structure
- **Modular Design**: POM separates test logic from UI element definitions by creating dedicated classes for each page or screen. Each class contains locators and methods for interacting with elements, making the code modular and easy to maintain.
- **Efficient Maintenance**: This structure allows updates to be made in a single page class if the UI changes, rather than across multiple test cases.

### Cucumber with Gherkin Syntax
- **Readable Scenarios**: Cucumber enables writing test scenarios in clear, natural language format using Gherkin syntax, making expected behavior accessible to technical and non-technical team members alike.
- **Executable Steps**: Step Definitions translate Gherkin scenarios into executable code, ensuring alignment between requirements and test cases and providing understandable documentation.

## Locator Strategy

### Versatile Locator Strategy
- **Multiple Locator Options**: Using a mix of locators (e.g., `id`, `xpath`, `class`, `content-desc`) ensures that the most effective selector is used for each element. Versatile locators also provide fallback options if primary locators become unreliable due to UI changes.
- **Dynamic Locator Handling**: In cases where dynamic elements or index-based locators are required, alternative strategies are used to enhance the robustness of tests.

## Enhanced Strategies for Automation

### Dynamic Element Handling
- **Scrolling and Waiting Mechanisms**: The POM structure includes methods like `waitUntilVisible` and `scrollToElement`, ensuring elements are ready for interaction even with screen content changes.

### Reusability Through Step Definitions
- **Reusable Actions**: Common actions (e.g., clicking, scrolling, validation) are defined in Step Definitions, reducing repetitive code and improving test case maintainability.

### Error Handling and Robustness
- **Graceful Failure Handling**: Error handling within POM and Step Definitions provides retries and increased waits if elements are not immediately visible, minimizing interruptions.

### Consistent Test Execution
- **Setup and Teardown with Hooks**: Cucumber hooks (`@Before` and `@After`) ensure each test begins with a consistent state, reducing test flakiness.

## Challenges & Solutions

### UI Changes and Locator Stability
- **POM Flexibility**: Using versatile locators within POM classes enables quick updates when UI elements change, limiting maintenance to specific classes.

### Reducing Test Flakiness
- **Explicit Waits**: Integrated waits within POM and modular Step Definitions ensure actions proceed only when elements are interactable, improving reliability.

## Conclusion
This automation strategy with **Cucumber and POM** supports maintainable, readable, and reliable test automation. By combining Cucumber's scenario clarity with POM's modular structure, this approach adapts well to changes, promotes collaboration, and delivers a robust, end-to-end testing framework for Android automation.





# 🎥 Demonstration Video
👉 [Watch Test Suite Execution Video](https://www.awesomescreenshot.com/video/33435100?key=b0b9b9119914af02568be0f05b6e56e9)


