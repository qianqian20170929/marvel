package com.hackx.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by 曹磊(Hackx) on 2/11/2017.
 * Email: caolei@mobike.com
 * Schema:
 * | PART_ID          | bigint(20)   | NO   | PRI | NULL    |       |
 * | CREATE_TIME      | int(11)      | NO   |     | NULL    |       |
 * | LAST_ACCESS_TIME | int(11)      | NO   |     | NULL    |       |
 * | PART_NAME        | varchar(767) | YES  | MUL | NULL    |       |
 * | SD_ID            | bigint(20)   | YES  | MUL | NULL    |       |
 * | TBL_ID           | bigint(20)   | YES  | MUL | NULL    |       |
 * | LINK_TARGET_ID   | bigint(20)   | YES  | MUL | NULL    |       |
 */
@Data
@Entity
@Table(name = "PARTITIONS")
public class PartitionsEntity implements Serializable {

    private static final long serialVersionUID = 3433555340699263461L;

    @Id
    @Column(name = "PART_ID")
    private Long partId;

    
    @Column(name = "CREATE_TIME")
    private int createTime;

    
    @Column(name = "LAST_ACCESS_TIME")
    private int lastAccessTime;

    
    @Column(name = "PART_NAME")
    private String partName;

    
    @Column(name = "SD_ID")
    private Long sdId;

    
    @Column(name = "TBL_ID")
    private Long tblId;

    
    @Column(name = "LINK_TARGET_ID")
    private Long linkTargetId;

}
