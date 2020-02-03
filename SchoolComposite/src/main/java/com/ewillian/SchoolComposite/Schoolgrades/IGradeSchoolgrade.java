package com.ewillian.SchoolComposite.Schoolgrades;

import com.ewillian.SchoolComposite.Entities.Grade;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@FeignClient(name = "GradeSchoolgrade")
public interface IGradeSchoolgrade {

    @RequestLine("GET /{PKid}")
    Grade getGradeField(@Param("PKid") Long PKid);
}
