package com.ewillian.studentCore.Controller;
import com.ewillian.studentCore.Entities.Student;
import com.ewillian.studentCore.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path="")

public class StudentController {
    @Autowired
    private StudentRepository repository;

    public StudentRepository getRepository() {
        return repository;
    }

    public void setRepository(StudentRepository repository){
        this.repository = repository;
    }

    @GetMapping(path="/students")
    public @ResponseBody
    List<Student> getStudent() {
        System.out.println("Getting all Students.");
        return repository.findAll();
    }

    @GetMapping("/students/{id}")
    public @ResponseBody
    Student getStudentById(@PathVariable Long id) throws Exception {
        return repository.findById(id)
                .orElseThrow(() -> new Exception("no student found with id : "+id));
    }


    @PostMapping(path="/students/add")
    public @ResponseBody Student addStudent (@RequestBody Student newStudent) {
        return repository.save(newStudent);
    }

    @PutMapping("/students/{id}")
    Student updateStudent(@RequestBody Student newStudent, @PathVariable Long id) {

        return  repository.findById(id).map(student -> {
            student.setFirstName(newStudent.getFirstName());
            student.setLastName(newStudent.getLastName());
            student.setBirthDate(newStudent.getBirthDate());
            student.setFK_id(newStudent.getFK_id());
            student.setPK_id(newStudent.getPK_id());
            return repository.save(student);
        }).orElseGet(() -> {
            newStudent.setFK_id(id);
            return repository.save(newStudent);
        });
    }

    @DeleteMapping("/students/{id}")
    void deleteStudent(@PathVariable Long id) {
        repository.deleteById(id);
    }

}