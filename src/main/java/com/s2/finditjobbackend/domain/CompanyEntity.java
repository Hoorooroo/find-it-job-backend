package com.s2.finditjobbackend.domain;

import com.s2.finditjobbackend.service.dto.CompanyDTO;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "company")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CompanyEntity {

    @Id
    @Column(name = "company_id")
    private String companyId;

    @Column(name = "name")
    private String name;

    @Column(name = "url")
    private String url;

    @OneToMany(mappedBy = "company", fetch = FetchType.LAZY)
    private List<CareerEntity> careers = new ArrayList<>();

    @Builder
    public CompanyEntity(String companyId, String name, String url, List<CareerEntity> careers) {
        this.companyId = companyId;
        this.name = name;
        this.url = url;
        this.careers = careers;
    }

    public CompanyDTO.Row mappingRow() {
        return CompanyDTO.Row.builder()
                .companyId(this.getCompanyId())
                .name(this.getName())
                .url(this.getUrl())
                .build();
    }
}
