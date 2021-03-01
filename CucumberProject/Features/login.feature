@tag
Feature: Login functionality


Scenario Outline: As a user I want to login 
   Given that I am on https://www.takealot.com
   And click on login link
   And enter the EmailAddress as "<EmailAddress>" and Password as "<password>"
   And click on login button
   Then application should display MyAccount and the account holder name.
   And close the browser
    
    
    Examples:
        
        | EmailAddress       | password      | 
        | deledpe@gmail.com  | Password@1    |
	    | ooooo@gmail.com    | password234   |
	    | password234        |  xyz          |
	    | $$£%%^%^^^&        | password234   |