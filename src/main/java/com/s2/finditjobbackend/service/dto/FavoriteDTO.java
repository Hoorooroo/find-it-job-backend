package com.s2.finditjobbackend.service.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
public class FavoriteDTO {

    @Schema(name = "FavoriteRow")
    @Getter
    @Setter
    @Builder
    @ToString
    public static class Row {
        private String favoriteId;
        private String userId;
        private LocalDateTime insertDate;
    }
}
