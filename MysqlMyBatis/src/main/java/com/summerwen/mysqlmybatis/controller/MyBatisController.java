package com.summerwen.mysqlmybatis.controller;

import com.summerwen.mysqlmybatis.entity.StudentEntity;
import com.summerwen.mysqlmybatis.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 类描述
 *
 * @author wenjunpu
 * @Date 2022/06/09/16:56
 * @Description
 */
@RestController
public class MyBatisController {

    @Autowired
    StudentMapper studentMapper;

    @GetMapping("/list")
    public List<StudentEntity> list(){
        return studentMapper.list();
    }
}
