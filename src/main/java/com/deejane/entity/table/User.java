package com.deejane.entity.table;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    /**用户id*/
    private String id;
    /**登录账号*/
    private String loginName;
    /**密码*/
    private String password;
    /**用户名*/
    private String userName;
    /**用户状态*/
    private String userStatus;
}
