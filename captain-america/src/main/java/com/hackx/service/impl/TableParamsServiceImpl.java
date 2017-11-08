package com.hackx.service.impl;

import com.hackx.entity.TableParamsEntity;
import com.hackx.repository.TableParamsRepository;
import com.hackx.service.TableParamsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * Created by 曹磊(Hackx) on 3/11/2017.
 * Email: caolei@mobike.com
 */
@Service
public class TableParamsServiceImpl implements TableParamsService {

    @Resource
    TableParamsRepository tableParamsRepository;

    @Override
    public Optional<List<TableParamsEntity>> findByTblId(Long tblId) {
        return tableParamsRepository.findByTblId(tblId);
    }

    @Override
    public Optional<List<TableParamsEntity>> findByParamKey(String paramKey) {
        return tableParamsRepository.findByParamKey(paramKey);
    }

    @Override
    public Optional<TableParamsEntity> findByTblIdAndParamKey(Long tblId, String paramKey) {
        return tableParamsRepository.findByTblIdAndParamKey(tblId, paramKey);
    }
}
