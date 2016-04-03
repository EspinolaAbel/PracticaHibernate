package practica;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import practica.dto.UserDetails;

public class Main {

	public static void main(String[] args) {
		UserDetails userDetails = new UserDetails();
		
		userDetails.setUserId(1);
		userDetails.setUserName("Firt user");

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(userDetails);
		
		session.getTransaction().commit();
		
		session.close();
	}

}
