Feature: Add appointments
Background: The System needs to have users and appointments
Given these are the users we will but it in the table as a format User(Name,password,user_level,status) noting that user level 1 is Admin and user level 2 is a  user and status indicates whether user is logged in or not
|Aya,aya123,1,false|
|Sahar,1234,1,true|
|Hala,ho123,2,true|
|Tala,abc41,2,false|

Given these are appointments and we will but it in the table as format appointment(Date,Time,Aid,Booked)
     
     
|20/10/2022,10:00AM,1003327634,true|
|22/10/2022,11:00AM,1250114292,false|
|22/10/2022,11:00AM,1250117584,false|


Scenario: Add an appointment when admin is logged in
When Admin with username "Sahar" is already logged in add a appointment with  "23/10/2022" and Time "3:00PM" and Aid "1257234266" and Booked "false" 
Then appointment will be added


Scenario: Add an appointment when admin is not logged in
When Admin with username "aya" is not logged in and try to add appointment
Then appointment should be not added
 
 
