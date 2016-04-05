package practica;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import practica.dto.UserDetails;

public class Main {

	public static void main(String[] args) {
		UserDetails user = new UserDetails();
		
//		user.setUserId(4);
//		user.setUserName("Fourth user");
//		user.setDescription("A description");
//		user.setAddress("An address");
//		user.setJoinedDate(new Date());

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
//		session.save(user);
		
		user = session.get(UserDetails.class, 1);
		
		System.out.println(user.getUserId());
		System.out.println(user.getUserName());
				
		session.getTransaction().commit();
		
		session.close();
	}

}
