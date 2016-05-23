Assignment 1 - Selenium POM

Objective:
Write a suite of three automated browser tests for http://store.demoqa.com 

Requirements:
Use Selenium 2.0 (aka WebDriver): http://docs.seleniumhq.org/projects/webdriver/
Tests must implement the page objects pattern: http://code.google.com/p/selenium/wiki/PageObjects
You can write your tests in any language WebDriver supports

Write a test to:
Submit an order for an Apple iPhone4s 16GB SIM-Free – Black (known issue with State drop-down, selecting Country is adequate) and verify the Total Price: given is correct (assume shipping cost is correct based on your choice). You may assume prices shown on product pages are the correct price. - Completed
Verify updating your account details is saved and retrieved after logging out and back in using the My Account link. - Unable to register a user - No sufficient data
Verify removing all items from your cart produces an empty cart message. - Completed


Recreate the environment:
To create the environment, user just need to pull the code and add the below selenium standalone server jar file and configure to build path.
http://goo.gl/IHP6Qw

Limitations and future scope:
1. Only Firefox browser is configured, can be upgraded to multi browser support
2. Can add the exception handling and logging, error screen shot reporting and video recording
3. Can add the base file with all keywords handling the major operations along with Wait functionalities

