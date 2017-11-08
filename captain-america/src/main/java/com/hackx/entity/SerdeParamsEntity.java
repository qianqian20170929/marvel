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
 * | SERDE_ID    | bigint(20)    | NO   | PRI | NULL    |       |
 * | PARAM_KEY   | varchar(256)  | NO   | PRI | NULL    |       |
 * | PARAM_VALUE | varchar(4000) | YES  |     | NULL    |       |
 */
@Entity
@Table(name = "SERDE_PARAMS")
public class SerdeParamsEntity implements Serializable {

    private static final long serialVersionUID = -5709229424960043695L;

    @Setter
    @Getter
    @Column(name = "SERDE_ID")
    private Long serdeId;

    @Setter
    @Getter
    @Column(name = "PARAM_KEY")
    private String paramKey;

    @Setter
    @Getter
    @Column(name = "PARAM_VALUE")
    private String paramValue;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SerdeParamsEntity{");
        sb.append("serdeId=").append(serdeId);
        sb.append(", paramKey='").append(paramKey).append('\'');
        sb.append(", paramValue='").append(paramValue).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
