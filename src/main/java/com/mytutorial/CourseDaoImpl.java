package com.mytutorial;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
public class CourseDaoImpl extends HibernateDaoSupport implements CourseDao {
	public static final Logger LOG = LoggerFactory.getLogger(CourseDaoImpl.class);
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
		LOG.info("Find all course in DB");
//		Session session = sessionFactory.openSession();
//		HibernateTemplate htp = new HibernateTemplate(sessionFactory);
		return getHibernateTemplate().find("From Course");
	}
	
	public void update(List<Course> listCourses) {
		for (Course course : listCourses) {
			getHibernateTemplate().update(course);
		}		
	}
	
//	public SessionFactory getSessionFactory() {
//		return this.sessionFactory;
//	}
	
//	public void setSessionFactory(SessionFactory sessionFactory) {
//		this.sessionFactory = sessionFactory;
//	}

}
