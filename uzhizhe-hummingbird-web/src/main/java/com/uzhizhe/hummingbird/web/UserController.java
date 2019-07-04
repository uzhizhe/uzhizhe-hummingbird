package com.uzhizhe.hummingbird.web;

import com.alibaba.fastjson.JSON;
import com.uzhizhe.api.entities.User;
import com.uzhizhe.hummingbird.logger.annotations.SysLogger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Random;

/**
 * @author qingjiang.li
 * @since 2019-07-03 1:38 PM
 */
@Slf4j
@RestController
public class UserController {

    @SysLogger("用户")
    @GetMapping(value = "/users/{id}", produces = "application/json;charset=UTF-8")
    public User findOne(@PathVariable Integer id) {

        return new User(id, "name" + id, new Date());
    }

    @SysLogger("用户")
    @PostMapping(value = "/users", produces = "application/json;charset=UTF-8")
    public User add(@RequestBody User user) {
        log.info("user  info:{}", JSON.toJSONString(user));

        //return user.setId(new Random().nextInt(100)+100).setCreateTime(new Date());
        return new User(new Random().nextInt(100) + 100, user.getName(), new Date());
    }

}
