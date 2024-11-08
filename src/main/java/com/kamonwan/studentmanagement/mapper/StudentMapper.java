package com.kamonwan.studentmanagement.mapper;

import com.kamonwan.studentmanagement.dto.StudentDto;
import com.kamonwan.studentmanagement.entity.Student;

public class StudentMapper {

    public static StudentDto mapTostudentDto(Student student){
        StudentDto studentDto = new StudentDto(
                    student.getId(),
                    student.getFirstName(),
                    student.getLastName(),
                    student.getEmail()
        );
        return studentDto;
    }
    public static Student mapToStudent(StudentDto studentDto){
        Student student = new Student(
                    studentDto.getId(),
                    studentDto.getFirstName(),
                    studentDto.getLastName(),
                    studentDto.getEmail()
        );
        return student;
    }
}
