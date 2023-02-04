package com.studentInfo.services;


import java.util.List;
import java.util.Optional;

import com.studentInfo.entity.StudentInfo;

public interface StudentInfoService {
	
	StudentInfo saveStudentInfo(StudentInfo studentInfo);

	List<StudentInfo> getAllStudentInfo();
	
	Optional<StudentInfo> getStudentInfoById(long id);
}
