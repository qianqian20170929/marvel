package com.hackx.repository;

import com.hackx.entity.TablesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * Created by 曹磊(Hackx) on 2/11/2017.
 * Email: caolei@mobike.com
 */
public interface TablesRepository extends JpaRepository<TablesEntity, Long> {

    List<TablesEntity> findByDbId(Long dbId);

    Optional<TablesEntity> findByTblId(Long tblId);

}
