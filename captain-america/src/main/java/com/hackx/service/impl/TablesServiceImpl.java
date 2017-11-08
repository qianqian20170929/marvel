package com.hackx.service.impl;

import com.hackx.entity.TablesEntity;
import com.hackx.repository.TablesRepository;
import com.hackx.service.TablesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * Created by 曹磊(Hackx) on 3/11/2017.
 * Email: caolei@mobike.com
 */
@Service
public class TablesServiceImpl implements TablesService {

    @Resource
    TablesRepository tablesRepository;

    @Override
    public List<TablesEntity> findByDbId(Long dbId) {
        return tablesRepository.findByDbId(dbId);
    }

    @Override
    public Optional<TablesEntity> findByTblId(Long tblId) {
        return tablesRepository.findByTblId(tblId);
    }
}
