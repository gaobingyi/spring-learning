package com.gaoby.springmybatis;

import com.gaoby.springmybatis.dao.UserMapper;
import com.gaoby.springmybatis.entity.User;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @see <a href="https://mybatis.org/spring-boot-starter/mybatis-spring-boot-test-autoconfigure/zh/index.html">
 *     MyBatis-Spring-Boot-Starter-Test</a>
 */
@RunWith(SpringRunner.class)
@MybatisTest
class SpringMybatisApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        User user = userMapper.selectById(1);
        Assertions.assertThat(user).isNotNull();
        Assertions.assertThat(user.getUsername()).isEqualTo("gaobingyi");
        Assertions.assertThat(user.getPassword()).isEqualTo("123456");
    }

}
