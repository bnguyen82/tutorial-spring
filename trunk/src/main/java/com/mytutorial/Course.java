package com.mytutorial;
public class Course {
	private Long id;
	private String name;
	private String course;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return new StringBuffer().append("id=" + id).append(",name=" + name)
		.append(",course=" + course).toString();
	}
}