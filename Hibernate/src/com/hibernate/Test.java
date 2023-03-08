package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	 public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg = cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Employee e=new Employee();
		e.setEmpid(1);
		e.setName("Ganesh");
		e.setCname("Epitome");
		e.setSalary(130000);
		Employee e1=new Employee();
		e1.setEmpid(2);
		e1.setName("Nikhil");
		e1.setCname("Infosys");
		e1.setSalary(180000);
		Employee e2=new Employee();
		e2.setEmpid(3);
		e2.setName("Rahul");
		e2.setCname("Google");
		e2.setSalary(500000);
		Employee e3=new Employee();
		e3.setEmpid(4);
		e3.setName("Swaraj");
		e3.setCname("Dell");
		e3.setSalary(200000);
		
		session.save(e);
		session.save(e1);
		session.save(e2);
		session.save(e3);
		session.beginTransaction().commit();
	}

}
