package com.s2.finditjobbackend.service;

import com.s2.finditjobbackend.domain.CompanyEntity;
import com.s2.finditjobbackend.repository.CompanyRepository;
import com.s2.finditjobbackend.service.dto.CompanyDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class CompanyService {
    private final CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Transactional(readOnly = true)
    public List<CompanyDTO.Row> getCompanyList() {
        List<CompanyEntity> companyEntityList = companyRepository.findAll();
        return companyEntityList.stream()
                .map(CompanyEntity::mappingRow)
                .collect(Collectors.toList());
    }
}
