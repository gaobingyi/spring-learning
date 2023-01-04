package com.gaoby.springmybatis.dao;

import com.gaoby.springmybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {

    User selectById(Integer id);

}
