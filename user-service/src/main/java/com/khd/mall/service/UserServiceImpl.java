package com.khd.mall.service;

import com.khd.mall.model.User;
import org.apache.dubbo.config.annotation.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User findUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setUsername("khd");
        return user;
    }
}
