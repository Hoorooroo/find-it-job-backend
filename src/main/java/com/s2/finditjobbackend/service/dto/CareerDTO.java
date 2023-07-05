package com.s2.finditjobbackend.service.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
public class CareerDTO {


    @Schema(name = "CareerRow")
    @Getter
    @Setter
    @Builder
    @ToString
    public static class Row {
        private String careerId;
        private String companyId;
        private String title;
        private String job;
        private String url;
        private String subTitle;
        private LocalDateTime startDate;
        private LocalDateTime endDate;
    }
}
