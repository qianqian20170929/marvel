package com.hackx.service;

import com.hackx.entity.ColumnsV2Entity;

import java.util.Optional;

/**
 * Created by 曹磊(Hackx) on 3/11/2017.
 * Email: caolei@mobike.com
 */
public interface ColumnsV2Service {

    Optional<ColumnsV2Entity> findByCdId(Long cdId);

}
