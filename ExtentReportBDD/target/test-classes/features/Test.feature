
Feature: Login Feature

  @tag1
  Scenario: Amazon Login Test Case
    Given user is opening the web browser
    And Navigate to the URL of "https://www.amazon.in/"
    Then Verify that the homepage of Amazon.in is displayed correctly.
    When user Click on the "Sign In" button/link.
    Then user Enter valid login credentials
    When user Click on the "Sign-In" button.
    And Verify that the user is successfully logged in and redirected to the homepage.
    Then In the search bar, search "Samsung 80 cm (32 Inches) Wondertainment Series HD Ready LED Smart TV UA32T4340BKXXL (Glossy Black)"
    Then verify the product text and price
    
    

