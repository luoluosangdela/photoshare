package com.qf.dao;

import com.qf.pojo.TImgLike;

public interface TImgLikeMapper {
    int deleteByPrimaryKey(Integer liId);

    int insert(TImgLike record);

    int insertSelective(TImgLike record);

    TImgLike selectByPrimaryKey(Integer liId);

    int updateByPrimaryKeySelective(TImgLike record);

    int updateByPrimaryKey(TImgLike record);
}