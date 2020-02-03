package com.ewillian.Api.Services;

import com.ewillian.Api.Entities.Grade;
import com.ewillian.Api.Entities.SchoolgradeDTO;
import com.ewillian.Api.Entities.Student;
import com.ewillian.Api.Interfaces.IGradeSchoolgrade;
import com.ewillian.Api.Interfaces.ISchoolGrade;
import com.ewillian.Api.Interfaces.IStudentSchoolgrade;
import feign.Feign;
import feign.Logger;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;
import feign.slf4j.Slf4jLogger;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

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
            .target(IStudentSchoolgrade.class, "http://localhost:8082/");

    private IGradeSchoolgrade igradeschoolgrade = Feign.builder()
            .client(new OkHttpClient())
            .encoder(new GsonEncoder())
            .decoder(new GsonDecoder())
            .logger(new Slf4jLogger())
            .logLevel(Logger.Level.FULL)
            .target(IGradeSchoolgrade.class, "http://localhost:8081/grades");


    private ISchoolGrade ischoolgrade = Feign.builder()
            .client(new OkHttpClient())
            .encoder(new GsonEncoder())
            .decoder(new GsonDecoder())
            .logger(new Slf4jLogger())
            .logLevel(Logger.Level.FULL)
            .target(ISchoolGrade.class, "http://localhost:8085/schoolgrades");

    public IStudentSchoolgrade getIStudent(){
        return this.istudentschoolgrade;
    }

    public IGradeSchoolgrade getIGrade(){
        return this.igradeschoolgrade;
    }

    public ISchoolGrade getISchooldGrade(){
        return this.ischoolgrade;
    }
}