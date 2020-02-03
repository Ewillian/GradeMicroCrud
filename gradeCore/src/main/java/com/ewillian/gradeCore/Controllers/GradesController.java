package com.ewillian.gradeCore.Controllers;

import com.ewillian.gradeCore.Entities.Grade;
import com.ewillian.gradeCore.Repositories.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path="/grades")
public class GradesController {
    @Autowired
    private GradeRepository repository;

    public GradeRepository getRepository() {
        return repository;
    }

    public void setRepository(GradeRepository repository) {
        this.repository = repository;
    }

    @GetMapping(path="")
    public @ResponseBody List<Grade> getGrades() {
        System.out.println("Getting all Grades.");
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public @ResponseBody Grade getGradeById(@PathVariable Long id) {
        // This returns a JSON or XML with the user
        return repository.findById(id).get();
    }

    /* @GetMapping("/grades")
    public @ResponseBody
    Grade getGradeByUserId(@RequestParam Long userId) {
        // This returns a JSON or XML with the user
        return (Grade) repository.findAllByUserId(userId);
    } */

    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody Grade addGrade (@RequestBody Grade newGrade) {
        return repository.save(newGrade);
    }

    @PutMapping("/{id}")
    Grade updateGrade(@RequestBody Grade newGrade, @PathVariable Long id) {

        return repository.findById(id).map(grade -> {
            grade.setid(newGrade.getid());
            grade.setHeadTeacher(newGrade.getHeadTeacher());
            grade.setTitle(newGrade.getTitle());
            grade.setYear(newGrade.getYear());
            return repository.save(grade);
        }).orElseGet(() -> {
            newGrade.setid(id);
            return repository.save(newGrade);
        });
    }

    @DeleteMapping("/{id}")
    void deleteGrade(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
