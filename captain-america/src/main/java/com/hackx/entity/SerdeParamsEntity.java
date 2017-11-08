package com.hackx.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by 曹磊(Hackx) on 2/11/2017.
 * Email: caolei@mobike.com
 * Schema:
 * | SERDE_ID    | bigint(20)    | NO   | PRI | NULL    |       |
 * | PARAM_KEY   | varchar(256)  | NO   | PRI | NULL    |       |
 * | PARAM_VALUE | varchar(4000) | YES  |     | NULL    |       |
 */
@Data
@Entity
@IdClass(SerdeParamsEntity.SerdeParamsPk.class)
@Table(name = "SERDE_PARAMS")
public class SerdeParamsEntity implements Serializable {

    private static final long serialVersionUID = -5709229424960043695L;

    @Id
    @Column(name = "SERDE_ID")
    private Long serdeId;

    @Id
    @Column(name = "PARAM_KEY")
    private String paramKey;

    
    @Column(name = "PARAM_VALUE")
    private String paramValue;

    @Data
    public static class SerdeParamsPk implements Serializable {

        private static final long serialVersionUID = -5778619750562697653L;

        public SerdeParamsPk() {
        }

        public SerdeParamsPk(Long serdeId, String paramKey) {
            this.serdeId = serdeId;
            this.paramKey = paramKey;
        }

        @Column(name = "SERDE_ID")
        private Long serdeId;

        @Column(name = "PARAM_KEY")
        private String paramKey;

    }

}
