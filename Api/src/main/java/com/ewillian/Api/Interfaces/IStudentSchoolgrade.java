package com.ewillian.Api.Interfaces;

import com.ewillian.Api.Entities.Student;
import feign.Body;
import feign.Headers;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Component
@FeignClient(name = "Student")
public interface IStudentSchoolgrade {
    @RequestLine("GET /students/")
    List<Student> getAll();

    @RequestLine("GET /students/{id}")
    Student getStudentById(@Param("id") Long id);

    //@RequestLine("POST /add")

    @RequestLine("DELETE /students/{id}")
    Void deleteStudentById(@Param("id") Long id);

    @RequestLine("POST /students/add")
    @Headers({
            "Content-Type: application/json"
    })
    Void addStudent(@RequestBody Student newStudent);

    @RequestLine("PUT /students/{id}")
    @Headers({
            "Content-Type: application/json"
    })
    Void updateStudent(@RequestBody Student student, @Param("id") Long id);


}
