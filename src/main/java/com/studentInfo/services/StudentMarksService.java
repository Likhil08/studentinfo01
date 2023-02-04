package com.studentInfo.services;

import java.util.Optional;

import com.studentInfo.entity.StudentMarks;

public interface StudentMarksService {

	StudentMarks saveStudentMarks(long id,StudentMarks studentMarks); 
	
	Optional<StudentMarks> getStudentMarksById(long id);
}
