package Model;

public class Admin {
 
private	int id;
private String name;
private String lastn;
private	String password;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLastn() {
	return lastn;
}
public void setLastn(String lastn) {
	this.lastn = lastn;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

public Admin() {
	super();
	
}


public Admin( String name, String lastn, String password) {
	super();
	this.id = id;
	this.name = name;
	this.lastn = lastn;
	this.password = password;
}

public Admin(int id, String name, String lastn, String password) {
	super();
	this.id = id;
	this.name = name;
	this.lastn = lastn;
	this.password = password;
}
	
	
	
	
}
