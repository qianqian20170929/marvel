package com.hackx.repository;

import com.hackx.entity.SdsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by 曹磊(Hackx) on 3/11/2017.
 * Email: caolei@mobike.com
 */
public interface SdsRepository extends JpaRepository<SdsEntity, Long> {

    Optional<SdsEntity> findBySdId(Long sdId);
}
