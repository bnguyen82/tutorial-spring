package com.mytutorial;

import java.util.List;

public interface CourseDao {
	public abstract void create(List<Course> listCourses);

	public abstract List findAll( );
}
