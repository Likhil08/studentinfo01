package com.studentInfo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.studentInfo.entity.StudentInfo;
import com.studentInfo.entity.StudentMarks;
import com.studentInfo.exceptions.ResourceNotFoundException;
import com.studentInfo.repository.StudentInfoRepository;
import com.studentInfo.repository.StudentMarksRepository;

@Service
public class StudentMarksServiceImpl implements StudentMarksService {

	@Autowired
	private StudentMarksRepository studentMarksRepo;
	
	@Autowired
	private StudentInfoRepository stdInfoRepo;

	@Override
	public StudentMarks saveStudentMarks(long id, StudentMarks studentMarks) {
		
		StudentInfo StdInfo = stdInfoRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("StudenInfo", "id", id));
		studentMarks.setStudentInfo(StdInfo);
		
		return studentMarksRepo.save(studentMarks);
		
		 
	}

	@Override
	public Optional<StudentMarks> getStudentMarksById(long id) {
		return studentMarksRepo.findById(id);
		
	}

	
	
	

}
