package com.summerwen.common.domain;

import lombok.Data;

import java.io.Serializable;


/**
* 
* @TableName student
*/
@Data
public class Student implements Serializable {

    private Integer id;

    private String name;

    private String age;


}
