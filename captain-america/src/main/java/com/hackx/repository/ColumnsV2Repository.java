package com.hackx.repository;

import com.hackx.entity.ColumnsV2Entity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * Created by 曹磊(Hackx) on 3/11/2017.
 * Email: caolei@mobike.com
 */
public interface ColumnsV2Repository extends JpaRepository<ColumnsV2Entity, ColumnsV2Entity.ColumnsV2Pk> {

    Optional<List<ColumnsV2Entity>> findByCdId(Long cdId);

    Optional<List<ColumnsV2Entity>> findByColumnName(String columnName);

    Optional<ColumnsV2Entity> findByCdIdAndColumnName(Long cdId, String columnName);
}