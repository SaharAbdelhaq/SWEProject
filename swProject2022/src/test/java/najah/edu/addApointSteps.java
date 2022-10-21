package najah.edu;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addApointSteps {

	/*Scenario: Add an appointment when admin is logged in                                                                                                                                                                          # uses_cases/AddApoint.feature:17
	  Given these are the users we will but it in the table as a format User(Name,password,user_level,status) noting that user level 1 is Admin and user level 2 is a  user and status indicates whether user is logged in or not
	    | Aya,aya123,1,false |
	    | Sahar,1234,1,true  |
	    | Hala,ho123,2,true  |
	    | Tala,abc41,2,false |
	  Given these are appointments and we will but it in the table as format appointment(Date,Time,Aid,Booked)
	    | 20/10/2022,10:00AM,1003327634,true  |
	    | 22/10/2022,11:00AM,1250114292,false |
	    | 22/10/2022,11:00AM,1250117584,false |
	  When Admin with username "Sahar" is already logged in add a appointment with  "23/10/2022" and Time "3:00PM" and Aid "1257234266" and Booked "false"
	  Then appointment will be added

	Scenario: Add an appointment when admin is not logged in                                                                                                                                                                      # uses_cases/AddApoint.feature:22
	  Given these are the users we will but it in the table as a format User(Name,password,user_level,status) noting that user level 1 is Admin and user level 2 is a  user and status indicates whether user is logged in or not
	    | Aya,aya123,1,false |
	    | Sahar,1234,1,true  |
	    | Hala,ho123,2,true  |
	    | Tala,abc41,2,false |
	  Given these are appointments and we will but it in the table as format appointment(Date,Time,Aid,Booked)
	    | 20/10/2022,10:00AM,1003327634,true  |
	    | 22/10/2022,11:00AM,1250114292,false |
	    | 22/10/2022,11:00AM,1250117584,false |
	  When Admin with username "aya" is not logged in and try to add appointment
	  Then appointment should be not added

	Undefined scenarios:
	file:///C:/Users/Sahar/git/SWEProject/swProject2022/uses_cases/AddApoint.feature:17 # Add an appointment when admin is logged in
	file:///C:/Users/Sahar/git/SWEProject/swProject2022/uses_cases/AddApoint.feature:22 # Add an appointment when admin is not logged in

	2 Scenarios (2 undefined)
	8 Steps (6 skipped, 2 undefined)
	0m0.515s


	You can implement missing steps with the snippets below:
*/
	
	
	@Given("these are the users we will but it in the table as a format User\\(Name,password,user_level,status) noting that user level {int} is Admin and user level {int} is a  user and status indicates whether user is logged in or not")
	public void these_are_the_users_we_will_but_it_in_the_table_as_a_format_user_name_password_user_level_status_noting_that_user_level_is_admin_and_user_level_is_a_user_and_status_indicates_whether_user_is_logged_in_or_not(Integer int1, Integer int2, io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    throw new io.cucumber.java.PendingException();
	}

	@Given("these are appointments and we will but it in the table as format appointment\\(Date,Time,Aid,Booked)")
	public void these_are_appointments_and_we_will_but_it_in_the_table_as_format_appointment_date_time_aid_booked(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin with username {string} is already logged in add a appointment with  {string} and Time {string} and Aid {string} and Booked {string}")
	public void admin_with_username_is_already_logged_in_add_a_appointment_with_and_time_and_aid_and_booked(String string, String string2, String string3, String string4, String string5) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("appointment will be added")
	public void appointment_will_be_added() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin with username {string} is not logged in and try to add appointment")
	public void admin_with_username_is_not_logged_in_and_try_to_add_appointment(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("appointment should be not added")
	public void appointment_should_be_not_added() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}

