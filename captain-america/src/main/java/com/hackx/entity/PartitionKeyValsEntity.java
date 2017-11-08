package com.hackx.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by 曹磊(Hackx) on 2/11/2017.
 * Email: caolei@mobike.com
 * Schema:
 * | PART_ID      | bigint(20)   | NO   | PRI | NULL    |       |
 * | PART_KEY_VAL | varchar(256) | YES  |     | NULL    |       |
 * | INTEGER_IDX  | int(11)      | NO   | PRI | NULL    |       |
 */
@Data
@Entity
@IdClass(PartitionKeyValsEntity.PartitionKeyValsPk.class)
@Table(name = "PARTITION_KEY_VALS")
public class PartitionKeyValsEntity implements Serializable {

    private static final long serialVersionUID = -8696204912017312143L;

    @Id
    @Column(name = "PART_ID")
    private Long partId;


    @Column(name = "PART_KEY_VAL")
    private String partKeyVal;

    @Id
    @Column(name = "INTEGER_IDX")
    private int integerIdx;

    @Data
    public static class PartitionKeyValsPk implements Serializable {

        private static final long serialVersionUID = -5778619750562697653L;

        public PartitionKeyValsPk() {
        }

        public PartitionKeyValsPk(Long partId, int integerIdx) {
            this.partId = partId;
            this.integerIdx = integerIdx;
        }

        @Column(name = "PART_ID")
        private Long partId;

        @Column(name = "INTEGER_IDX")
        private int integerIdx;

    }

}
