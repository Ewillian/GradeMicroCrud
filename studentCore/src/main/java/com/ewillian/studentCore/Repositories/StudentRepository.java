package com.ewillian.studentCore.Repositories;

import com.ewillian.studentCore.Entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}