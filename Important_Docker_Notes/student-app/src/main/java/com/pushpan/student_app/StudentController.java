package com.pushpan.student_app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    Logger logger = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    StudentRepo studentRepo;

    @RequestMapping("/getStudents")
    public List<Student> getStudents(){
        logger.info("Fetching all students");
        return studentRepo.findAll();
    }

    @RequestMapping("/deleteStudents")
    public void deleteStudents(){
        logger.info("Deleting all students");
        studentRepo.deleteAll();
    }

    @RequestMapping("/addStudents")
    public String addStudents() {
        logger.info("Adding sample students");
        Student s1 = new Student("Pushpan", 24);
        studentRepo.save(s1);
        return "Student added";
    }
}
