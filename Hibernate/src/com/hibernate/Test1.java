package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.hibernate.Employee;

public class Test1 {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg = cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		/*Employee emp = session.get(Employee.class,1);*/
		
		Employee emp = session.load(Employee.class,3);
		
		
		
		
		System.out.println(emp.getEmpid());
		System.out.println(emp.getName());
		System.out.println(emp.getCname());
		System.out.println(emp.getSalary());
		
		
		
		

	}
}
