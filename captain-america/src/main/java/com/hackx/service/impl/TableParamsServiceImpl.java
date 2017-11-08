package com.hackx.service.impl;

import com.hackx.entity.TableParamsEntity;
import com.hackx.repository.TableParamsRepository;
import com.hackx.service.TableParamsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 曹磊(Hackx) on 3/11/2017.
 * Email: caolei@mobike.com
 */
@Service
public class TableParamsServiceImpl implements TableParamsService {

    @Resource
    TableParamsRepository tableParamsRepository;

    @Override
    public List<TableParamsEntity> findByTblId(Long tblId) {
        return tableParamsRepository.findByTblId(tblId);
    }
}
