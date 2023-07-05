package com.s2.finditjobbackend.web.rest;

import com.s2.finditjobbackend.domain.CompanyEntity;
import com.s2.finditjobbackend.service.CompanyService;
import com.s2.finditjobbackend.service.dto.CompanyDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "companies", description = "Company API")
@RestController
@RequestMapping("/api/company")
@RequiredArgsConstructor
public class CompanyController {

    private final CompanyService companyService;


    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "get company List", description = "회사 리스트 출력")
    public List<CompanyDTO.Row> getCompanyList() {
        return companyService.getCompanyList();
    }
}
