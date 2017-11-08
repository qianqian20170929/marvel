package com.hackx.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by 曹磊(Hackx) on 2/11/2017.
 * Email: caolei@mobike.com
 * Schema:
 * | INDEX_ID            | bigint(20)    | NO   | PRI | NULL    |       |
 * | CREATE_TIME         | int(11)       | NO   |     | NULL    |       |
 * | DEFERRED_REBUILD    | bit(1)        | NO   |     | NULL    |       |
 * | INDEX_HANDLER_CLASS | varchar(4000) | YES  |     | NULL    |       |
 * | INDEX_NAME          | varchar(128)  | YES  | MUL | NULL    |       |
 * | INDEX_TBL_ID        | bigint(20)    | YES  | MUL | NULL    |       |
 * | LAST_ACCESS_TIME    | int(11)       | NO   |     | NULL    |       |
 * | ORIG_TBL_ID         | bigint(20)    | YES  | MUL | NULL    |       |
 * | SD_ID               | bigint(20)    | YES  | MUL | NULL    |       |
 */
@Data
@Entity
@Table(name = "IDXS")
public class IndexsEntity implements Serializable {

    private static final long serialVersionUID = 5315533336311835474L;

    @Id
    @Column(name = "INDEX_ID")
    private Long indexId;


    @Column(name = "CREATE_TIME")
    private int createTime;


    @Column(name = "DEFERRED_REBUILD", columnDefinition = "BIT", length = 1)
    private int deferredRebuild;


    @Column(name = "INDEX_HANDLER_CLASS")
    private String indexHandlerClass;


    @Column(name = "INDEX_NAME")
    private String indexName;


    @Column(name = "INDEX_TBL_ID")
    private Long indexTblId;


    @Column(name = "LAST_ACCESS_TIME")
    private int lastAccessTime;


    @Column(name = "ORIG_TBL_ID")
    private Long origTblId;


    @Column(name = "SD_ID")
    private Long sdId;

}
