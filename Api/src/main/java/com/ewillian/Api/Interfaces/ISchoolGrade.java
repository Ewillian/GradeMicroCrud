package com.ewillian.Api.Interfaces;

import com.ewillian.Api.Entities.Grade;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@Component
@FeignClient(name = "Schoolgrade")
public interface ISchoolGrade {

    @RequestLine("GET /schoolgrades/{id}")
    Grade getGradeStudents(@Param("id") Long id);
}
