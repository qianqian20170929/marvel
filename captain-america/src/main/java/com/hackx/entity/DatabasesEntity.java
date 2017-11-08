package com.hackx.entity;

import lombok.Data;

import javax.persistence.*;
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
@Data
@Entity
@Table(name = "DBS")
public class DatabasesEntity implements Serializable {

    private static final long serialVersionUID = -9171589798193062804L;

    @Id
    @Column(name = "DB_ID")
    private Long dbId;


    @Column(name = "DESC")
    private String desc;


    @Column(name = "DB_LOCATION_URI")
    private String dbLocationUri;


    @Column(name = "NAME")
    private String name;


    @Column(name = "OWNER_NAME")
    private String ownerName;


    @Column(name = "OWNER_TYPE")
    private String ownerType;

}
