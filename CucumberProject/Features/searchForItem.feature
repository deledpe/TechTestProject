@tag
Feature: Search functionality


Scenario Outline:  As user I want search for phones

	  Given that user is on https://www.takealot.com
	  And enter the product name as "<ItemName>"
	  Then click on search button
	  Then all the related items should be displayed
	  Then user click on add to basket and item price should be displayed
	  When user click on Got-To-Cart
	  Then user should see the items in Cart summary
	  When user click on proceed to checkout
	  Then user should prompt to login 
	  Then application should display order summary and total price
	  And close the browserb
  

   Examples:
   
     | ItemName                                 |                              
     | Garmin Forerunner 45S Sports Watch Black |
     | Garmin QuickFit 22mm Silicone Watch Band | 
  

   