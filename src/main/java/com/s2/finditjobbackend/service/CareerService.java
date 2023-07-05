package com.s2.finditjobbackend.service;

import com.s2.finditjobbackend.domain.CareerEntity;
import com.s2.finditjobbackend.repository.CareerRepository;
import com.s2.finditjobbackend.repository.CompanyRepository;
import com.s2.finditjobbackend.service.dto.CareerDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class CareerService {
    private final CareerRepository careerRepository;

    public CareerService(CareerRepository careerRepository) {
        this.careerRepository = careerRepository;
    }

    @Transactional(readOnly = true)
    public List<CareerDTO.Row> getCareerList() {
        List<CareerEntity> careerEntityList = careerRepository.findAll();
        return careerEntityList.stream()
                .map(CareerEntity::mappingRow)
                .collect(Collectors.toList());
    }
}
