package com.hackx.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by 曹磊(Hackx) on 2/11/2017.
 * Email: caolei@mobike.com
 * Schema:
 * | CD_ID       | bigint(20)    | NO   | PRI | NULL    |       |
 * | COMMENT     | varchar(256)  | YES  |     | NULL    |       |
 * | COLUMN_NAME | varchar(128)  | NO   | PRI | NULL    |       |
 * | TYPE_NAME   | varchar(4000) | YES  |     | NULL    |       |
 * | INTEGER_IDX | int(11)       | NO   |     | NULL    |       |
 */
@Data
@Entity
@Table(name = "COLUMNS_V2")
@IdClass(ColumnsV2Entity.ColumnsV2Pk.class)
public class ColumnsV2Entity {

    @Id
    @Column(name = "CD_ID")
    private Long cdId;


    @Column(name = "COMMENT")
    private String comment;

    @Id
    @Column(name = "COLUMN_NAME")
    private String columnName;


    @Column(name = "TYPE_NAME")
    private String typeName;


    @Column(name = "INTEGER_IDX")
    private int integerIDX;

    @Data
    public static class ColumnsV2Pk implements Serializable {

        public ColumnsV2Pk() {
        }

        public ColumnsV2Pk(Long cdId, String columnName) {
            this.cdId = cdId;
            this.columnName = columnName;
        }

        private static final long serialVersionUID = -5778619750562697653L;

        @Column(name = "CD_ID")
        private Long cdId;

        @Column(name = "COLUMN_NAME")
        private String columnName;

    }

}
