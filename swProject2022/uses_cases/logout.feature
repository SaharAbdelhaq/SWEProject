Feature: Admin logout
Background: The System needs to have users and Books
Given these are the users we will but it in the table as a format User(Name,password,user_level,status) noting that user level one is Admin and user level two is a normal user and status indicates whether user is logged in or not
|Aya,aya123,1,true|
|Sahar,1234,1,false|
|Hala,ho123,2,false|

Scenario: Logout
When Admin "Aya" is already logged in and Admin press logout
Then System will exit 