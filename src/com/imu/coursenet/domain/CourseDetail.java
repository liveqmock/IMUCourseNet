package com.imu.coursenet.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.imu.coursenet.domain.*;
public class CourseDetail implements Serializable{
	private static final long serialVersionUID = 48L;
	private Integer courseDetailId;
	private String teachPlane;
	private String referenceBook;
	private String courseIntroduce;
	private Date establishDate;
	private Integer state;//-1代表开始，1代表未开始。
	private Course course;
	private Teacher teacher;
	private Set<Courseware> coursewares = new HashSet<Courseware>();
	private Set<CourseNotification> courseNotifications=new HashSet<CourseNotification>();
	private Set<CourseWork> courseWorks = new HashSet<CourseWork>();
	private Set<CourseTaking> courseTakings = new HashSet<CourseTaking>();
	private Set<Post> posts=new HashSet<Post>();
	private Set<PostReply> postReplys=new HashSet<PostReply>();
	public CourseDetail(){
		
	}
	
	public CourseDetail(String teachPlane,String referenceBook,
			String courseIntroduce,Date establishDate,Integer state){
		
	}

	
	
	public Set<PostReply> getPostReplys() {
		return postReplys;
	}

	public void setPostReplys(Set<PostReply> postReplys) {
		this.postReplys = postReplys;
	}

	public Set<Post> getPosts() {
		return posts;
	}

	public void setPosts(Set<Post> posts) {
		this.posts = posts;
	}

	public Set<CourseTaking> getCourseTakings() {
		return courseTakings;
	}

	public void setCourseTakings(Set<CourseTaking> courseTakings) {
		this.courseTakings = courseTakings;
	}

	public Set<CourseWork> getCourseWorks() {
		return courseWorks;
	}

	public void setCourseWorks(Set<CourseWork> courseWorks) {
		this.courseWorks = courseWorks;
	}

	public Set<CourseNotification> getCourseNotifications() {
		return courseNotifications;
	}

	public void setCourseNotifications(Set<CourseNotification> courseNotifications) {
		this.courseNotifications = courseNotifications;
	}

	public Set<Courseware> getCoursewares() {
		return coursewares;
	}

	public void setCoursewares(Set<Courseware> coursewares) {
		this.coursewares = coursewares;
	}

	public Integer getCourseDetailId() {
		return courseDetailId;
	}

	public void setCourseDetailId(Integer courseDetailId) {
		this.courseDetailId = courseDetailId;
	}

	public String getTeachPlane() {
		return teachPlane;
	}

	public void setTeachPlane(String teachPlane) {
		this.teachPlane = teachPlane;
	}

	public String getReferenceBook() {
		return referenceBook;
	}

	public void setReferenceBook(String referenceBook) {
		this.referenceBook = referenceBook;
	}

	public String getCourseIntroduce() {
		return courseIntroduce;
	}

	public void setCourseIntroduce(String courseIntroduce) {
		this.courseIntroduce = courseIntroduce;
	}

	public Date getEstablishDate() {
		return establishDate;
	}

	public void setEstablishDate(Date establishDate) {
		this.establishDate = establishDate;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	
}
