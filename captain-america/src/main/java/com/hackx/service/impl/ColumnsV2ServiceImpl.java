package com.hackx.service.impl;

import com.hackx.entity.ColumnsV2Entity;
import com.hackx.repository.ColumnsV2Repository;
import com.hackx.service.ColumnsV2Service;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * Created by 曹磊(Hackx) on 3/11/2017.
 * Email: caolei@mobike.com
 */
@Service
public class ColumnsV2ServiceImpl implements ColumnsV2Service {

    @Resource
    ColumnsV2Repository columnsV2Repository;

    @Override
    public Optional<ColumnsV2Entity> findByCdId(Long cdId) {
        return columnsV2Repository.findByCdId(cdId);
    }
}
