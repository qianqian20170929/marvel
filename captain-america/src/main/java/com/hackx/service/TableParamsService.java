package com.hackx.service;

import com.hackx.entity.TableParamsEntity;

import java.util.List;
import java.util.Optional;

/**
 * Created by 曹磊(Hackx) on 3/11/2017.
 * Email: caolei@mobike.com
 */
public interface TableParamsService {

    Optional<List<TableParamsEntity>> findByTblId(Long tblId);

    Optional<List<TableParamsEntity>> findByParamKey(String paramKey);

    Optional<TableParamsEntity> findByTblIdAndParamKey(Long tblId, String paramKey);

}
