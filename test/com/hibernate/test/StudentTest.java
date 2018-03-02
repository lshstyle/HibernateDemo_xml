package com.hibernate.test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.model.Student;

public class StudentTest {
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("s4");
		s.setAge(4);
		
		Configuration cfg = new Configuration();
		SessionFactory sessionFactory = cfg.configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(s);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
}
