package com.ewillian.Api.Controllers;

import com.ewillian.Api.Entities.Grade;
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
public class GradeController {

    @Autowired
    SchoolgradeService schoolgradeservice;

    @RequestMapping("grades/")
    ResponseEntity<List<Grade>> getAllGrade(){
        return new ResponseEntity<>(schoolgradeservice.getIGrade().getAll(), HttpStatus.OK);
    }

    @RequestMapping("grades/{id}")
    ResponseEntity<Grade> getGradeById(@PathVariable("id") Long id){
        return new ResponseEntity<>(schoolgradeservice.getIGrade().getGradeById(id), HttpStatus.OK);
    }

    @RequestMapping("grades/add")
    ResponseEntity<String> addGrade(@RequestBody Grade newGrade){
        schoolgradeservice.getIGrade().addGrade(newGrade);
        return new ResponseEntity<>("Ok", HttpStatus.OK);
    }

    @RequestMapping("grades/update/{id}")
    ResponseEntity<String> updateGrade(@Param("id") Long id, @RequestBody Grade newGrade){
        schoolgradeservice.getIGrade().updateGrade(id, newGrade);
        return new ResponseEntity<>("Ok", HttpStatus.OK);
    }

    @RequestMapping("grades/delete/{id}")
    ResponseEntity<String> deleteGradeById(@PathVariable("id") Long id){
        schoolgradeservice.getIGrade().deleteGradeById(id);
        return new ResponseEntity<>("Ok", HttpStatus.OK);
    }

}
