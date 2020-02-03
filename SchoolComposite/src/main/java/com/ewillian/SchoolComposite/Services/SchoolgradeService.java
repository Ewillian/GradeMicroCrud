package com.ewillian.SchoolComposite.Services;

import com.ewillian.SchoolComposite.Entities.Grade;
import com.ewillian.SchoolComposite.Entities.SchoolgradeDTO;
import com.ewillian.SchoolComposite.Entities.Student;
import com.ewillian.SchoolComposite.Schoolgrades.IGradeSchoolgrade;
import com.ewillian.SchoolComposite.Schoolgrades.IStudentSchoolgrade;
import feign.Feign;
import feign.Logger;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;
import feign.slf4j.Slf4jLogger;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@Data
public class SchoolgradeService {

    private IStudentSchoolgrade istudentschoolgrade = Feign.builder()
            .client(new OkHttpClient())
            .encoder(new GsonEncoder())
            .decoder(new GsonDecoder())
            .logger(new Slf4jLogger())
            .logLevel(Logger.Level.FULL)
            .target(IStudentSchoolgrade.class, "http://localhost:8082/students");

    private IGradeSchoolgrade igradeschoolgrade = Feign.builder()
            .client(new OkHttpClient())
            .encoder(new GsonEncoder())
            .decoder(new GsonDecoder())
            .logger(new Slf4jLogger())
            .logLevel(Logger.Level.FULL)
            .target(IGradeSchoolgrade.class, "http://localhost:8081/grades");


    public SchoolgradeDTO getGradeStudents(Long id){
        Grade grade = igradeschoolgrade.getGradeField(id);
        List<Student> gradeStudents = istudentschoolgrade.getAllForGrade(id);
        return new SchoolgradeDTO(grade, gradeStudents);
    };

}
