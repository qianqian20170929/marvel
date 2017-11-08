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
 * | TBL_ID      | bigint(20)    | NO   | PRI | NULL    |       |
 * | PARAM_KEY   | varchar(256)  | NO   | PRI | NULL    |       |
 * | PARAM_VALUE | varchar(4000) | YES  |     | NULL    |       |
 */
@Entity
@Table(name = "TABLE_PARAMS")
public class TableParamsEntity implements Serializable {

    private static final long serialVersionUID = 5651900771450458070L;

    @Getter
    @Setter
    @Column(name = "TBL_ID")
    private Long tblId;

    @Getter
    @Setter
    @Column(name = "PARAM_KEY")
    private String paramKey;

    @Getter
    @Setter
    @Column(name = "PARAM_VALUE")
    private String paramValue;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TableParamsEntity{");
        sb.append("tblId=").append(tblId);
        sb.append(", paramKey='").append(paramKey).append('\'');
        sb.append(", paramValue='").append(paramValue).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
