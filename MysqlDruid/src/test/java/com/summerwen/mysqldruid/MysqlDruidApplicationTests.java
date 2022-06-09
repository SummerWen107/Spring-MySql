package com.summerwen.mysqldruid;

import com.alibaba.fastjson.JSONObject;
import com.summerwen.common.domain.Student;
import lombok.extern.slf4j.Slf4j;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@SpringBootTest
@Slf4j
class MysqlDruidApplicationTests {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    void contextLoads() {
    }
    @Test
    void RunJdbc(){
        String sql = "select * from student";
        List<Map<String, Object>> studentMaps = jdbcTemplate.queryForList(sql);
        for (Map<String, Object> student : studentMaps) {
            log.info(JSONObject.toJSONString(student));
        }
        log.info("====================================================");
        sql = "select name from student";
        //第二个参数只能传基本数据类型elementType
        List<String> names = jdbcTemplate.queryForList(sql, String.class);
        for (String name : names) {
            log.info(name);
        }

        //返回自定义Bean对象集合
        sql = "select * from student";
        List<Student> studentList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Student.class));
        log.info("====================================================");
        studentList.forEach(student -> log.info(JSONObject.toJSONString(student)));


        //返回自定义映射对象
        List<Student> studentList1 = jdbcTemplate.query(sql, new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet resultSet, int i) throws SQLException {
                Student student = new Student();
                student.setId(resultSet.getInt("id"));
                student.setName(resultSet.getString("name"));
                return student;
            }
        });
        log.info("====================================================");
        studentList1.forEach(student -> log.info(JSONObject.toJSONString(student)));

    }
}
