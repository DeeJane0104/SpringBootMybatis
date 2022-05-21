package com.deejane.service.user;

import com.deejane.entity.table.User;
import com.deejane.mapper.user.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserMapper userMapper;

    @Autowired
    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public String getUserNameByLoginName(String loginName) {
        User user = userMapper.queryUserByLoginName(loginName);
        return Optional.ofNullable(user).map(User::getUserName).orElse("");
    }
}
