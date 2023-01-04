package com.gaoby.springmybatis.controller;

import com.gaoby.springmybatis.entity.User;
import com.gaoby.springmybatis.dao.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/getById")
    public ResponseEntity<User> getById(@RequestParam("id") Integer id) {
        User user = userMapper.selectById(id);
        log.info("User: {}", user);
        return ResponseEntity.ok(userMapper.selectById(id));
    }

}
