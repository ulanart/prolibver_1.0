package lv.utils;

public class HibernateUtil 
{
	private static final SessionFactory sessionFactory;
	static
	{
		try
		{
			sessionFactory = new Configuration().configure().buildSessionFactory(null);
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
