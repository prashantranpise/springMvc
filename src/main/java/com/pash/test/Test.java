package com.pash.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pash.model.Car;
import com.pash.model.UserDetails;

public class Test {
	
	public static void main(String[] args) {
		new Test().start();
	}
	
public void	start(){
	Car car = new Car();
	car.setCarId(1);
	car.setMake("nissan");
	car.setModel("sunny");
	car.setRgNo("MH01BB7890");
	
	UserDetails userDetails = new UserDetails();
	userDetails.setUserId(1);
	userDetails.setEmailId("prashantbranpise@gmail.com");
	userDetails.setFirstName("prashant");
	userDetails.setLastName("Ranpise");
	userDetails.setMobileNo("9860571636");
	userDetails.setAddress("sangvi");
	
	SessionFactory sf = new Configuration().configure().buildSessionFactory();
	Session session=sf.openSession();
	
	session.beginTransaction();
	//session.save(userDetails);
	session.save(car);
	session.getTransaction().commit();
	
	
}

}
