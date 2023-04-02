#@wip
Feature: user should be able to log in with valid credentials

  Background:
    Given The user is on the login page

  Scenario Outline: Login positive test

    When The user enters "<valid username>" and "<valid password>" credentials
    Then The user should be able to login swaglabs web site
    Examples:
      | valid username          | valid password |
      | standard_user           | secret_sauce   |
      | problem_user            | secret_sauce   |
      | performance_glitch_user | secret_sauce   |

  Scenario Outline: Login negative test

    When The user enters invalid or empty "<username>" or "<password>" credentials
    Then The user should be able to see "<error message>"
    Examples:
      | username        | password     | error message                                                             |
      | locked_out_user | secret_sauce | Epic sadface: Sorry, this user has been locked out.                       |
      | standard_user   | sec_sauce    | Epic sadface: Username and password do not match any user in this service |
      |                 | secret_sauce | Epic sadface: Username is required                                        |
      | problem_user    |              | Epic sadface: Password is required                                        |
      |                 |              | Epic sadface: Username is required                                        |

  Scenario Outline: Login negative test 2

    When The user enters "<valid username>" and "<invalid password>" credentials
    Then The user should not be able to login swaglabs web site
    Examples:
      | valid username          | invalid password |
      | standard_user           | 1234             |
      | problem_user            | 1234             |
      | performance_glitch_user | 1234             |

  Scenario Outline: Login negative test 3

    When The user enters "<invalid username>" and "<invalid password>" credentials
    Then The user should not be able to login swaglabs web site
    Examples:
      | invalid username         | invalid password |
      | 1standard_user           | 1234             |
      | 1problem_user            | 1234             |
      | 1performance_glitch_user | 1234             |