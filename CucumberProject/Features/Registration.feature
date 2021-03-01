@tag
Feature: registration functionality

@tag1
Scenario:
 Given that I am navigate to https://www.takealot.com
 And click on register link
 Then complete the registration form 
    | FirstName      |  John                |
    | LastName       |  Doe                 |
    | EMail          |  qatester7@gmail.com |
    | ReTypeEmail    | qatester7@gmail.com  |
    | Password       | Password@123         | 
    | ReTypePassword | Password@123         |  
    | MobileNumber   | 07898989899          | 
    | BirthdayDay    |    7                 |
    | BirthdayMonth  |    May               |
    | BirthdayYear   |    1980              |
 And click on Register Now button
 Then user see their My Account link and their name 
 And close the browsers
 
@tag2
Scenario:
 Given that I am navigate to https://www.takealot.com
 And click on register link
 Then complete the registration form 
    | FirstName      |  John                |
    | LastName       |  Doe                 |
    | EMail          |  qatester7@gmail.com |
    | ReTypeEmail    | qatester7@gmail.com  |
    | Password       | Password@123         | 
    | ReTypePassword | Password@123         |  
    | MobileNumber   | 07898989899          | 
    | BirthdayDay    |    7                 |
    | BirthdayMonth  |    May               |
    | BirthdayYear   |    1980              |
 And click on Register Now button
 Then user see their My Account link and their name 
 And close the browsers    