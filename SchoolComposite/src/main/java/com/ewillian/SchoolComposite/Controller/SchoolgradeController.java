package com.ewillian.SchoolComposite.Controller;

import com.ewillian.SchoolComposite.Entities.SchoolgradeDTO;
import com.ewillian.SchoolComposite.Services.SchoolgradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SchoolgradeController {

    @Autowired
    SchoolgradeService schoolgradeservice;

    @RequestMapping("/SchoolGrades/{id}")
    ResponseEntity<SchoolgradeDTO> getSchoolgradeDTO(@PathVariable("id") Long id){
        return new ResponseEntity<>(schoolgradeservice.getGradeStudents(id), HttpStatus.OK);
    }
}
