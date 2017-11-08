package com.hackx.service.impl;

import com.hackx.entity.DatabasesEntity;
import com.hackx.repository.DatabasesRepository;
import com.hackx.service.DatabasesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * Created by 曹磊(Hackx) on 3/11/2017.
 * Email: caolei@mobike.com
 */
@Service
public class DatabasesServiceImpl implements DatabasesService {

    @Resource
    DatabasesRepository databasesRepository;

    @Override
    public List<DatabasesEntity> findAll() {
        return databasesRepository.findAll();
    }

    @Override
    public Optional<DatabasesEntity> findByDbId(Long dbId) {
        return databasesRepository.findByDbId(dbId);
    }
}
