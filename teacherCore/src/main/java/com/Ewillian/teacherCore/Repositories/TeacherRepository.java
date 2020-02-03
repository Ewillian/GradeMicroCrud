package com.Ewillian.teacherCore.Repositories;

import com.Ewillian.teacherCore.Entities.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    List<Teacher> findAllByPKid(Long PKid);
}