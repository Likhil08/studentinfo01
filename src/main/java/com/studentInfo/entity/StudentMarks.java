package com.studentInfo.entity;

import javax.persistence.CascadeType; 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "stident_marks")
public class StudentMarks {

	@Id
	private long id;
	
	@Column(name = "session")
	private String session;
	
	@Column(name = "semester")
	private String semester;
	
	@Column(name = "total_Subject")
	private int totalSubject;
	
	@Column(name = "total_Marks")
	private int totalMarks;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "studentmarks")
	private StudentInfo studentInfo;
	
	public StudentMarks() {
		
	}
	
	public StudentMarks(long id, String session, String semester, int totalSubject, int totalMarks,
			StudentInfo studentInfo) {
		super();
		this.id = id;
		this.session = session;
		this.semester = semester;
		this.totalSubject = totalSubject;
		this.totalMarks = totalMarks;
		this.studentInfo = studentInfo;
	}
	public StudentInfo getStudentInfo() {
		return studentInfo;
	}
	public void setStudentInfo(StudentInfo studentInfo) {
		this.studentInfo = studentInfo;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public int getTotalSubject() {
		return totalSubject;
	}
	public void setTotalSubject(int totalSubject) {
		this.totalSubject = totalSubject;
	}
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
}
