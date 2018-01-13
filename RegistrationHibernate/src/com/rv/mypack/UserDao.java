package com.rv.mypack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UserDao {

	public static int register(User u)
	{
		int i=0;
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		s.beginTransaction();
		//tx.begin();
		//s.persist(u);
		i=(Integer)s.save(u);
		s.getTransaction().commit();
		//tx.commit();
		s.close();
		return i;
		
	}
}
