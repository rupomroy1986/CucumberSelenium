Feature: Application Login 
#regular expression
#background is used for common test cases
#hooks is used if there are multiple test cases


@Regression
Scenario: Home page default login
Given User is on the landing page
When User login into the application with "rupom" and "rupom123"
Then Home page is populated
And cards are displayed are "true"

@MobileTest
Scenario: Home page default login
Given User is on the landing page
When User login into the application with "victor" and "victor123"
Then Home page is populated
And cards are displayed are "false"

@Regression
Scenario: Home page default login
Given User is on the landing page
When User sign up with following details
|rupom	|xyz	|rupomroy@gmail.com	|kohima	|bangalore	|
Then Home page is populated
And cards are displayed are "false"

@Smoke
Scenario Outline: Home page default login
Given User is on the landing page
When User login into the application with "<username>" and "<password>"
Then Home page is populated
And cards are displayed are "true"

Examples:
|username	|password	|
|seo	|india	|
|digital	|nagaland	|

