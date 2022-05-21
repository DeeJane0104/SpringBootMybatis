package com.deejane.mapper.user;

import com.deejane.entity.table.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("select user_name userName from sm_user where login_name = #{loginName}")
    User queryUserByLoginName(String loginName);
}
