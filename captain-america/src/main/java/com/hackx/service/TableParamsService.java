package com.hackx.service;

import com.hackx.entity.TableParamsEntity;

import java.util.List;

/**
 * Created by 曹磊(Hackx) on 3/11/2017.
 * Email: caolei@mobike.com
 */
public interface TableParamsService {

    List<TableParamsEntity> findByTblId(Long tblId);

}
