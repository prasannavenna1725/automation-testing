Feature: login_page

Scenario:login is successfull

Given browser1 is open
When enter login details<username> and <password>
And browser1 is login
Then page is navigated to website


Example:
|username||password|
|standard_user||secret_sauce|