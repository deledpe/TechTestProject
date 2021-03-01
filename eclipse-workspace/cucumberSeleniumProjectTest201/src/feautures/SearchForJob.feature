@tag
Feature: Title of your feature

  @tag1
  Scenario: Job search using dynamic data
  Given that user is on https://jobserve.co.uk
  When I enter the job title Software testing and job location London. Click search button
  When I should see the number of the jobs find  and the job title
  And close the browser

 


