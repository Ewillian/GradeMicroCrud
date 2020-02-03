package com.ewillian.gradeCore.Controllers;

import com.ewillian.gradeCore.Entities.Grade;
import com.ewillian.gradeCore.Repositories.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path="")
public class GradesController {
    @Autowired
    private GradeRepository repository;

    public GradeRepository getRepository() {
        return repository;
    }

    public void setRepository(GradeRepository repository) {
        this.repository = repository;
    }

    @GetMapping(path="/grades")
    public @ResponseBody
    List<Grade> getGrades() {
        System.out.println("Getting all Grades.");
        return repository.findAll();
    }

    @GetMapping("/grades/{id}")
    public @ResponseBody
    Grade getGradeById(@RequestParam Long PKid) {
        // This returns a JSON or XML with the user
        return repository.findById(PKid).get();
    }

    /* @GetMapping("/grades")
    public @ResponseBody
    Grade getGradeByUserId(@RequestParam Long userId) {
        // This returns a JSON or XML with the user
        return (Grade) repository.findAllByUserId(userId);
    } */

    @PostMapping(path="/grades/add") // Map ONLY POST Requests
    public @ResponseBody Grade addGrade (@RequestBody Grade newGrade) {
        return repository.save(newGrade);
    }

    @PutMapping("/grades/{id}")
    Grade updateGrade(@RequestBody Grade newGrade, @PathVariable Long PKid) {

        return repository.findById(PKid).map(todo -> {
            todo.setPKid(newGrade.getPKid());
            todo.setHeadTeacher(newGrade.getHeadTeacher());
            todo.setTitle(newGrade.getTitle());
            todo.setYear(newGrade.getYear());
            return repository.save(todo);
        }).orElseGet(() -> {
            newGrade.setPKid(PKid);
            return repository.save(newGrade);
        });
    }

    @DeleteMapping("/grades/{id}")
    void deleteGrade(@PathVariable Long PKid) {
        repository.deleteById(PKid);
    }
}
