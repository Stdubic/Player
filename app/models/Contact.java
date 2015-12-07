package models;

import play.db.jpa.Model;


public class Contact extends Model {
	
	public Long id;
	
	public String name;
	
	public String phone;
	
	public String email;
	

}
