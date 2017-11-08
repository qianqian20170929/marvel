package com.hackx.repository;

import com.hackx.entity.TableParamsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * Created by 曹磊(Hackx) on 3/11/2017.
 * Email: caolei@mobike.com
 */
public interface TableParamsRepository extends JpaRepository<TableParamsEntity, TableParamsEntity.TableParamsPk> {

    Optional<List<TableParamsEntity>> findByTblId(Long tblId);

    Optional<List<TableParamsEntity>> findByParamKey(String paramKey);

    Optional<TableParamsEntity> findByTblIdAndParamKey(Long tblId, String paramKey);

}
