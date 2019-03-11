package com.qf.dao;

import com.qf.pojo.TImgKeep;

public interface TImgKeepMapper {
    int deleteByPrimaryKey(Integer keepId);

    int insert(TImgKeep record);

    int insertSelective(TImgKeep record);

    TImgKeep selectByPrimaryKey(Integer keepId);

    int updateByPrimaryKeySelective(TImgKeep record);

    int updateByPrimaryKey(TImgKeep record);
}