package model;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AdminDao {
	public List<Admin> show()
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		//xml file didint assign here 

		SessionFactory factory=cfg.buildSessionFactory();
		Session session =factory.openSession();
		Transaction tx=session.beginTransaction();
		
		Query query=session.createQuery("from Admin");
		List<Admin> ul=query.list();
		tx.commit();
		session.close();
		return ul;
		
	}
	
	public Admin getoneuser(int id)
	{ //id have changes 
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		//xml file didint assign here 
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		Query query=session.createQuery("from Admin where aid=:i");
		query.setParameter("i", id);
		//uid not "id" only id
		List<Admin> al=query.list();
		Admin ad=al.get(0);
		tx.commit();
		factory.close();
		return ad;
		
	}
}
