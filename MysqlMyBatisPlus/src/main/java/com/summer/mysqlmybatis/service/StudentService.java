package com.summer.mysqlmybatis.service;

import com.summer.mysqlmybatis.entity.StudentEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
* @author SummerWen
* @description 针对表【student】的数据库操作Service
* @createDate 2022-06-09 14:26:21
*/
public interface StudentService extends IService<StudentEntity> {

}
