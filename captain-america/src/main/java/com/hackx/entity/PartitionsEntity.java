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
 * | PART_ID          | bigint(20)   | NO   | PRI | NULL    |       |
 * | CREATE_TIME      | int(11)      | NO   |     | NULL    |       |
 * | LAST_ACCESS_TIME | int(11)      | NO   |     | NULL    |       |
 * | PART_NAME        | varchar(767) | YES  | MUL | NULL    |       |
 * | SD_ID            | bigint(20)   | YES  | MUL | NULL    |       |
 * | TBL_ID           | bigint(20)   | YES  | MUL | NULL    |       |
 * | LINK_TARGET_ID   | bigint(20)   | YES  | MUL | NULL    |       |
 */
@Entity
@Table(name = "PARTITIONS")
public class PartitionsEntity implements Serializable {

    private static final long serialVersionUID = 3433555340699263461L;

    @Setter
    @Getter
    @Column(name = "PART_ID")
    private Long partId;

    @Setter
    @Getter
    @Column(name = "CREATE_TIME")
    private int createTime;

    @Setter
    @Getter
    @Column(name = "LAST_ACCESS_TIME")
    private int lastAccessTime;

    @Setter
    @Getter
    @Column(name = "PART_NAME")
    private String partName;

    @Setter
    @Getter
    @Column(name = "SD_ID")
    private Long sdId;

    @Setter
    @Getter
    @Column(name = "TBL_ID")
    private Long tblId;

    @Setter
    @Getter
    @Column(name = "LINK_TARGET_ID")
    private Long linkTargetId;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PartitionsEntity{");
        sb.append("partId=").append(partId);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastAccessTime=").append(lastAccessTime);
        sb.append(", partName='").append(partName).append('\'');
        sb.append(", sdId=").append(sdId);
        sb.append(", tblId=").append(tblId);
        sb.append(", linkTargetId=").append(linkTargetId);
        sb.append('}');
        return sb.toString();
    }
}
