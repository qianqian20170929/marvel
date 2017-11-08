package com.hackx.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
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
@Entity
@Table(name = "TBLS")
public class TablesEntity implements Serializable {

    private static final long serialVersionUID = -7442409683634179190L;

    @Setter
    @Getter
    @Column(name = "TBL_ID")
    private Long tblId;

    @Setter
    @Getter
    @Column(name = "CREATE_TIME")
    private int createTime;

    @Setter
    @Getter
    @Column(name = "DB_ID")
    @OneToMany
    private Long dbId;

    @Setter
    @Getter
    @Column(name = "LAST_ACCESS_TIME")
    private int lastAccessTime;

    @Setter
    @Getter
    @Column(name = "OWNER")
    private String owner;

    @Setter
    @Getter
    @Column(name = "RETENTION")
    private int retention;

    @Setter
    @Getter
    @Column(name = "SD_ID")
    private Long sdId;

    @Setter
    @Getter
    @Column(name = "TBL_NAME")
    private String tblName;

    @Setter
    @Getter
    @Column(name = "TBL_TYPE")
    private String tblType;

    @Setter
    @Getter
    @Column(name = "VIEW_EXPANDED_TEXT")
    private String viewExpandedText;

    @Setter
    @Getter
    @Column(name = "VIEW_ORIGINAL_TEXT")
    private String viewOriginalText;

    @Setter
    @Getter
    @Column(name = "LINK_TARGET_ID")
    private Long linkTargetId;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TablesEntity{");
        sb.append("tblId=").append(tblId);
        sb.append(", createTime=").append(createTime);
        sb.append(", dbId=").append(dbId);
        sb.append(", lastAccessTime=").append(lastAccessTime);
        sb.append(", owner='").append(owner).append('\'');
        sb.append(", retention=").append(retention);
        sb.append(", sdId=").append(sdId);
        sb.append(", tblName='").append(tblName).append('\'');
        sb.append(", tblType='").append(tblType).append('\'');
        sb.append(", viewExpandedText='").append(viewExpandedText).append('\'');
        sb.append(", viewOriginalText='").append(viewOriginalText).append('\'');
        sb.append(", linkTargetId=").append(linkTargetId);
        sb.append('}');
        return sb.toString();
    }
}
