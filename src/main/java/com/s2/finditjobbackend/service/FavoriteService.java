package com.s2.finditjobbackend.service;

import com.s2.finditjobbackend.domain.FavoriteEntity;
import com.s2.finditjobbackend.repository.CareerRepository;
import com.s2.finditjobbackend.repository.FavoriteRepository;
import com.s2.finditjobbackend.service.dto.FavoriteDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class FavoriteService {
    private final FavoriteRepository favoriteRepository;

    public FavoriteService(FavoriteRepository favoriteRepository) {
        this.favoriteRepository = favoriteRepository;
    }

    @Transactional(readOnly = true)
    public List<FavoriteDTO.Row> getFavoriteList() {
        List<FavoriteEntity> favoriteEntityList = favoriteRepository.findAll();
        return favoriteEntityList.stream()
                .map(FavoriteEntity::mappingRow)
                .collect(Collectors.toList());
    }
}
