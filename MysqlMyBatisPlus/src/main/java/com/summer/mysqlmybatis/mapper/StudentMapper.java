package com.summer.mysqlmybatis.mapper;

import com.summer.mysqlmybatis.entity.StudentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
* @author SummerWen
* @description 针对表【student】的数据库操作Mapper
* @createDate 2022-06-09 14:26:21
* @Entity com.summer.mysqlmybatis.entity.StudentEntity
*/
@Mapper
public interface StudentMapper extends BaseMapper<StudentEntity> {


    StudentEntity findById(@Param("id")Integer id);
}




