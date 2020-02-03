package com.ewillian.SchoolComposite.Schoolgrades;

import com.ewillian.SchoolComposite.Entities.Student;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@FeignClient(name = "StudentSchoolgrade")
public interface IStudentSchoolgrade {
    @RequestLine("GET ")
    List<Student> getAll();

    @RequestLine("GET ?userId={userId}")
    List<Student> getAllForGrade(@Param("gradePKid") Long gradePKid);
}
