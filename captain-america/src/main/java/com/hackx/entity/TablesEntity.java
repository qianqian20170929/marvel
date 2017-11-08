package com.hackx.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by 曹磊(Hackx) on 2/11/2017.
 * Email: caolei@mobike.com
 * Schema:
 * | TBL_ID             | bigint(20)   | NO   | PRI | NULL    |       |
 * | CREATE_TIME        | int(11)      | NO   |     | NULL    |       |
 * | DB_ID              | bigint(20)   | YES  | MUL | NULL    |       |
 * | LAST_ACCESS_TIME   | int(11)      | NO   |     | NULL    |       |
 * | OWNER              | varchar(767) | YES  |     | NULL    |       |
 * | RETENTION          | int(11)      | NO   |     | NULL    |       |
 * | SD_ID              | bigint(20)   | YES  | MUL | NULL    |       |
 * | TBL_NAME           | varchar(128) | YES  | MUL | NULL    |       |
 * | TBL_TYPE           | varchar(128) | YES  |     | NULL    |       |
 * | VIEW_EXPANDED_TEXT | mediumtext   | YES  |     | NULL    |       |
 * | VIEW_ORIGINAL_TEXT | mediumtext   | YES  |     | NULL    |       |
 * | LINK_TARGET_ID     | bigint(20)   | YES  | MUL | NULL    |       |
 */
@Data
@Entity
@Table(name = "TBLS")
public class TablesEntity implements Serializable {

    private static final long serialVersionUID = -7442409683634179190L;

    @Id
    @Column(name = "TBL_ID")
    private Long tblId;


    @Column(name = "CREATE_TIME")
    private int createTime;


    @Column(name = "DB_ID")
    private Long dbId;


    @Column(name = "LAST_ACCESS_TIME")
    private int lastAccessTime;


    @Column(name = "OWNER")
    private String owner;


    @Column(name = "RETENTION")
    private int retention;


    @Column(name = "SD_ID")
    private Long sdId;


    @Column(name = "TBL_NAME")
    private String tblName;


    @Column(name = "TBL_TYPE")
    private String tblType;


    @Column(name = "VIEW_EXPANDED_TEXT", columnDefinition = "MEDIUMTEXT")
    private String viewExpandedText;


    @Column(name = "VIEW_ORIGINAL_TEXT", columnDefinition = "MEDIUMTEXT")
    private String viewOriginalText;


    @Column(name = "LINK_TARGET_ID")
    private Long linkTargetId;

}
