Feature: Compatibility checks

  Scenario Outline: Open URL and go to different links
    Given I open <browser> browser
    When I type http://demo.opencart.com/ and press enter
    Then I can see page loaded with title "Your Store"
    And I type "<keyword>" in search box And I click search button
    Then I can see search results with title "Search - <keyword>"
    And I can see the search should not take more than <time> second
    Then I quit browser
    Examples:
      | browser | keyword    | time |
      | chrome | laptop     | 25   |
      | chrome  | Iphone     | 20   |
      | chrome | xeonServer | 20   |

