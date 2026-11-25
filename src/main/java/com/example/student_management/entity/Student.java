package com.example.student_management.entity;
 
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
 
@Entity
@Table(name = "students")
public class Student {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
   // @NotBlank(message = "Name is required")
  //  private String name;
 
    @NotBlank(message = "Name is required")
    @Pattern(
        regexp = "^[a-zA-Z ]+$",
        message = "Name should contain only letters and spaces"
    )
    private String name;
 
   // @NotBlank(message = "Email is required")
    //@Email(message = "Enter a valid email")
   // private String email;
 
   @NotBlank(message = "Email is required")
    @Email(message = "Enter a valid email address")
    private String email;
 
    @NotBlank(message = "Please select a course")
    private String course;
 
    // Default constructor
    public Student() {
    }
 
    // Getters and Setters
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
 
    public String getCourse() {
        return course;
    }
 
    public void setCourse(String course) {
        this.course = course;
    }
}