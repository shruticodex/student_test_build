package com.example.student_management.service;
 
import java.util.List;
 
import org.springframework.stereotype.Service;
 
import com.example.student_management.entity.Student;
import com.example.student_management.repository.StudentRepository;
 
@Service

public class StudentService {

    private final StudentRepository studentRepository;
 
    public StudentService(StudentRepository studentRepository) {

        this.studentRepository = studentRepository;

    }
    // Save Student
    public Student saveStudent(Student student) {
 
        return studentRepository.save(student);

    }
    // Get All Students
    public List<Student> getAllStudents() {
 
        return studentRepository.findAll();

    }
    // Delete Student
    public void deleteStudent(Long id) {
 
        studentRepository.deleteById(id);

    }

}

 