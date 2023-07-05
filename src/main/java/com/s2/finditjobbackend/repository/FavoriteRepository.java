package com.s2.finditjobbackend.repository;

import com.s2.finditjobbackend.domain.FavoriteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface FavoriteRepository extends JpaRepository<FavoriteEntity, String>, JpaSpecificationExecutor<FavoriteEntity> {
}
