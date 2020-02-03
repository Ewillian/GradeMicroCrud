package com.Ewillian.teacherCore.Controller;

import com.Ewillian.teacherCore.Entities.Teacher;
import com.Ewillian.teacherCore.Repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path="")

public class TeacherController {

    @Autowired
    private TeacherRepository repository;

    public TeacherRepository getRepository() {
        return repository;
    }

    public void setRepository(TeacherRepository repository) {
        this.repository = repository;
    }

    @GetMapping(path="/teachers")
    public @ResponseBody
    List<Teacher> getTeacher() {
        System.out.println("Getting all teachers.");
        return repository.findAll();
    }

    @GetMapping("/teachers/{id}")
    public @ResponseBody
    Teacher getTeacherById(@PathVariable Long id) throws Exception {
        return repository.findById(id)
                .orElseThrow(() -> new Exception("no teacher found with id : "+id));
    }

    @PostMapping(path="/teachers/add")
    public @ResponseBody Teacher addTeacher (@RequestBody Teacher newTeacher) {
        return repository.save(newTeacher);
    }

    @PutMapping("/teachers/{id}")
    Teacher updateTeacher(@RequestBody Teacher newTeacher, @PathVariable Long id) {

        return  repository.findById(id).map(teacher -> {
            teacher.setFirstName(newTeacher.getFirstName());
            teacher.setLastName(newTeacher.getLastName());
            teacher.setBirthDate(newTeacher.getBirthDate());
            teacher.setPKid(newTeacher.getPKid());
            return repository.save(teacher);
        }).orElseGet(() -> {
            newTeacher.setPKid(id);
            return repository.save(newTeacher);
        });
    }

    @DeleteMapping("/teachers/{id}")
    void deleteTeacher(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
