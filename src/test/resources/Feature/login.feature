Feature: To validate the login functionality
Background: 
Given the user in Wesendit free
Scenario Outline: To validate the login page with valid credentials
When the user enter the valid userName and Password "<userName>"and "<password>"
And The user navigate to the next page
Examples:
|userName|password|
|khykfxka.a23@20minutemail.it|password|
Scenario Outline: To change the Password
When the user enter the userName and Password "<UserName>" and "<Password>"
Then password is changed
Examples:
|UserName|Password|
|onlyformaydummy123@gmail.com|Qwer@1234|

