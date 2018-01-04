Feature: testing if all the fields are appeared on home page 

Scenario: verify fields on homepage 
Given I am on Google homepage
Then I should verify links below
|linkSelector|linkText|
|//*[@id="gbw"]/div/div/div[1]/div[1]/a|Gmail|
|//*[@id="gbw"]/div/div/div[1]/div[2]/a|Images|
And I verify Google search "#lst-ib"field
