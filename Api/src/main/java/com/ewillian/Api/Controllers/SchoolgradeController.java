package com.ewillian.Api.Controllers;

import com.ewillian.Api.Entities.Grade;
import com.ewillian.Api.Entities.SchoolgradeDTO;
import com.ewillian.Api.Services.SchoolgradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchoolgradeController {

    @Autowired
    SchoolgradeService schoolgradeservice;

    @RequestMapping("gradeStudents/{id}")
    ResponseEntity<Object> getGradeStudents(@PathVariable("id") Long id) {
        return new ResponseEntity<>(schoolgradeservice.getISchooldGrade().getGradeStudents(id), HttpStatus.OK);
    }
}
