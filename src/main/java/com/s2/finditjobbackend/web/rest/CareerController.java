package com.s2.finditjobbackend.web.rest;

import com.s2.finditjobbackend.service.CareerService;
import com.s2.finditjobbackend.service.CompanyService;
import com.s2.finditjobbackend.service.dto.CareerDTO;
import com.s2.finditjobbackend.service.dto.CompanyDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "careers", description = "Career API")
@RestController
@RequestMapping("/api/career")
@RequiredArgsConstructor
public class CareerController {

    private final CareerService careerService;


    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "get career List", description = "채용 리스트 출력")
    public List<CareerDTO.Row> getCareerList() {
        return careerService.getCareerList();
    }
}
