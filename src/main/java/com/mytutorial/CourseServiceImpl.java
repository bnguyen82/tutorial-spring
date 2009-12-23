package com.mytutorial;
import org.springframework.aop.support.RegexpMethodPointcutAdvisor;
import java.util.List;

public class CourseServiceImpl implements CourseService {
	
	private CourseDao courseDao;
	
//	public CourseDao getCourseDao(){
//		return courseDao;
//	}
	
	public void setCourseDao(CourseDao courseDao){
		this.courseDao = courseDao; 
	}
	
	public void processCourse(List<Course> courses) {
		//CourseDao dao = new CourseDaoImpl(); // tightly coupled
		courseDao.create(courses);
		List<Course> list = (List<Course>) courseDao.findAll();
		System.out.println("The saved courses are --> " + list);
	}
	
	public void updateCourse(List<Course> listCourses){
		courseDao.update(listCourses);
		List<Course> list = (List<Course>) courseDao.findAll();
		System.out.println("The saved courses are --> " + list);		
	}
}