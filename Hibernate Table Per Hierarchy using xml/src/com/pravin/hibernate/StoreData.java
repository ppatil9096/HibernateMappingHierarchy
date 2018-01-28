package com.pravin.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {
    public static void main(String[] args) {
	Session session = new Configuration().configure("hibernate.cfg.xml")
		.buildSessionFactory()
		.openSession();
	Transaction transaction = session.beginTransaction();
	Employee employee1 = new Employee();
	employee1.setName("pravin");

	Regular_Employee employee2 = new Regular_Employee();
	employee2.setName("Ajay");
	employee2.setSalary(50000);
	employee2.setBonus(3);

	Contract_Employee employee3 = new Contract_Employee();
	employee3.setName("Baban");
	employee3.setPay_per_hour(1000);
	employee3.setContract_duration("15 hr");

	session.save(employee1);
	session.save(employee2);
	session.save(employee3);

	transaction.commit();
	session.close();

	System.out.println("Success!");
    }
}
