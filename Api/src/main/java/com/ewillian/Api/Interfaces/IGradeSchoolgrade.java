package com.ewillian.Api.Interfaces;

import com.ewillian.Api.Entities.Grade;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@Component
@FeignClient(name = "GradeSchoolgrade")
public interface IGradeSchoolgrade {

}
