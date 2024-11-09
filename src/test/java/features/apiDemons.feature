Feature: Validate API Demos apk #1

  @MobileTest
  Scenario: Launch the ApiDemos-debug.apk onan emulator
    Given Check that Views button is visible & Click on Views button
    Then Scroll dynamically until Expandable Lists option is visible and select it
    Then Click on Custom Adapter from Expandable Lists
    Then Long Press on People Names
    Then Check that the Simple Action is visible
    Then Click on Back button
    And Scroll & click on the Drag & Drop
    And Drag the first circle onto the second circle.


