package com.ewillian.SchoolComposite.Schoolgrades;

import com.ewillian.SchoolComposite.Entities.Grade;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@Component
@FeignClient(name = "GradeSchoolgrade")
public interface IGradeSchoolgrade {

    @RequestLine("GET /{id}")
    Grade getGradeField(@Param("id") Long id);
}
