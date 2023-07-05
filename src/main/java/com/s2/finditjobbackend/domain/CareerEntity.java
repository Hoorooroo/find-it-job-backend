package com.s2.finditjobbackend.domain;

import com.s2.finditjobbackend.service.dto.CareerDTO;
import com.s2.finditjobbackend.service.dto.CompanyDTO;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "career")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CareerEntity {

    @Id
    @Column(name = "career_id")
    private String careerId;

    @Column(name = "title")
    private String title;

    @Column(name = "job")
    private String job;

    @Column(name = "url")
    private String url;

    @Column(name = "sub_title")
    private String subTitle;

    @Column(name = "start_date")
    private LocalDateTime startDate;

    @Column(name = "end_date")
    private LocalDateTime endDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private CompanyEntity company;

    @Builder
    public CareerEntity(String careerId, String title, String job, String url, String subTitle, LocalDateTime startDate, LocalDateTime endDate, CompanyEntity company) {
        this.careerId = careerId;
        this.title = title;
        this.job = job;
        this.url = url;
        this.subTitle = subTitle;
        this.startDate = startDate;
        this.endDate = endDate;
        this.company = company;
    }

    public CareerDTO.Row mappingRow() {
        return CareerDTO.Row.builder()
                .careerId(this.getCareerId())
                .title(this.getTitle())
                .job(this.getJob())
                .url(this.getUrl())
                .subTitle(this.getSubTitle())
                .startDate(this.getStartDate())
                .endDate(this.getEndDate())
                .build();
    }

}
