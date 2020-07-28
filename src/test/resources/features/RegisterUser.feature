Feature: Filling the Registration Form of Mercury Tours

  Background: User Navigates to Mercury Registration Page
    Given User is on Mercury Home Page --> Registration Page

    Scenario: User Fills the Registration Form
      Given User Fills First Name as "Nethmini"
      And User Fills Last Name as "Senanayake"
      And User Fills Phone Number as "06 55 563 091"
      And User Fills Email as "david.p.91@malinator.com"
      And User Fills User Name as "david.p.91@malinator.com"
      And User Fills Passoword as "Nethmini@123"
      And User Fills Confrim Password as "Nethmini@123"
      When User Clicks on Submit Button
      Then Note should denote your User Name is "david.p.91@malinator.com"