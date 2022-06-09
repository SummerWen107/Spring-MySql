package com.summerwen.mysqlmybatis.mapper;

import com.summerwen.mysqlmybatis.entity.StudentEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author SummerWen
* @description 针对表【student】的数据库操作Mapper
* @createDate 2022-06-09 16:39:56
* @Entity com.summerwen.mysqlmybatis.entity.StudentEntity
*/
@Mapper
public interface StudentMapper {

    StudentEntity getById(@Param("id") int id);

    List<StudentEntity> list();
}




