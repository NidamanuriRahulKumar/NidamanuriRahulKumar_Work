package com.project.SportyShoes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.SportyShoes.entity.Login;
import com.project.SportyShoes.entity.UserDetails;
import com.project.SportyShoes.jdbc.LoginRepository;


@Service
public class LoginService{
	@Autowired
	private LoginRepository repo;
	 public Login signgin(String username, String password) {
		  Login user = repo.findByUsernameAndPassword(username, password);
		  System.out.println("from service" + user);
		  
	  	return user;
	  }
	 
	public Login changePassword(String username, String newpassword) {
		// TODO Auto-generated method stub
		Login uplogin = null;
		Login user1 = repo.findByUsername(username);
		if(user1 !=null ) {
			System.out.println("user1" + user1);
			repo.changePassword(newpassword, user1.getId());
			uplogin = repo.findByUsername(username);
			System.out.println("Password Changed");
			return uplogin;
		}
		return null;
	}
}
	// Login login=repo.findByEmail(email); 
		// if(login != null)
		 //{
			// login.setResetPassword(resetPassword);
			 //repo.save(login);
		 //}
		 //else {
			//System.out.println("couldnot find the emailid");
		//}
	   // }
	    //catch (Exception e) {
		//e.printStackTrace(e.getMessage());
	    //}
    //}
	 
	//public Login getByResetPassword(String resetPassword)
	//{	
	  // return repo.findByResetPassword(resetPassword);
	//}  
		   
	   		
//}