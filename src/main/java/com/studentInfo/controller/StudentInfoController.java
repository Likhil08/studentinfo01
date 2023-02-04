package com.studentInfo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentInfo.entity.StudentInfo;
import com.studentInfo.services.StudentInfoService;

@RestController
@RequestMapping("/api/student/details")
public class StudentInfoController {

	@Autowired
	private StudentInfoService studentInfoImpl;
	
	
	@PostMapping
	public ResponseEntity<StudentInfo> saveStudentInfo(@RequestBody StudentInfo studentInfo){
		return new ResponseEntity<StudentInfo>(studentInfoImpl.saveStudentInfo(studentInfo), HttpStatus.valueOf(00));
	}
	
	@GetMapping
	public List<StudentInfo> getAllStudentInfo(){
		return studentInfoImpl.getAllStudentInfo();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<StudentInfo>> getStudentInfoById(@PathVariable(name="id") long id, Model model){
		 ResponseEntity<Optional<StudentInfo>> stdInfo = ResponseEntity.ok(studentInfoImpl.getStudentInfoById(id));
		return stdInfo ;
		
		
	}
	

}
