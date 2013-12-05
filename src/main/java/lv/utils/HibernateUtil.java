package lv.utils;

import lv.Models.Article;
import lv.Models.User;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

public class HibernateUtil 
{
	private static final SessionFactory sessionFactory;
	static
	{
		try
		{
			Configuration configuration = new Configuration();
			configuration.configure();
			configuration.addAnnotatedClass(User.class);
			configuration.addAnnotatedClass(Article.class);
			
			sessionFactory = new Configuration().configure().buildSessionFactory();
		}
		catch(Throwable ex)
		{
			System.out.println("Can't initialize sessionFatory! Error: "+ ex.toString());
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	public static SessionFactory getSessionFactory()
	{
		return sessionFactory;
	}
}
