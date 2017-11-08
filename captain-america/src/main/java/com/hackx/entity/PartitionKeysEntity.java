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
 * | TBL_ID       | bigint(20)    | NO   | PRI | NULL    |       |
 * | PKEY_COMMENT | varchar(4000) | YES  |     | NULL    |       |
 * | PKEY_NAME    | varchar(128)  | NO   | PRI | NULL    |       |
 * | PKEY_TYPE    | varchar(767)  | NO   |     | NULL    |       |
 * | INTEGER_IDX  | int(11)       | NO   |     | NULL    |       |
 */
@Entity
@Table(name = "PARTITION_KEYS")
public class PartitionKeysEntity implements Serializable {

    private static final long serialVersionUID = -8141534700193555176L;

    @Setter
    @Getter
    @Column(name = "TBL_ID")
    private Long tblId;

    @Setter
    @Getter
    @Column(name = "PKEY_COMMENT")
    private String pkeyComment;

    @Setter
    @Getter
    @Column(name = "PKEY_NAME")
    private String pkeyName;

    @Setter
    @Getter
    @Column(name = "PKEY_TYPE")
    private String pkeyType;

    @Setter
    @Getter
    @Column(name = "INTEGER_IDX")
    private int integerIdx;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PartitionKeysEntity{");
        sb.append("tblId=").append(tblId);
        sb.append(", pkeyComment='").append(pkeyComment).append('\'');
        sb.append(", pkeyName='").append(pkeyName).append('\'');
        sb.append(", pkeyType='").append(pkeyType).append('\'');
        sb.append(", integerIdx=").append(integerIdx);
        sb.append('}');
        return sb.toString();
    }
}
