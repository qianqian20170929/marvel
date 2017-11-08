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
 * Schema
 * | DB_ID           | bigint(20)    | NO   | PRI | NULL    |       |
 * | DESC            | varchar(4000) | YES  |     | NULL    |       |
 * | DB_LOCATION_URI | varchar(4000) | NO   |     | NULL    |       |
 * | NAME            | varchar(128)  | YES  | UNI | NULL    |       |
 * | OWNER_NAME      | varchar(128)  | YES  |     | NULL    |       |
 * | OWNER_TYPE      | varchar(10)   | YES  |     | NULL    |       |
 */
@Entity
@Table(name = "DBS")
public class DatabasesEntity implements Serializable {

    private static final long serialVersionUID = -9171589798193062804L;

    @Setter
    @Getter
    @Column(name = "DB_ID")
    private Long dbId;

    @Setter
    @Getter
    @Column(name = "DESC")
    private String desc;

    @Setter
    @Getter
    @Column(name = "DB_LOCATION_URI")
    private String dbLocationUri;

    @Setter
    @Getter
    @Column(name = "NAME")
    private String name;

    @Setter
    @Getter
    @Column(name = "OWNER_NAME")
    private String ownerName;

    @Setter
    @Getter
    @Column(name = "OWNER_TYPE")
    private String ownerType;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("DatabasesEntity{");
        sb.append("dbId=").append(dbId);
        sb.append(", desc='").append(desc).append('\'');
        sb.append(", dbLocationUri='").append(dbLocationUri).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", ownerName='").append(ownerName).append('\'');
        sb.append(", ownerType='").append(ownerType).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
