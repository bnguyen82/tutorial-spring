package com.mytutorial;

import java.util.List;

public interface CourseService {
	public abstract void processCourse(List<Course> courses);
	public abstract void updateCourse(List<Course> courses);
}
