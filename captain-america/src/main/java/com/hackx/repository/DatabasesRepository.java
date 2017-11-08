package com.hackx.repository;

import com.hackx.entity.DatabasesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * Created by 曹磊(Hackx) on 3/11/2017.
 * Email: caolei@mobike.com
 */
public interface DatabasesRepository extends JpaRepository<DatabasesEntity, Long> {

    Optional<DatabasesEntity> findByDbId(Long dbId);

    List<DatabasesEntity> findAll();

}
