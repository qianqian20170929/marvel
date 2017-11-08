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
 * | CD_ID       | bigint(20)    | NO   | PRI | NULL    |       |
 * | COMMENT     | varchar(256)  | YES  |     | NULL    |       |
 * | COLUMN_NAME | varchar(128)  | NO   | PRI | NULL    |       |
 * | TYPE_NAME   | varchar(4000) | YES  |     | NULL    |       |
 * | INTEGER_IDX | int(11)       | NO   |     | NULL    |       |
 */
@Entity
@Table(name = "COLUMNS_V2")
public class ColumnsV2Entity implements Serializable {

    private static final long serialVersionUID = -182574339007225290L;

    @Setter
    @Getter
    @Column(name = "CD_ID")
    private Long cdId;

    @Setter
    @Getter
    @Column(name = "COMMENT")
    private String comment;

    @Setter
    @Getter
    @Column(name = "COLUMN_NAME")
    private String columnName;

    @Setter
    @Getter
    @Column(name = "TYPE_NAME")
    private String typeName;

    @Setter
    @Getter
    @Column(name = "INTEGER_IDX")
    private int integerIDX;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ColumnsV2Entity{");
        sb.append("cdId=").append(cdId);
        sb.append(", comment='").append(comment).append('\'');
        sb.append(", columnName='").append(columnName).append('\'');
        sb.append(", typeName='").append(typeName).append('\'');
        sb.append(", integerIDX=").append(integerIDX);
        sb.append('}');
        return sb.toString();
    }
}
