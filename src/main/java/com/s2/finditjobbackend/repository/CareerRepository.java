package com.s2.finditjobbackend.repository;

import com.s2.finditjobbackend.domain.CareerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CareerRepository extends JpaRepository<CareerEntity, String>, JpaSpecificationExecutor<CareerEntity> {
}
