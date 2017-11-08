package com.hackx.entity;

import lombok.Data;

import javax.persistence.*;
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
@Data
@Entity
@IdClass(PartitionKeysEntity.PartitionKeysPk.class)
@Table(name = "PARTITION_KEYS")
public class PartitionKeysEntity implements Serializable {

    private static final long serialVersionUID = -8141534700193555176L;

    @Id
    @Column(name = "TBL_ID")
    private Long tblId;


    @Column(name = "PKEY_COMMENT")
    private String pkeyComment;

    @Id
    @Column(name = "PKEY_NAME")
    private String pkeyName;


    @Column(name = "PKEY_TYPE")
    private String pkeyType;


    @Column(name = "INTEGER_IDX")
    private int integerIdx;

    @Data
    public static class PartitionKeysPk implements Serializable {

        public PartitionKeysPk() {
        }

        public PartitionKeysPk(Long tblId, String pkeyName) {
            this.tblId = tblId;
            this.pkeyName = pkeyName;
        }

        private static final long serialVersionUID = -5778619750562697653L;

        @Column(name = "TBL_ID")
        private Long tblId;

        @Column(name = "PKEY_NAME")
        private String pkeyName;

    }

}
