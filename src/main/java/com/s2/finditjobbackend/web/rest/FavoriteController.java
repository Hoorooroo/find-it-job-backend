package com.s2.finditjobbackend.web.rest;

import com.s2.finditjobbackend.service.FavoriteService;
import com.s2.finditjobbackend.service.dto.FavoriteDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "favorites", description = "Favorite API")
@RestController
@RequestMapping("/api/favorite")
@RequiredArgsConstructor
public class FavoriteController {

    private final FavoriteService favoriteService;


    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "get favorite List", description = "찜 리스트 출력")
    public List<FavoriteDTO.Row> getFavoriteList() {
        return favoriteService.getFavoriteList();
    }
}
