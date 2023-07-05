package com.s2.finditjobbackend.domain;

import com.s2.finditjobbackend.service.dto.FavoriteDTO;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "favorite")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class FavoriteEntity {

    @Id
    @Column(name = "favorite_id")
    private String favoriteId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "career_id")
    private CareerEntity career;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @Column(name = "insert_date")
    private LocalDateTime insertDate;

    @Builder
    public FavoriteEntity(String favoriteId, CareerEntity career, UserEntity user, LocalDateTime insertDate) {
        this.favoriteId = favoriteId;
        this.career = career;
        this.user = user;
        this.insertDate = insertDate;
    }

    public FavoriteDTO.Row mappingRow() {
        return FavoriteDTO.Row.builder()
                .favoriteId(this.getFavoriteId())
                .insertDate(this.getInsertDate())
                .build();
    }
}
