package com.ewillian.Api.Interfaces;

import com.ewillian.Api.Entities.Grade;
import com.ewillian.Api.Entities.SchoolgradeDTO;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@Component
@FeignClient(name = "Schoolgrade")
public interface ISchoolGrade {

    @RequestLine("GET /schoolgrades/{id}")
    Object getGradeStudents(@Param("id") Long id);
}
