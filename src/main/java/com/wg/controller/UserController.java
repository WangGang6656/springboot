package com.wg.controller;

import com.wg.common.Result;
import com.wg.dao.UserMapper;
import com.wg.entity.User;
import com.wg.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Api(tags = "用户管理")
@RestController
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    @ApiOperation("查询所有用户")
    @GetMapping("/getAll")
    public Result getAllList() {
        List<User> ulist = userMapper.getAll();
        System.out.println("ulist=" + ulist);
        return Result.ok(ulist);
    }

    @ApiOperation("根据id查询")
    @GetMapping("/user/{id}")
    public Result getUserById(@PathVariable("id") Long uid) {
        System.out.println("uid" + uid);
        User u = userMapper.getById(uid);
        return Result.ok(u);
    }

    @ApiOperation("新增")
    @PostMapping("/save")
    public Result saveUser() {
        Map<String, Object> map = new HashMap<>();
        map.put("username", "userName" + UUID.randomUUID().toString().replaceAll("-", ""));
        map.put("nickName", "nick" + UUID.randomUUID().toString().replaceAll("-", ""));
        map.put("sex", new Random().nextInt(10) % 2 == 1 ? "man" : "woman");
        System.out.println("map=" + map);
        int rest = userMapper.save(map);
        return Result.ok();
    }

    @ApiOperation("更新")
    @PutMapping("/update")
    public String updateUser() {
        Map<String, Object> map = new HashMap<>();
        map.put("username", "userName" + UUID.randomUUID().toString().replaceAll("-", ""));
        map.put("nickName", "nick" + UUID.randomUUID().toString().replaceAll("-", ""));
        map.put("id", new Random().nextInt(5));
        System.out.println("map=" + map);
        int rest = userMapper.update(map);
        return rest == 1 ? "成功" + map : "失败";
    }


    @ApiOperation("删除")
    @DeleteMapping("/del/{id}")
    public String delUser(@PathVariable("id") Long id) throws Exception {
        int rest = userMapper.delete(id);
        return rest == 1 ? "成功" : "失败";
    }
}
