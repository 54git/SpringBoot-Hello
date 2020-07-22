package cn.ruiyeclub.service.impl;

import cn.ruiyeclub.mapper.UserMapper;
import cn.ruiyeclub.pojo.User;
import cn.ruiyeclub.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Ray。
 * @create 2020-03-11 21:19
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryUserByName(String name) {
        return userMapper.queryUserByName(name);
    }
}