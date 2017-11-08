package com.hackx.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by 曹磊(Hackx) on 2/11/2017.
 * Email: caolei@mobike.com
 * Schema:
 * | TBL_ID      | bigint(20)    | NO   | PRI | NULL    |       |
 * | PARAM_KEY   | varchar(256)  | NO   | PRI | NULL    |       |
 * | PARAM_VALUE | varchar(4000) | YES  |     | NULL    |       |
 */
@Data
@Entity
@IdClass(TableParamsEntity.TableParamsPk.class)
@Table(name = "TABLE_PARAMS")
public class TableParamsEntity implements Serializable {

    private static final long serialVersionUID = 5651900771450458070L;

    @Id
    @Column(name = "TBL_ID")
    private Long tblId;

    @Id
    @Column(name = "PARAM_KEY")
    private String paramKey;

   
    @Column(name = "PARAM_VALUE")
    private String paramValue;

    @Data
    public static class TableParamsPk implements Serializable {

        private static final long serialVersionUID = -5778619750562697653L;

        public TableParamsPk() {
        }

        public TableParamsPk(Long tblId, String paramKey) {
            this.tblId = tblId;
            this.paramKey = paramKey;
        }

        @Column(name = "TBL_ID")
        private Long tblId;


        @Column(name = "PARAM_KEY")
        private String paramKey;


    }

}
