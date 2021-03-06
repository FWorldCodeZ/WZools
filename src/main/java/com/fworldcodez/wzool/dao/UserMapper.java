package com.fworldcodez.wzool.dao;

import com.fworldcodez.wzool.dto.UserDto;
import com.fworldcodez.wzool.pojo.User;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSeUserlective(User record);

    /**
     * 登陆
     */
    List<User> login(UserDto userDto);

    /**
     * 通过用户名查找id
     */
    Integer selectByName(String userName);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}