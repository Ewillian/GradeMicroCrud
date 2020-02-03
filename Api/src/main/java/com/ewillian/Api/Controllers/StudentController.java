package com.ewillian.Api.Controllers;

import com.ewillian.Api.Entities.SchoolgradeDTO;
import com.ewillian.Api.Entities.Student;
import com.ewillian.Api.Services.SchoolgradeService;
import feign.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    SchoolgradeService schoolgradeservice;

    @RequestMapping("students/")
    ResponseEntity<List<Student>> getAllStudent(){
        return new ResponseEntity<>(schoolgradeservice.getIStudent().getAll(), HttpStatus.OK);
    }

    @RequestMapping("students/{id}")
    ResponseEntity<Student> getStudentById(@PathVariable("id") Long id){
        return new ResponseEntity<>(schoolgradeservice.getIStudent().getStudentById(id), HttpStatus.OK);
    }

    @RequestMapping("students/add")
    ResponseEntity<String> addStudent(@RequestBody Student newStudent){
        schoolgradeservice.getIStudent().addStudent(newStudent);
        return new ResponseEntity<>("Ok", HttpStatus.OK);
    }

    @RequestMapping("students/update/{id}")
    ResponseEntity<String> updateStudent(@Param("id") Long id, @RequestBody Student newStudent){
        schoolgradeservice.getIStudent().updateStudent(newStudent, id);
        return new ResponseEntity<>("Ok", HttpStatus.OK);
    }

    @RequestMapping("students/delete/{id}")
    ResponseEntity<String> deleteStudentById(@PathVariable("id") Long id){
        schoolgradeservice.getIStudent().deleteStudentById(id);
        return new ResponseEntity<>("Ok", HttpStatus.OK);
    }

}
