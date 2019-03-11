package com.qf.dao;

import com.qf.pojo.TUserFans;

public interface TUserFansMapper {
    int deleteByPrimaryKey(Integer fanId);

    int insert(TUserFans record);

    int insertSelective(TUserFans record);

    TUserFans selectByPrimaryKey(Integer fanId);

    int updateByPrimaryKeySelective(TUserFans record);

    int updateByPrimaryKey(TUserFans record);
}