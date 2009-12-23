package com.mytutorial;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-mytutorial.xml");
		List<Course> courses = new ArrayList<Course>(10);
		Course c1 = new Course();
		c1.setName("John");
		c1.setCourse("Java1");
		courses.add(c1);
		Course c2 = new Course();
		c2.setName("Peter");
		c2.setCourse("Hibernate1");
		courses.add(c2);
		//CourseService service = new CourseServiceImpl(); // tightly coupled
		CourseService service = (CourseService)ctx.getBean("courseService");
		service.processCourse(courses);
		
		Course c3 = courses.get(1);
		c3.setCourse("Hibernate2");
		
		service.updateCourse(courses);
	}
}