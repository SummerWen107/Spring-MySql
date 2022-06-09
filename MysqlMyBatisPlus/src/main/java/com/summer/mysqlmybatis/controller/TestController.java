package com.summer.mysqlmybatis.controller;

import com.summer.mysqlmybatis.entity.StudentEntity;
import com.summer.mysqlmybatis.service.StudentService;
import com.summer.mysqlmybatis.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 类描述
 *
 * @author wenjunpu
 * @Date 2022/06/09/14:27
 * @Description
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    StudentServiceImpl studentServiceImpl;

    @Autowired
    StudentService studentService;

    @GetMapping("/findAll")
    public List<StudentEntity> findAll(){
        return studentServiceImpl.list();
    }

    @GetMapping("/findById/{id}")
    public StudentEntity findById(@PathVariable Integer id){
        return studentServiceImpl.getBaseMapper().findById(id);
    }
}
