package com.hackx.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Entity
@Table(name = "IDXS")
public class IndexsEntity implements Serializable {

    private static final long serialVersionUID = 5315533336311835474L;

    @Setter
    @Getter
    @Column(name = "INDEX_ID")
    private Long indexId;

    @Setter
    @Getter
    @Column(name = "CREATE_TIME")
    private int createTime;

    @Setter
    @Getter
    @Column(name = "DEFERRED_REBUILD")
    private int deferredRebuild;

    @Setter
    @Getter
    @Column(name = "INDEX_HANDLER_CLASS")
    private String indexHandlerClass;

    @Setter
    @Getter
    @Column(name = "INDEX_NAME")
    private String indexName;

    @Setter
    @Getter
    @Column(name = "INDEX_TBL_ID")
    private Long indexTblId;

    @Setter
    @Getter
    @Column(name = "LAST_ACCESS_TIME")
    private int lastAccessTime;

    @Setter
    @Getter
    @Column(name = "ORIG_TBL_ID")
    private Long origTblId;

    @Setter
    @Getter
    @Column(name = "SD_ID")
    private Long sdId;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("IndexsEntity{");
        sb.append("indexId=").append(indexId);
        sb.append(", createTime=").append(createTime);
        sb.append(", deferredRebuild=").append(deferredRebuild);
        sb.append(", indexHandlerClass='").append(indexHandlerClass).append('\'');
        sb.append(", indexName='").append(indexName).append('\'');
        sb.append(", indexTblId=").append(indexTblId);
        sb.append(", lastAccessTime=").append(lastAccessTime);
        sb.append(", origTblId=").append(origTblId);
        sb.append(", sdId=").append(sdId);
        sb.append('}');
        return sb.toString();
    }
}
