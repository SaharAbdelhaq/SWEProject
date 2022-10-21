package najah.edu;

public class User {
	
private String username ;
private String password;
private int user_level;
private boolean status;
public User(String username, String password, int user_level, boolean status) {
	this.username = username;
	this.password = password;
	this.user_level = user_level;
	this.status=status;
}

public boolean isStatus() {
	return status;
}

public void setStatus(boolean status) {
	this.status = status;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public boolean isAnAAdmin() {
	return user_level==1;
}
public void setUser_level(int user_level) {
	this.user_level = user_level;
}
public void logout() {
	status= false;
}
}