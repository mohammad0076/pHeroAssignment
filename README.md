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
