package com.hackx.service;

import com.hackx.entity.TablesEntity;

import java.util.List;
import java.util.Optional;

/**
 * Created by 曹磊(Hackx) on 3/11/2017.
 * Email: caolei@mobike.com
 */
public interface TablesService {

    List<TablesEntity> findByDbId(Long dbId);

    Optional<TablesEntity> findByTblId(Long tblId);

}
