package com.wg.service.impl;


import com.wg.dao.UserMapper;
import com.wg.entity.User;
import com.wg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAll() {
        List<User>  userList=userMapper.getAll();
        return userList;
    }

    @Override
    public User getUserById(Long uid) {
        User u=userMapper.getById(uid);
        return u;
    }

    @Override
    public int save(Map<String, Object> map) {
        return 0;
    }
}
