package com.studentInfo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.studentInfo.entity.StudentInfo;
import com.studentInfo.entity.StudentMarks;
import com.studentInfo.services.StudentMarksService;

@Controller
@RequestMapping("/api")
public class StudentMarksController {

	@Autowired
	private StudentMarksService studentMarksService;
	
	
	@PostMapping("/student/marks/{id}/detail")
	public ResponseEntity<StudentMarks> saveStudentMarks(@PathVariable(value="id") long id,  @RequestBody StudentMarks studentMarks){
		return new ResponseEntity<StudentMarks>(studentMarksService.saveStudentMarks(id,studentMarks), HttpStatus.valueOf(00));
	}
	
	@GetMapping("/student/details/marks/{id}")
	public ResponseEntity<Optional<StudentMarks>> getStudentInfoById(@PathVariable(name="id") long id, Model model){
		  return ResponseEntity.ok(studentMarksService.getStudentMarksById(id));
		  }
}
	
