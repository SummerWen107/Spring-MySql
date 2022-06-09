package com.summer.mysqlmybatis;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.summer.mysqlmybatis.entity.StudentEntity;
import com.summer.mysqlmybatis.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@SpringBootTest
@Slf4j
class MysqlMyBatisServiceTest {

    @Autowired
    StudentService studentService;

    @Test
    void contextLoads() {
    }

    /**
     * 根据单个ID查询
     */
    @Test
    void selectById(){
        StudentEntity student = studentService.getById(1);
        log.info(JSONObject.toJSONString(student));
    }

    /**
     * 根据多个ID查询
     */
    @Test
    void selectByIds(){
        List<Integer> ids = Arrays.asList(1, 2);
        List<StudentEntity> studentEntities = studentService.listByIds(ids);
        log.info(JSONObject.toJSONString(studentEntities));
    }

    /**
     * 根据map参数查询
     * SELECT id,name,age FROM student WHERE name = ? AND id = ?
     */
    @Test
    void selectByMap() {
        HashMap<String, Object> params = new HashMap<>();
        params.put("id",1);
        params.put("name","张三");
        List<StudentEntity> entityList = studentService.listByMap(params);
        log.info(JSONObject.toJSONString(entityList));
    }

    /**
     * 使用 wrapper 构造器进行查询
     * like
     */
    @Test
    void selectByWrapperOne() {
        QueryWrapper<StudentEntity> wrapper = new QueryWrapper<>();
        //小于
        wrapper.like("name","张").lt("age",30);
        //小于等于
        //wrapper.like("name","张").le("age",30);
        List<StudentEntity> entityList = studentService.list(wrapper);
        log.info(JSONObject.toJSONString(entityList));
    }

    @Test
    void selectByWrapperTwo() {
        QueryWrapper<StudentEntity> wrapper = new QueryWrapper<>();
        //小于
        wrapper.like("name","张").between("age",20,50);
        List<StudentEntity> entityList = studentService.list(wrapper);
        log.info(JSONObject.toJSONString(entityList));
    }






}
