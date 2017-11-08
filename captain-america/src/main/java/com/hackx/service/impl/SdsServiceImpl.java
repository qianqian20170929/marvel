package com.hackx.service.impl;

import com.hackx.entity.SdsEntity;
import com.hackx.repository.SdsRepository;
import com.hackx.service.SdsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * Created by 曹磊(Hackx) on 3/11/2017.
 * Email: caolei@mobike.com
 */
@Service
public class SdsServiceImpl implements SdsService {

    @Resource
    SdsRepository sdsRepository;

    @Override
    public Optional<SdsEntity> findBySdId(Long sdId) {
        return sdsRepository.findBySdId(sdId);
    }
}
