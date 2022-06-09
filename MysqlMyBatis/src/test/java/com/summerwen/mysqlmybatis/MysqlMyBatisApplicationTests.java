package com.summerwen.mysqlmybatis;

import com.alibaba.fastjson.JSONObject;
import com.summerwen.mysqlmybatis.entity.StudentEntity;
import com.summerwen.mysqlmybatis.mapper.StudentMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class MysqlMyBatisApplicationTests {

    @Autowired
    StudentMapper studentMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void selectById(){
        StudentEntity student = studentMapper.getById(1);
        log.info(JSONObject.toJSONString(student));
    }
}
