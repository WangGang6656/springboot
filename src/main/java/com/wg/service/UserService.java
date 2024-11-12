package com.wg.service;


import com.wg.entity.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    List<User> getAll();

    User getUserById(Long uid);

    int save(Map<String, Object> map);
}
