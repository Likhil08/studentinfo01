package com.studentInfo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="student_info")
public class StudentInfo {

	@Id
	@Column(name = "std_id")
	private long id;
	
	@Column(name = "std_name")
	private String name;
	
	@Column(name = "std_address")
	private String address;
	
	@Column(name = "std_email")
	private String email;
	
	@Column(name = "std_phoneno")
	private long phoneNo;
	
	@Column(name = "std_section")
	private String section;
	
	@Column(name = "std_grade")
	private String grade;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "st_id")
	private StudentMarks studentmarks;
	
	public StudentInfo() {
		
	}
	
	public StudentInfo(long id, String name, String address, String email, long phoneNo, String section, String grade,
			StudentMarks studentmarks) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.email = email;
		this.phoneNo = phoneNo;
		this.section = section;
		this.grade = grade;
		this.studentmarks = studentmarks;
	}

	public long getStd_id() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public StudentMarks getStudentmarks() {
		return studentmarks;
	}

	public void setStudentmarks(StudentMarks studentmarks) {
		this.studentmarks = studentmarks;
	}


}
