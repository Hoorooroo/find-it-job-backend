package com.s2.finditjobbackend.service.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class CompanyDTO {

    @Schema(name = "CompanyRow")
    @Getter
    @Setter
    @Builder
    @ToString
    public static class Row {
        private String companyId;
        private String name;
        private String url;
    }
}
