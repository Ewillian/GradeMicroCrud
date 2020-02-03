package com.ewillian.Api.Interfaces;

import com.ewillian.Api.Entities.Grade;
import feign.Headers;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Component
@FeignClient(name = "Grades")
public interface IGradeSchoolgrade {
    @RequestLine("GET /grades/")
    List<Grade> getAll();

    @RequestLine("GET /grades/{id}")
    Grade getGradeById(@Param("id") Long id);

    //@RequestLine("POST /add")

    @RequestLine("DELETE /grades/{id}")
    Void deleteGradeById(@Param("id") Long id);

    @RequestLine("POST /grades/add")
    @Headers({
            "Content-Type: application/json"
    })
    Void addGrade(@RequestBody Grade newGrade);

    @RequestLine("PUT /grades/{id}")
    @Headers({
            "Content-Type: application/json"
    })
    Void updateGrade(@Param("id") Long id, @RequestBody Grade grade);


}
