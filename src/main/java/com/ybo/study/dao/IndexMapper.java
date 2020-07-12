package com.ybo.study.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface IndexMapper {

    @Select(" select count(*) from testDb ")
    int selectDb();
}
