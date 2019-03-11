package com.qf.dao;

import com.qf.pojo.TUser;

public interface TUserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(TUser record);

    int insertSelective(TUser record);

    TUser selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);

    TUser findUserByName(String username);
}