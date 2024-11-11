package com.bezkoder.spring.thymeleaf.repository;

import com.bezkoder.spring.thymeleaf.entity.EmpEntity;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface EmpRepository extends JpaRepository<EmpEntity, Long> {
    Optional findById(Long id); 
    
}
