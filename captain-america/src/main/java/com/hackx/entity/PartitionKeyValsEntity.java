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
 * | PART_ID      | bigint(20)   | NO   | PRI | NULL    |       |
 * | PART_KEY_VAL | varchar(256) | YES  |     | NULL    |       |
 * | INTEGER_IDX  | int(11)      | NO   | PRI | NULL    |       |
 */
@Entity
@Table(name = "PARTITION_KEY_VALS")
public class PartitionKeyValsEntity implements Serializable {

    private static final long serialVersionUID = -8696204912017312143L;

    @Setter
    @Getter
    @Column(name = "PART_ID")
    private Long partId;

    @Setter
    @Getter
    @Column(name = "PART_KEY_VAL")
    private String partKeyVal;

    @Setter
    @Getter
    @Column(name = "INTEGER_IDX")
    private int integerIdx;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PartitionKeyValsEntity{");
        sb.append("partId=").append(partId);
        sb.append(", partKeyVal='").append(partKeyVal).append('\'');
        sb.append(", integerIdx=").append(integerIdx);
        sb.append('}');
        return sb.toString();
    }
}
