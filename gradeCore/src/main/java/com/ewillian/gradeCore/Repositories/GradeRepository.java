package com.ewillian.gradeCore.Repositories;

import com.ewillian.gradeCore.Entities.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

public interface GradeRepository extends JpaRepository<Grade, Long> {
    List<Grade> findAllByPKid(Long PKid);
}
