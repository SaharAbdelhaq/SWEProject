package najah.edu;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import io.cucumber.java.en.*;

public class logoutsteps {
	
	private  ArrayList <User> u1= new ArrayList <User>();
	private List <List<String>> l1;
	private User inUser = null;
	@Given("these are the users we will but it in the table as a format User\\(Name,password,user_level,status) noting that user level one is Admin and user level two is a normal user and status indicates whether user is logged in or not")
	public void these_are_the_users_we_will_but_it_in_the_table_as_a_format_user_name_password_user_level_status_noting_that_user_level_one_is_admin_and_user_level_two_is_a_normal_user_and_status_indicates_whether_user_is_logged_in_or_not(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		l1= dataTable.asLists() ;
		for(int i=0;i<l1.size();i++) {
			String a = l1.get(i).get(0);
			String [] data = a.split(",");
			u1.add(new User(data[0],data[1],Integer.parseInt(data[2]),data[3].equalsIgnoreCase("true")));
		}
	}




    @When("Admin {string} is already logged in and Admin press logout")
    public void admin_is_already_logged_in_and_admin_press_logout(String string) {
    // Write code here that turns the phrase above into concrete actions
    	
		int e=-1;
    	for(int i=0;i<u1.size();i++) {
			if(string.equals(u1.get(0).getUsername())) {
				e=i;
				inUser=u1.get(i);
				inUser.logout();
				break;
			}
		}

		assertTrue(e!=-1);
    }


	@Then("System will exit")
	public void system_will_exit() {
	    assertFalse(inUser.isStatus());
	}

}