Feature: Validate Yahoo Finance News

  @MobileTest
  Scenario: Validate Login Using Guest
  Given Click on Get started as guest
  Then Click ok button for home page


  @MobileTest
  Scenario: Validate Account Configuration
    Given Click on Get started as guest
    Then Click ok button for home page
    When Click on Account Button
    Then Click Account ok button for Setting


  @MobileTest
  Scenario: Validate Setting Button
    Given Click on Get started as guest
    Then Click ok button for home page
    When Click on Account Button
    Then Click Account ok button for Setting
    Then Click on Setting Button


  @MobileTest
  Scenario: Validate Notification Configuration
    Given Click on Get started as guest
    Then Click ok button for home page
    When Click on Account Button
    Then Click Account ok button for Setting
    Then Click on Setting Button
    Then Click on Notifications


    @MobileTest
  Scenario: Validate Notification on Market Data Alerts
    Given Click on Get started as guest
    Then Click ok button for home page
    When Click on Account Button
    Then Click Account ok button for Setting
    Then Click on Setting Button
    Then Click on Notifications
    Then Click on High_Low Prices
    Then Click on Price Alerts
#    Then Click on Earning Results

  @MobileTest
  Scenario: Validate Security Button
    Given Click on Get started as guest
    Then Click ok button for home page
    When Click on Account Button
    Then Click Account ok button for Setting
    Then Click on Setting Button
    Then Click on Security

  @MobileTest
  Scenario: Validate Autoplay Videos
    Given Click on Get started as guest
    Then Click ok button for home page
    When Click on Account Button
    Then Click Account ok button for Setting
    Then Click on Setting Button
    Then Click on Autoplay videos

  @MobileTest
  Scenario: Validate Autoplay Videos Configuration
    Given Click on Get started as guest
    Then Click ok button for home page
    When Click on Account Button
    Then Click Account ok button for Setting
    Then Click on Setting Button
    Then Click on Autoplay videos
    Then Click on WIFI

  @MobileTest
  Scenario: Validate Audio With Screen off Configuration
    Given Click on Get started as guest
    Then Click ok button for home page
    When Click on Account Button
    Then Click Account ok button for Setting
    Then Click on Setting Button
    Then Click on Audio with screen of
    Then Click on on_WIFI

  @MobileTest
  Scenario: Validate Audio chart Configuration
    Given Click on Get started as guest
    Then Click ok button for home page
    When Click on Account Button
    Then Click Account ok button for Setting
    Then Click on Setting Button
    Then Click on Audio chart
    Then Click on Off

  @MobileTest
  Scenario: Validate Dark Mode Configuration
    Given Click on Get started as guest
    Then Click ok button for home page
    When Click on Account Button
    Then Click Account ok button for Setting
    Then Click on Setting Button
    Then Click on Dark Mode
    Then Click on On_Button

  @MobileTest
  Scenario: Validate Regions and Currencies Configuration
    Given Click on Get started as guest
    Then Click ok button for home page
    When Click on Account Button
    Then Click Account ok button for Setting
    Then Click on Setting Button
    Then Click regions and currencies
    Then Click on Market Regions
    Then Click on Canada
    Then Click on Set Market Region

  @MobileTest
  Scenario: Validate Feedback Option
    Given Click on Get started as guest
    Then Click ok button for home page
    When Click on Account Button
    Then Click Account ok button for Setting
    Then Click on Setting Button
    Then Click on Feedback
    Then Click on Beta Program
    Then Click on No Thanks

  @MobileTest
  Scenario: Validate News Button
    Given Click on Get started as guest
    Then Click ok button for home page
    When Click on News
    Then Click on First News



