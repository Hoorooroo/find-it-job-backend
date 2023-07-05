package com.s2.finditjobbackend.repository;

import com.s2.finditjobbackend.domain.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CompanyRepository extends JpaRepository<CompanyEntity, String>, JpaSpecificationExecutor<CompanyEntity> {
}
