package com.hackx.repository;

import com.hackx.entity.ColumnsV2Entity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by 曹磊(Hackx) on 3/11/2017.
 * Email: caolei@mobike.com
 */
public interface ColumnsV2Repository extends JpaRepository<ColumnsV2Entity, Long> {

    Optional<ColumnsV2Entity> findByCdId(Long cdId);
}