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
