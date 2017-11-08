package com.hackx.service;

import com.hackx.entity.SdsEntity;

import java.util.Optional;

/**
 * Created by 曹磊(Hackx) on 3/11/2017.
 * Email: caolei@mobike.com
 */
public interface SdsService {

    Optional<SdsEntity> findBySdId(Long sdId);

}
