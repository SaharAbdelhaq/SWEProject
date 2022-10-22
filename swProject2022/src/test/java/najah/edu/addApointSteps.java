package najah.edu;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class addApointSteps { 
	
	private  ArrayList <User> u1= new ArrayList <User>();
    private  ArrayList <Appointment> b1= new ArrayList <Appointment>();
	private List <List<String>> l1;
	private List <List<String>> l2;
	private Appointment appointment=null;
	private User inUser = null;


	
	@Given("these are the users we will but it in the table as a format User\\(Name,password,user_level,status) noting that user level {int} is Admin and user level {int} is a  user and status indicates whether user is logged in or not")
	public void these_are_the_users_we_will_but_it_in_the_table_as_a_format_user_name_password_user_level_status_noting_that_user_level_is_admin_and_user_level_is_a_user_and_status_indicates_whether_user_is_logged_in_or_not(Integer int1, Integer int2, io.cucumber.datatable.DataTable dataTable) {
		
		l1= dataTable.asLists() ;
		for(int i=0;i<l1.size();i++) {
			String a = l1.get(i).get(0);
			String [] data = a.split(",");
			u1.add(new User(data[0],data[1],Integer.parseInt(data[2]),data[3].equalsIgnoreCase("true")));
	}}

	
	@Given("these are appointments and we will but it in the table as format appointment\\(Date,Time,Aid,Booked)")
	public void these_are_appointments_and_we_will_but_it_in_the_table_as_format_appointment_date_time_aid_booked(io.cucumber.datatable.DataTable dataTable) {
		l2= dataTable.asLists() ;
		for(int i=0;i<l2.size();i++) {
			String a = l2.get(i).get(0);
			String [] data = a.split(",");
			b1.add(new Appointment(data[0],data[1],data[2],data[3].equalsIgnoreCase("true")));
	

	}}

	@When("Admin with username {string} is already logged in add a appointment with  {string} and Time {string} and Aid {string} and Booked {string}")
	public void admin_with_username_is_already_logged_in_add_a_appointment_with_and_time_and_aid_and_booked(String string, String string2, String string3, String string4, String string5) {
		int t=-1;
		
		appointment=new Appointment(string,string2,string3,false);
		for(int i=0;i<u1.size();i++) {
			inUser=u1.get(i);
			if(string.equals(u1.get(i).getUsername())&&inUser.isAnAAdmin()){
				if(inUser.isStatus()){
					
				t=i;
					appointment.AddAppointment(u1, b1, string, string2, string3, string4,string5);
					break;
				}
				else {t=-1;}
			}
		}
	    assertTrue(t!=-1); 
	    	
	}

	@Then("appointment will be added")
	public void appointment_will_be_added() {

	    assertTrue(inUser.isStatus()&&inUser.isAnAAdmin());
}

	@When("Admin with username {string} is not logged in and try to add appointment")
	public void admin_with_username_is_not_logged_in_and_try_to_add_appointment(String string) {

		int e = 0;
		appointment= new Appointment(null,null,null,false);
	    
	    for(int i=0;i<u1.size();i++) {
			inUser=u1.get(i);
			if(string.equals(u1.get(i).getUsername())){
				if(inUser.isAnAAdmin()){
				if(!inUser.isStatus()){
					e=i;
					appointment.NotAdmin(u1, string);
					break;
				}
				else {e=-1;}
			}
				else {e=-1;}
			}
			
		}
	    assertTrue(e!=-1);
	}

	@Then("appointment should be not added")
	public void appointment_should_be_not_added() {
	    assertFalse(inUser.isStatus());
	}


}

