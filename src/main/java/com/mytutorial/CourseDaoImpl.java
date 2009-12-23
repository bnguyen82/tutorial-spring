package com.mytutorial;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
public class CourseDaoImpl extends HibernateDaoSupport implements CourseDao {

//	private SessionFactory sessionFactory = null;
	
//	static {
//		try {
//			// Create the SessionFactory from hibernate.cfg.xml
//			sessionFactory = new Configuration().configure()
//			.buildSessionFactory();
//		} catch (Throwable ex) {
//			// Make sure you log the exception, as it might be swallowed
//			System.err.println("Initial SessionFactory creation failed." + ex);
//			throw new ExceptionInInitializerError(ex);
//		}
//	}
	public void create(List<Course> listCourses) {
//		Session session = sessionFactory.openSession();
//		session.getTransaction().begin();
//		HibernateTemplate htp = new HibernateTemplate(sessionFactory);
		for (Course course : listCourses) {
			getHibernateTemplate().save(course);
		}
	}
	public List findAll() {
//		Session session = sessionFactory.openSession();
//		HibernateTemplate htp = new HibernateTemplate(sessionFactory);
		return getHibernateTemplate().find("From Course");
	}
	
//	public SessionFactory getSessionFactory() {
//		return this.sessionFactory;
//	}
	
//	public void setSessionFactory(SessionFactory sessionFactory) {
//		this.sessionFactory = sessionFactory;
//	}

}