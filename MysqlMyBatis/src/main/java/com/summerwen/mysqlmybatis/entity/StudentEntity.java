package com.summerwen.mysqlmybatis.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName student
 */
@Data
public class StudentEntity implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private String age;

    private static final long serialVersionUID = 1L;
}