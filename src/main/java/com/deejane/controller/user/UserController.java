package com.deejane.controller.user;

import com.deejane.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/getName")
    public String getUserName(@RequestParam String loginName) {
        String userName = userService.getUserNameByLoginName(loginName);
        return userName;
    }
}
