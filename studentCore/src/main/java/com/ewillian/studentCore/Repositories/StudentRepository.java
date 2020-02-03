package com.ewillian.studentCore.Repositories;

import com.ewillian.studentCore.Entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findAllByPKid(Long PKid);
}