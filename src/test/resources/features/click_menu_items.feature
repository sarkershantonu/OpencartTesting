Feature: Click all menu items

  Scenario: User wants to goto a menu item link from drop down
    Given I open <browser> browser
    When I click DeskTops & click See All Desktops
    Then I quit browser
