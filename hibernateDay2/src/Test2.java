

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Model.Admin;

public class Test2 {

	public static void main(String[] args) {
    
		Configuration cfg = new Configuration();
		cfg.configure("hibernate2.cfg.xml");
	   
		SessionFactory factory =cfg.buildSessionFactory();
		Session session= factory.openSession();
		
		Admin a=new Admin(204, "mono", "khan", "1234");
		
		
		Transaction tx=session.beginTransaction();
		 session.delete(a);
		 System.out.println("Object saved successfully.....!!");
		 
		tx.commit();
		 session.close();
		 factory.close();
		
		
	}

}
