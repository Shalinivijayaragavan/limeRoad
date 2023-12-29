@tag1
Feature: limeroad order

  Scenario: To click shop men
    When user launch the url "https://www.limeroad.com/"
    And user clicks on shop men

  Scenario: Search women dress and add to cart
    When User search the shirts in search box
    Then Select one shirt
    And change the size as large
    And Add to cart
    Then Remove the item cart

  Scenario: Mouse Hover to Homes in WebPage
    When User clik on Homes
    Then Select pillow covers
    And Add to cart
    Then Change the quantity
    Then Go to home page
