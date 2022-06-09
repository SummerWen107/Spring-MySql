package com.summer.mysqlmybatis.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.summer.mysqlmybatis.entity.StudentEntity;
import com.summer.mysqlmybatis.service.StudentService;
import com.summer.mysqlmybatis.mapper.StudentMapper;
import org.springframework.stereotype.Service;

/**
* @author SummerWen
* @description 针对表【student】的数据库操作Service实现
* @createDate 2022-06-09 14:26:21
*/
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, StudentEntity>
    implements StudentService{
}




