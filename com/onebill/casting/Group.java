package com.onebill.casting;

public class Group {
	
	public static void main(String[] args) {
		User user = new Admin("sd",1234567890 );
		user.chat();
		user.vediocall();
		user.share();
		
		
		Admin admin=(Admin) user; 
		admin.addUser("sd");
		admin.removeUser("sd");
	}

}
