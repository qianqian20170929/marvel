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
 * | SD_ID                     | bigint(20)    | NO   | PRI | NULL    |       |
 * | CD_ID                     | bigint(20)    | YES  | MUL | NULL    |       |
 * | INPUT_FORMAT              | varchar(4000) | YES  |     | NULL    |       |
 * | IS_COMPRESSED             | bit(1)        | NO   |     | NULL    |       |
 * | IS_STOREDASSUBDIRECTORIES | bit(1)        | NO   |     | NULL    |       |
 * | LOCATION                  | varchar(4000) | YES  |     | NULL    |       |
 * | NUM_BUCKETS               | int(11)       | NO   |     | NULL    |       |
 * | OUTPUT_FORMAT             | varchar(4000) | YES  |     | NULL    |       |
 * | SERDE_ID                  | bigint(20)    | YES  | MUL | NULL    |       |
 */
@Data
@Entity
@Table(name = "SDS")
public class SdsEntity implements Serializable {

    private static final long serialVersionUID = -2325151929546950649L;

    @Id
    @Column(name = "SD_ID")
    private Long sdId;


    @Column(name = "CD_ID")
    private Long cdId;


    @Column(name = "INPUT_FORMAT")
    private String inputFormat;


    @Column(name = "IS_COMPRESSED", columnDefinition = "BIT", length = 1)
    private int isCompressed;


    @Column(name = "IS_STOREDASSUBDIRECTORIES", columnDefinition = "BIT", length = 1)
    private int isStoredAsSubDirectories;


    @Column(name = "LOCATION")
    private String location;


    @Column(name = "NUM_BUCKETS")
    private int numBuckets;


    @Column(name = "OUTPUT_FORMAT")
    private String outFormat;


    @Column(name = "SERDE_ID")
    private Long serdeId;

}
