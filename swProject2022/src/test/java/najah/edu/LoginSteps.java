package najah.edu;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps{
	private  ArrayList <User> u1= new ArrayList <User>();
	private List <List<String>> l1;
	private User inUser = null;
	
	
	@Given("these are the users we will but it in the table as a format User\\(Name,password,user_level,status) noting that user level {int} is Admin and user level {int} is a normal user and status indicates whether user is logged in or not")
	public void theseAreTheUsersWeWillButItInTheTableAsAFormatUserNamePasswordUserLevelStatusNotingThatUserLevelIsAdminAndUserLevelIsANormalUserAndStatusIndicatesWhetherUserIsLoggedInOrNot(Integer int1, Integer int2, io.cucumber.datatable.DataTable dataTable) {
	   
		l1= dataTable.asLists() ;
		for(int i=0;i<l1.size();i++) {
			String a = l1.get(i).get(0);
			String [] data = a.split(",");
			u1.add(new User(data[0],data[1],Integer.parseInt(data[2]),data[3].equalsIgnoreCase("true")));
		}
		
	    //throw new io.cucumber.java.PendingException();
	}
	
	@When("Admin enters {string} as a user name and enters {string} as password")
	public void adminEntersAsAUserNameAndEntersAsPassword(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		  inUser = new User(string,string2,1,false);
		    assertTrue(inUser!=null);
	}
	
	@Then("Admin will login")
	public void adminWillLogin() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
			int e=-1;
			for(int i=0;i<u1.size();i++) {
				if(inUser.getUsername().equals(u1.get(i).getUsername())&&inUser.getPassword().equals(u1.get(i).getPassword())&&u1.get(i).isAnAAdmin()&&!u1.get(i).isStatus()) {
					e=i;
					break;
				}
			}
			assertTrue(e!=-1);
		}
	

		@Then("Error messege should be appeared")
		public void error_messege_should_be_appeared() {
			assertFalse(u1.contains(inUser));
		}

	}

