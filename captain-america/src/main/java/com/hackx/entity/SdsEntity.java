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
@Entity
@Table(name = "SDS")
public class SdsEntity implements Serializable {

    private static final long serialVersionUID = -2325151929546950649L;

    @Setter
    @Getter
    @Column(name = "SD_ID")
    private Long sdId;

    @Setter
    @Getter
    @Column(name = "CD_ID")
    private Long cdId;

    @Setter
    @Getter
    @Column(name = "INPUT_FORMAT")
    private String inputFormat;

    @Setter
    @Getter
    @Column(name = "IS_COMPRESSED")
    private int isCompressed;

    @Setter
    @Getter
    @Column(name = "IS_STOREDASSUBDIRECTORIES")
    private int isStoredAsSubDirectories;

    @Setter
    @Getter
    @Column(name = "LOCATION")
    private String location;

    @Setter
    @Getter
    @Column(name = "NUM_BUCKETS")
    private int numBuckets;

    @Setter
    @Getter
    @Column(name = "OUTPUT_FORMAT")
    private String outFormat;

    @Setter
    @Getter
    @Column(name = "SERDE_ID")
    private Long serdeId;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SdsEntity{");
        sb.append("sdId=").append(sdId);
        sb.append(", cdId=").append(cdId);
        sb.append(", inputFormat='").append(inputFormat).append('\'');
        sb.append(", isCompressed=").append(isCompressed);
        sb.append(", isStoredAsSubDirectories=").append(isStoredAsSubDirectories);
        sb.append(", location='").append(location).append('\'');
        sb.append(", numBuckets=").append(numBuckets);
        sb.append(", outFormat='").append(outFormat).append('\'');
        sb.append(", serdeId=").append(serdeId);
        sb.append('}');
        return sb.toString();
    }
}
