package com.hackx.service;

import com.hackx.entity.DatabasesEntity;

import java.util.List;
import java.util.Optional;

/**
 * Created by 曹磊(Hackx) on 3/11/2017.
 * Email: caolei@mobike.com
 */
public interface DatabasesService {

    List<DatabasesEntity> findAll();

    Optional<DatabasesEntity> findByDbId(Long dbId);
}
